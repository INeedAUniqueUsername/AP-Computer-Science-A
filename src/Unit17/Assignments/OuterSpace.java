package Unit17.Assignments;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import static java.lang.Character.*;

import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private static Ship ship;
	AlienHorde horde;
	List<Ammo> fire_player;
	List<Ammo> fire_alien;

	private boolean[] keys;
	private BufferedImage back;
	
	int tick = 0;
	
	private boolean waitForNextWave;
	private NextWaveText text;
	private int waveNumber = 0;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other stuff
		ship = new Ship(500, 500, 4);
		horde = new AlienHorde(2);
		fire_player = new ArrayList<Ammo>();
		fire_alien = new ArrayList<Ammo>();
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
		
		waitForNextWave = true;
		text = new NextWaveText("Wave 1");
	}
	public static Ship getPlayer() {
		return ship;
	}
	public void update(Graphics window)
	{
		tick++;
		paint(window);
	}

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
			back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,StarFighter.WIDTH,StarFighter.HEIGHT);

		ship.draw(graphToBack);
		for(Alien a : horde.getAliens()) {
			a.draw(graphToBack);
		}
		for(Ammo a : fire_player) {
			a.draw(graphToBack);
		}
		for(Ammo a : fire_alien) {
			a.draw(graphToBack);
		}
		
		if(waitForNextWave) {
			text.draw(graphToBack);
			if(tick == 480) {
				waitForNextWave = false;
				horde = new AlienHorde(waveNumber * 3);
			}
			twoDGraph.drawImage(back, null, 0, 0);
			return;
		}
		twoDGraph.drawImage(back, null, 0, 0);
		
		if(keys[0])
		{
			ship.setDirection("LEFT");
		}
		else if(keys[1]) {
			ship.setDirection("RIGHT");
		}
		else if(keys[2]) {
			ship.setDirection("UP");
		}
		else if(keys[3]) {
			ship.setDirection("DOWN");
		}
		else {
			ship.setDirection("");
		}
		ship.move();
		ship.checkBounds();
		if(keys[4]) {
			if(tick%45 == 0) {
				Ammo a = new Ammo(ship.getX() + ship.getWidth()/2, ship.getY()-7, 8);
				a.setDirection("UP");
				fire_player.add(a);
			}
		}
		List<Alien> aliens = horde.getAliens();
		
		aliens.removeIf((Alien alien) -> {
			alien.update();
			alien.checkBounds();
			if(alien.getFiring() && tick%25 == 0 && Math.random() < 0.4) {
				Ammo a = new Ammo(alien.getX() + alien.getWidth()/2, alien.getY()+alien.getHeight()+18, 4);
				a.setDirection("DOWN");
				fire_alien.add(a);
			}
			if(GameObject.collision(alien, ship)) {
				ship.setStructure(ship.getStructure()-1);
				alien.setActive(false);
			}
			return !alien.getActive();
		});
		
		horde.removeDeadOnes(fire_player);
		
		fire_player.removeIf((Ammo a) -> {
			a.move(a.getDirection());
			if(a.getY() < 0) {
				a.setActive(false);
			}
			return !a.getActive();
		});
		
		fire_alien.removeIf((Ammo a) -> {
			a.move(a.getDirection());
			if(a.getY() > StarFighter.HEIGHT) {
				a.setActive(false);
			}
			if(GameObject.collision(a, ship)) {
				ship.setStructure(ship.getStructure()-1);
				a.setActive(false);
			}
			return !a.getActive();
		});
		
		if(ship.getStructure() < 1) {
			for(Alien a : horde.getAliens()) {
				a.setFiring(true);
			}
			ship.setSpeed(0);
			ship.setY(-100);
		}
		if(aliens.size() == 0) {
			tick = 0;
			waitForNextWave = true;
			waveNumber++;
			text = new NextWaveText("Wave " + waveNumber);
		}
	}


	public void keyPressed(KeyEvent e)
	{
		setKeyState(e, true);
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		setKeyState(e, false);
		repaint();
	}
	public void setKeyState(KeyEvent e, boolean state) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_LEFT:	keys[0] = state;	break;
		case KeyEvent.VK_RIGHT:	keys[1] = state;	break;
		case KeyEvent.VK_UP:	keys[2] = state;	break;
		case KeyEvent.VK_DOWN:	keys[3] = state;	break;
		case KeyEvent.VK_SPACE:	keys[4] = state;	break;
		}
	}

	public void keyTyped(KeyEvent e)
	{

	}

	public void run()
	{
		try
		{
			while(true)
			{
				Thread.currentThread().sleep(10);
				repaint();
			}
		}catch(Exception e)
		{
		}
  	}
}

