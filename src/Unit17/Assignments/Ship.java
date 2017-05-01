package Unit17.Assignments;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class Ship extends GameObject {
	private int structure = 10;
	private static final int WIDTH = 35;
	private static final int HEIGHT = 50;
	public int getWidth() {
		return WIDTH;
	}
	public int getHeight() {
		return HEIGHT;
	}
	
	public Ship() {
		this(0, 0);
	}

	public Ship(int x, int y) {
		this(x, y, 0);
	}

	public Ship(int x, int y, int s) {
		super(x, y);
		setSpeed(s);
		try {
			setImage(ImageIO.read(new File("src\\Unit17\\Assignments\\ship.png")));
		} catch (Exception e) {
			// feel free to do something here
			System.out.println("Hey, look what I found!");
			System.out.println(e);
		}
	}
	
	public void setStructure(int s) {
		structure = s;
	}
	public int getStructure() {
		return structure;
	}
	
	public String toString() {
		return String.format("%s\nSpeed: %d", super.toString(), getSpeed());
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		checkBounds();
	}
}
