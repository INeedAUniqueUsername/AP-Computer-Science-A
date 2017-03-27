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
import java.awt.event.ActionListener;

class BallTestTwo extends Canvas implements Runnable
{
	private Ball ball;

	public BallTestTwo()
	{
		setBackground(Color.WHITE);
		setVisible(true);

		//instantiate a new Ball
		//ball = new Ball();
		ball = new Ball(300, 20);
		//ball = new Ball(0, 0, 10, 20);
		//ball = new Ball(0, 0, 10, 20, new Color(50, 255, 50));
		//ball = new Ball(0, 0, 10, 20, new Color(255, 50, 50), 10, 30);
		new Thread(this).start();
	}
	
	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		window.clearRect(0, 0, getWidth(), getHeight());
		ball.moveAndDraw(window);

		if(!(ball.getX()>=0 && ball.getX()+ball.getWidth()<=getWidth()))
		{
			ball.setVelX(-ball.getVelX());
		}

		if(!(ball.getY()>=0 && ball.getY()+ball.getHeight()<=getHeight()))
		{
			ball.setVelY(-ball.getVelY());
		}
	}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(19);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}