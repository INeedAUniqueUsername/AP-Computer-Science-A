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

public class Alien extends GameObject {
	boolean firing = false;
	GameObject target = null;
	public static final int WIDTH = 35;
	public static final int HEIGHT = 40;
	private int tick = 0;
	public int getWidth() {
		return WIDTH;
	}
	public int getHeight() {
		return HEIGHT;
	}
	public Alien() {
		this(0, 0);
	}

	public Alien(int x, int y) {
		this(x, y, 0);
	}

	public Alien(int x, int y, int s) {
		super(x, y);
		setSpeed(s);
		setDirection("RIGHT");
		try {
			setImage(ImageIO.read(new File("src\\Unit17\\Assignments\\alien.png")));
		} catch (Exception e) {
			// feel free to do something here
		}
	}
	
	public String toString() {
		return String.format("%s\nSpeed: %d",super.toString(), getSpeed());
	}
	public void setTarget(GameObject o) {
		target = o;
	}
	public GameObject getTarget() {
		return target;
	}
	public void setFiring(boolean b) {
		firing = b;
	}
	public boolean getFiring() {
		return firing;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		String direction = getDirection();
		move(direction);
		tick++;
		
		int x = getX();
		int y = getY();
		
		if(target != null) {
			int x_target = target.getX();
			int y_target = target.getY();
			int diff_x = Math.abs(x - x_target);
			int diff_y = Math.abs(y - y_target);
			if(tick%60 == 0) {
				if(Math.random() < 0.1) {
					setDirection(y > y_target ? "UP" : "DOWN");
				} else {
					setDirection(x > x_target ? "LEFT" : "RIGHT");
				}
			}
			if(tick%15 == 0) {
				setFiring(diff_x < 20);
			}
			/*
			switch(direction) {
			case "LEFT":
				if(getX() < 0) {
					setDirection("DOWN");
				}
				break;
			case "RIGHT":
				if(getX() + getWidth() > StarFighter.WIDTH) {
					setDirection("DOWN");
				}
				break;
			case "DOWN":
				setDirection(getX() < 0 ? "RIGHT" : "LEFT");
				break;
			}
			*/
		} else {
			setDirection("DOWN");
		}
		
		checkBounds();
	}
}
