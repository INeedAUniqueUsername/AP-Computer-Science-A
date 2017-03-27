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

public class PaddleTestTwo extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle, rightPaddle;
	private boolean[] keys;		//keeps track of what keys are pressed

	public PaddleTestTwo()
	{
		//set up all game variables
		//instantiate a Ball
		ball = new Ball();
		leftPaddle = new Paddle(10, 50);
		rightPaddle = new Paddle(200, 50);
		keys = new boolean[5];
		
		//set up the Canvas
		setBackground(Color.WHITE);
		setVisible(true);

		this.addKeyListener(this);
		new Thread(this).start();
	}
	
	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.WHITE);
		//g.fillRect(0, 0, Tester.WIDTH, Tester.HEIGHT);
		g.clearRect(0, 0, getWidth(), getHeight());
		ball.moveAndDraw(g);
		leftPaddle.draw(g);

		if(!(ball.getX()>=0 && ball.getX()+ball.getWidth()<=getWidth()))
		{
			ball.setVelX(-ball.getVelX());
		}

		if(!(ball.getY()>=0 && ball.getY()+ball.getHeight()<=getHeight()))
		{
			ball.setVelY(-ball.getVelY());
		}

		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(g);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(g);
		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(g);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(g);
		}
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

	public void keyTyped(KeyEvent e)
	{
		//no code needed here
	}
	
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