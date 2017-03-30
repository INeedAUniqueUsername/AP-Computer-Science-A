package Unit15.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

import Misc.Alex;

public class Ball extends Block implements Collidable
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
	public void incVelX(int x) {
		vel_x += x;
	}
	public int getVelX() {
		return vel_x;
	}
	public void setVelY(int y) {
		vel_y = y;
	}
	public void incVelY(int y) {
		vel_y += y;
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
	//Check if the ball's vertical position allows it to collide horizontally with another object
	public boolean checkHorizontalAlignment(Block b) {
		int top = getY() + getVelY();
		int bottom = top + getHeight();
		int top_b = b.getY();
		int bottom_b = top_b + b.getHeight();
		boolean result = (top >= top_b && top <= bottom_b) || //Top edge
				(bottom >= top_b && bottom <= bottom_b) || //Bottom edge
				(top <= top_b && bottom >= bottom_b); //Both edges
		if(result)TheGame.print("Horizontal Alignment");
		return	result; //Bottom edge
	}
	//Check if the ball's horizontal position allows it to collide vertically with another object
	public boolean checkVerticalAlignment(Block b) {
		int left = getX() + getVelX();
		int right = left + getWidth();
		int left_b = b.getX();
		int right_b = left_b + b.getWidth();
		boolean result = (left >= left_b && left <= right_b) || //Left edge
				(right >= left_b && right <= right_b) || //Right edge
				(left <= left_b && right >= right_b); //Both edges
		if(result)TheGame.print("Vertical Alignment");
		return	result; //Right edge
	}
	@Override
	public boolean didCollideLeft(Object obj) {
		if(obj instanceof Block) {
			Block b = (Block) obj;
			int left = getX() + getVelX();
			int right = left + getWidth();
			int left_b = b.getX();
			int right_b = left_b + b.getWidth();
			boolean result = left <= right_b && right >= right_b && checkHorizontalAlignment(b);
			if(result)TheGame.print("Left Collision");
			return	result; //Left edge collision
		}
		return false;
	}
	@Override
	public boolean didCollideRight(Object obj) {
		if(obj instanceof Block) {
			Block b = (Block) obj;
			int left = getX() + getVelX();
			int right = left + getWidth();
			int left_b = b.getX();
			//int right_b = left_b + b.getWidth();
			boolean result = right >= left_b && left <= left_b && checkHorizontalAlignment(b);
			if(result)TheGame.print("Right Collision");
			return	result; //Right edge collision
		}
		return false;
	}
	@Override
	public boolean didCollideTop(Object obj) {
		if(obj instanceof Block) {
			Block b = (Block) obj;
			int top = getY() + getVelY();
			int bottom = top + getHeight();
			int top_b = b.getY();
			//int bottom_b = top_b + b.getHeight();
			boolean result = top <= top_b && bottom >= top_b && checkVerticalAlignment(b);
			if(result)TheGame.print("Top Collision: ");
			return	result; //Top edge collision
		}
		return false;
	}
	@Override
	public boolean didCollideBottom(Object obj) {
		if(obj instanceof Block) {
			Block b = (Block) obj;
			int top = getY() + getVelY();
			int bottom = top + getHeight();
			int top_b = b.getY();
			int bottom_b = top_b + b.getHeight();
			boolean result = top <= bottom_b && bottom >= bottom_b && checkVerticalAlignment(b); 
			if(result)TheGame.print("Bottom Collision");
			return	result; //Bottom edge collision
		}
		return false;
	}
	public void collideHorizontal() {
		setVelX(-getVelX());
		collide();
	}
	public void collideVertical() {
		setVelY(-getVelY());
		collide();
	}
	public void collide() {
		
	}
}