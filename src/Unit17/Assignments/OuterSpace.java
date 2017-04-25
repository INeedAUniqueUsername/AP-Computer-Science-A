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

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;

	/* uncomment once you are ready for this part
	 *
	private ArrayList<Alien> aliens;
	private ArrayList<Ammo> shots;
	*/

	private boolean[] keys;
	private BufferedImage back;
	
	int tick;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other stuff
		ship = new Ship(500, 500, 1);
		alienOne = new Alien(50, 50, 1);
		alienTwo = new Alien(100, 50, 2);
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
			ship.move("LEFT");
		}
		if(keys[1]) {
			ship.move("RIGHT");
		}
		if(keys[2]) {
			ship.move("UP");
		}
		if(keys[3]) {
			ship.move("DOWN");
		}
		if(keys[4]) {
		}
		for(Alien alien: new Alien[]{alienOne, alienTwo}) {
			String direction = alien.getDirection();
			alien.move(direction);
			if(tick%15 == 0) {
				switch(direction) {
				case "LEFT":
					if(alien.getX() < 0) {
						alien.setDirection("DOWN");
					}
					break;
				case "RIGHT":
					if(alien.getX() + 50 > StarFighter.WIDTH) {
						alien.setDirection("DOWN");
					}
					break;
				case "DOWN":
					alien.setDirection(alien.getX() < 0 ? "RIGHT" : "LEFT");
					break;
				}
			}
		}
		
		for(MovingThing m : new MovingThing[]{ship, alienOne, alienTwo}) {
			m.draw(graphToBack);
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

