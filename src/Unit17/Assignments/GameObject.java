package Unit17.Assignments;

import java.awt.Graphics;
import java.awt.Image;

public abstract class GameObject extends Movable {
	private String direction = "";
	private int speed;
	private Image image;
	public GameObject(int x, int y) {
		super(x, y);
	}
	public void setSpeed(int s)
	{
	   speed = s;
	}
	public int getSpeed()
	{
	   return speed;
	}
	public int getWidth() {
		return image.getWidth(null);
	};
	public int getHeight() {
		return image.getHeight(null);
	};
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
	public static boolean collision(GameObject a, GameObject b) {
		int a_x = a.getX();
		int a_y = a.getY();
		int a_x2 = a.getX() + a.getWidth();
		int a_y2 = a.getY() + a.getHeight();
		
		int b_x = b.getX();
		int b_y = b.getY();
		int b_x2 = b.getX() + b.getWidth();
		int b_y2 = b.getY() + b.getHeight();
		return ((a_x < b_x && a_x2 > b_x) || (a_x > b_x && a_x2 < b_x2) || (a_x < b_x2 && a_x2 > b_x2)) &&
		((a_y < b_y && a_y2 > b_y) || (a_y > b_y && a_y2 < b_y2) ||(a_y < b_y2 && a_y2 > b_y2));
	}
	public void checkBounds() {
		/*
		int x = getX();
		int width = getWidth();
		int x2 = x + width;
		int x_bound = StarFighter.WIDTH;
		
		int y = getX();
		int height = getHeight();
		int y2 = x + height;
		int y_bound = StarFighter.HEIGHT;
		
		if(x < 0) {
			setX(0);
		} else if(x2 > x_bound) {
			setX(x_bound - width);
		}
		if(y < 0) {
			setY(0);
		} else if(y2 > y_bound) {
			setY(y_bound - height);
		}
		*/
	}
}
