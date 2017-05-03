package Unit17.Assignments;

import java.awt.Graphics;
import java.awt.Image;

public abstract class GameObject extends Movable {
	private boolean active;
	private String direction = "";
	private int speed;
	private Image image;
	public GameObject(int x, int y) {
		super(x, y);
		setActive(true);
	}
	public void setActive(boolean b) {
		active = b;
	}
	public boolean getActive() {
		return active;
	}
	public void setSpeed(int s)
	{
	   speed = s;
	}
	public int getSpeed()
	{
	   return speed;
	}
	public abstract int getWidth();
	public abstract int getHeight();
	public void setImage(Image i) {
		image = i;
	};
	public Image getImage() {
		return image;
	};
	public String getDirection() {
		return direction;
	}
	public void setDirection(String d) {
		direction = d;
	}
	public abstract void update();
	public void draw(Graphics g) {
		g.drawImage(getImage(), getX(), getY(), getWidth(), getHeight(), null);
	}
	public void move() {
		super.move(getDirection());
	}
	public static boolean collision(GameObject a, GameObject b) {
		int a_x = a.getX();
		int a_y = a.getY();
		int a_width = a.getWidth();
		int a_height = a.getHeight();
		
		int b_x = b.getX();
		int b_y = b.getY();
		int b_width = b.getWidth();
		int b_height = b.getHeight();
		
		//Check if the two are close enough to collide with each other
		if(Math.abs(a_x - b_x) > a_width + b_width || Math.abs(a_y - b_y) > a_height + b_height) {
			return false;
		}
		
		int a_x2 = a.getX() + a_width;
		int a_y2 = a.getY() + a_height;
		
		int b_x2 = b.getX() + b_width;
		int b_y2 = b.getY() + b_height;
		
		return ((a_x < b_x && a_x2 > b_x) || (a_x > b_x && a_x2 < b_x2) || (a_x < b_x2 && a_x2 > b_x2)) &&
		((a_y < b_y && a_y2 > b_y) || (a_y > b_y && a_y2 < b_y2) ||(a_y < b_y2 && a_y2 > b_y2));
	}
	public void checkBounds() {
		int x = getX();
		int width = getWidth();
		int x2 = x + width;
		int x_bound = StarFighter.WIDTH;
		
		if(x < 0) {
			setX(x_bound - width);
		} else if(x2 > x_bound) {
			setX(0);
		}
		/*
		int y = getY();
		int height = getHeight();
		int y2 = y + height;
		int y_bound = StarFighter.HEIGHT;
		
		if(y < 0) {
			setY(0);
		} else if(y2 > y_bound) {
			setY(y_bound - height);
		}
		*/
	}
}
