package Unit15.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Font;
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
import java.util.Arrays;
import java.util.List;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle paddle_left, paddle_right;
	private Wall wall_left, wall_right;
	private int score_left, score_right;
	private boolean[] keys;
	private boolean[] keys_debug;
	private ArrayList<Wall> walls;
	private BufferedImage back;

	public Pong()
	{
		//set up all variables related to the game
		int width = 780;
		int height = 560;
		ball = new InvisibleBall(width/2 + 200, height/2, 10, 10, new Color(50, 50, 255), 2, 4);
		paddle_left = new Paddle(40, 10, 10, 50);
		paddle_right = new Paddle(width-50, 10, 10, 50);
		wall_left = new Wall(0, 0, 10, height); //Left
		wall_right = new Wall(width-10, 0, 10, height); //Right
		walls = new ArrayList<Wall>(Arrays.asList(
				new Wall(0, 0, width, 10), //Top
				new Wall(0, height-10, width, 10), //Bottom
				wall_right,
				wall_left
				));
		/*
		for(int i = 0; i < 25; i++) {
			for(int j = 0; j < 30; j++) {
				walls.add(new Wall_Breakable(100 + i * 20, 10 + j * 20, 15, 15));
			}
		}
		for(int i = 0; i < 25; i++) {
			for(int j = 0; j < 10; j++) {
				walls.add(new Wall_Breakable(150 + i * 20, 20 + j * 50, 15, 15));
			}
		}
		*/
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
	public void update() {
		
	}
	public void paint(Graphics g)
	{
		update();
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
		
		gBack.setFont(new Font("Impact", 0, 48));
		gBack.drawString("" + score_left, 100, 225);
		gBack.drawString("" + score_right, 660, 225);
		
		ball.moveAndDraw(gBack);

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
		for(Block b : new Block[]{paddle_left, paddle_right}) {
			b.draw(gBack);
			checkCollision(ball, b);
			if(b.getY() < 0) {
				b.setY(0);
			} else if(b.getY() + b.getHeight() > getHeight()) {
				b.setY(getHeight() - b.getHeight());
			}
		}
		for(Block b : walls) {
			b.draw(gBack);
			checkCollision(ball, b);
		}
		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			paddle_left.moveUpAndDraw(gBack);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			paddle_left.moveDownAndDraw(gBack);
		}
		if(keys[2] == true)
		{
			paddle_right.moveUpAndDraw(gBack);
		}
		if(keys[3] == true)
		{
			paddle_right.moveDownAndDraw(gBack);
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
	public void checkCollision(Ball b1, Block b2) {
		boolean collision = false;
		
		if(b2 instanceof Wall_Breakable && !((Wall_Breakable) b2).getActive())
			return;
		if(b1.didCollideTop(b2) || b1.didCollideBottom(b2)) {
			System.out.println("Ball -> Vertical Collision -> " + b2.getClass().getName());
			b1.collideVertical();
			collision = true;
		}
		if(b1.didCollideRight(b2) || b1.didCollideLeft(b2)) {
			System.out.println("Ball -> Horizontal Collision -> " + b2.getClass().getName());
			b1.collideHorizontal();
			collision = true;
		}
		if(collision) {
			if(b2.equals(wall_left)) {
				score_right++;
			} else if(b2.equals(wall_right)) {
				score_left++;
			}
			if(b2 instanceof Wall_Breakable) {
				((Wall_Breakable) b2).destroy();
			}
		}
	}
	public void keyReleased(KeyEvent e)
	{
		setKeyState(e.getKeyCode(), false);
	}
	public void keyPressed(KeyEvent e){
		setKeyState(e.getKeyCode(), true);
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