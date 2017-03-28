package Unit15.Assignments;


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

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;


	public Pong()
	{
		//set up all variables related to the game
		
		keys = new boolean[4];
		
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics g)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D g2D = (Graphics2D)g;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics gBack = back.createGraphics();


		ball.moveAndDraw(gBack);
		leftPaddle.draw(gBack);
		rightPaddle.draw(gBack);


		/*
		if(!(ball.getX()>=10 && ball.getX()<=780))
		{
			ball.setVelX(0);
			ball.setVelY(0);
		}
		*/

		//see if ball hits left wall or right wall
		if(ball.getX() < 0 || ball.getX() > getWidth()) {
			//ball.collideHorizontal();
			ball.setVelX(0);
			ball.setVelY(0);
		}
		//see if the ball hits the top or bottom wall 
		if(ball.getY() < 0 || ball.getY() > getHeight()) {
			ball.collideVertical();
		}
		
		for(Block b : new Block[]{leftPaddle, rightPaddle}) {
			if(ball.didCollideLeft(b) || ball.didCollideRight(b)) {
				ball.collideHorizontal();
			} else if(ball.didCollideBottom(b) || ball.didCollideTop(b)) {
				ball.collideVertical();
			}
		}
		
		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(gBack);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(gBack);
		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(gBack);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(gBack);
		}
		g2D.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}