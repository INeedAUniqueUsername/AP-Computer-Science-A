package Unit17.Assignments;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public abstract class MovingThing implements Locatable {
	private int xPos;
	private int yPos;

	public MovingThing() {
		this(0, 0);
	}

	public MovingThing(int x, int y) {
		setPos(x, y);
	}

	public void setPos(int x, int y) {
		setX(x);
		setY(y);
	}

	public void setX(int x) {
		xPos = x;
	}

	public void setY(int y) {
		yPos = y;
	}

	public int getX() {
		return xPos;
	}

	public int getY() {
		return yPos;
	}

	public abstract void setSpeed(int s);

	public abstract int getSpeed();

	public abstract void draw(Graphics window);

	public void move(String direction) {
		// add more code to complete the move method
		switch(direction) {
		case "LEFT":
			setX(getX() - getSpeed());
			break;
		}
	}

	public String toString() {
		return "";
	}
}