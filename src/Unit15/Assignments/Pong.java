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
	private boolean[] keys_debug;
	private BufferedImage back;

	public Pong()
	{
		//set up all variables related to the game
		
		ball = new Ball(400, 400, 90, 90, new Color(50, 50, 255), 1, 1);
		leftPaddle = new Paddle(10, 10, 10, 50);
		rightPaddle = new Paddle(760, 10, 10, 50);
		
		keys = new boolean[4];
		keys_debug = new boolean[5];
		
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

		gBack.clearRect(0, 0, getWidth(), getHeight());
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
		if(ball.getX() < 0 || ball.getX()+ball.getWidth() > getWidth()) {
			//ball.collideHorizontal();
			ball.setVelX(0);
			ball.setVelY(0);
		}
		//see if the ball hits the top or bottom wall 
		if(ball.getY() < 0 || ball.getY()+ball.getHeight() > getHeight()) {
			ball.collideVertical();
		}
		
		for(Block b : new Block[]{leftPaddle, rightPaddle}) {
			if(ball.didCollideRight(b) || ball.didCollideLeft(b)) {
				System.out.println("Ball -> Horizontal Collision -> Paddle");
				ball.collideHorizontal();
			} else if(ball.didCollideTop(b) || ball.didCollideBottom(b)) {
				System.out.println("Ball -> Vertical Collision -> Paddle");
				ball.collideVertical();
			}
			if(b.getY() < 0) {
				b.setY(0);
			} else if(b.getY() + b.getHeight() > getHeight()) {
				b.setY(getHeight() - b.getHeight());
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
		if(TheGame.DEBUG) {
			if(keys_debug[4]) {
				ball.setVelX(0);
				ball.setVelY(0);
			}
			if(keys_debug[0]) {
				ball.setVelY(ball.getVelY()-1);
			}
			if(keys_debug[1]) {
				ball.setVelY(ball.getVelY()+1);
			}
			if(keys_debug[2]) {
				ball.setVelX(ball.getVelX()-1);
			}
			if(keys_debug[3]) {
				ball.setVelX(ball.getVelX()+1);
			}
		}
			
		g2D.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		setKeyState(e.getKeyCode(), true);
	}

	public void keyReleased(KeyEvent e)
	{
		setKeyState(e.getKeyCode(), false);
	}

	public void setKeyState(int keyCode, boolean state) {
		switch(keyCode) {
		case KeyEvent.VK_W : keys[0] = state; break;
		case KeyEvent.VK_Z : keys[1] = state; break;
		case KeyEvent.VK_I : keys[2] = state; break;
		case KeyEvent.VK_M : keys[3] = state; break;
		case KeyEvent.VK_UP : keys_debug[0] = state; break;
		case KeyEvent.VK_DOWN : keys_debug[1] = state; break;
		case KeyEvent.VK_LEFT : keys_debug[2] = state; break;
		case KeyEvent.VK_RIGHT : keys_debug[3] = state; break;
		case KeyEvent.VK_ENTER : keys_debug[4] = state; break;
		}
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

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}	
}