package Unit15.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int vel_x;
	private int vel_y;

	public Ball()
	{
		this(200, 200);
	}
	public Ball(int x, int y) {
		this(x, y, 10, 10);
	}
	public Ball(int x, int y, int w, int h) {
		this(x, y, w, h, new Color(0));
	}
	public Ball(int x, int y, int w, int h, Color c) {
		this(x, y, w, h, c, 3, 1);
	}
	public Ball(int x, int y, int w, int h, Color c, int vx, int vy) {
		super(x, y, w, h, c);
		setVelX(vx);
		setVelY(vy);
	}
	public void setVelX(int x) {
		vel_x = x;
	}
	public int getVelX() {
		return vel_x;
	}
	public void setVelY(int y) {
		vel_y = y;
	}
	public int getVelY() {
		return vel_y;
	}
	public void moveAndDraw(Graphics g)
	{
		//draw a white ball at old ball location
		update();
		//draw the ball at its new location
		draw(g);
	}
	public void update() {
		setX(getX()+vel_x);
		setY(getY()+vel_y);
	}
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.drawRect(getX(), getY(), getWidth(), getHeight());
	}
	public boolean equals(Object obj)
	{
		if(obj instanceof Ball) {
			Ball b = (Ball) obj;
			return super.equals(obj) && vel_x == b.getVelX() && vel_y == b.getVelY();
		}
		return false;
	}
	public String toString() {
		return String.format("%s %d %d", super.toString(), vel_x, vel_y);
	}
}