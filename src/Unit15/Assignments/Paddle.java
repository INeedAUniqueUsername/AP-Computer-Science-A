package Unit15.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
	//instance variables
	private int speed;
	
	public Paddle()
	{
		this(10,10);
	}
	public Paddle(int x, int y) {
		this(x, y, 10, 10);
	}
	public Paddle(int x, int y, int s) {
		this(x, y);
		setSpeed(s);
	}
	public Paddle(int x, int y, int w, int h) {
		this(x, y, w, h, new Color(0));
	}
	public Paddle(int x, int y, int w, int h, int s) {
		this(x, y, w, h);
		setSpeed(s);
	}
	public Paddle(int x, int y, int w, int h, Color c) {
		this(x, y, w, h, c, 5);
	}
	public Paddle(int x, int y, int w, int h, Color c, int s) {
		super(x, y, w, h, c);
		setSpeed(s);
	}
	public void setSpeed(int s) {
		speed = s;
	}
	public int getSpeed() {
		return speed;
	}
	public void moveUpAndDraw(Graphics g)
	{
		setY(getY() - speed);
		draw(g);
	}
	
	public void moveDownAndDraw(Graphics g)
	{
		setY(getY() + speed);
		draw(g);
	}
	public void draw(Graphics g) {
		g.drawRect(getX(), getY(), getWidth(), getHeight());
	}
	public String toString() {
		return String.format("%s %d", super.toString(), speed);
	}
}