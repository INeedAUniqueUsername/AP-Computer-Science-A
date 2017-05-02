package Unit17.Assignments;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class Ammo extends GameObject
{
	public static final int WIDTH = 4;
	public static final int HEIGHT = 10;
	public int getWidth() {
		return WIDTH;
	}
	public int getHeight() {
		return HEIGHT;
	}
	public Ammo()
	{
		this(0, 0);
	}

	public Ammo(int x, int y)
	{
		this(x, y, 0);
	}

	public Ammo(int x, int y, int s)
	{
		super(x, y);
		setSpeed(s);
	}

	public void draw( Graphics window )
	{
		//add code to draw the ammo
		window.setColor(Color.RED);
		window.drawRect(getX()-WIDTH/2, getY()-HEIGHT/2, WIDTH, HEIGHT);
	}

	public String toString()
	{
		return "";
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		moveInDirection();
	}
}
