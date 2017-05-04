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

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	AlienHorde horde;
	List<Ammo> fire_player;
	List<Ammo> fire_alien;

	private boolean[] keys;
	private BufferedImage back;
	
	int tick;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other stuff
		ship = new Ship(500, 500, 1);
		horde = new AlienHorde(40);
		for(Alien a : horde.getAliens()) {
			a.setTarget(ship);
		}
		fire_player = new ArrayList<Ammo>();
		fire_alien = new ArrayList<Ammo>();
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
		tick = 0;
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
		graphToBack.fillRect(0,0,800,600);

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
		ship.move(ship.getDirection());
		if(keys[4]) {
			if(tick%60 == 0) {
				Ammo a = new Ammo(ship.getX() + ship.getWidth()/2, ship.getY()-7, 3);
				a.setDirection("UP");
				fire_player.add(a);
			}
		}
		List<Alien> aliens = horde.getAliens();
		for(int i = 0; i < aliens.size();) {
			Alien alien = aliens.get(i);
			alien.update();
			if(alien.getFiring() && tick%25 == 0 && Math.random() < 0.4) {
				Ammo a = new Ammo(alien.getX() + alien.getWidth()/2, alien.getY()+alien.getHeight()+18, 2);
				a.setDirection("DOWN");
				fire_alien.add(a);
			}
			if(GameObject.collision(alien, ship)) {
				ship.setStructure(ship.getStructure()-1);
				aliens.remove(i);
			} else {
				i++;
			}
		}
		horde.removeDeadOnes(fire_player);
		for(int i = 0; i < fire_player.size();) {
			Ammo a = fire_player.get(i);
			a.move(a.getDirection());
			if(a.getY() < 0) {
				fire_player.remove(i);
			} else {
				i++;
			}
		}
		for(int i = 0; i < fire_alien.size();) {
			Ammo a = fire_alien.get(i);
			a.move(a.getDirection());
			if(a.getY() > StarFighter.HEIGHT) {
				fire_alien.remove(i);
				continue;
			}
			if(GameObject.collision(a, ship)) {
				ship.setStructure(ship.getStructure()-1);
				fire_alien.remove(i);
				continue;
			}
			i++;
		}
		
		if(ship.getStructure() < 1) {
			for(Alien a : horde.getAliens()) {
				a.setTarget(null);
				a.setFiring(true);
			}
			ship.setSpeed(0);
			ship.setY(-100);
		}
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
		twoDGraph.drawImage(back, null, 0, 0);
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
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

