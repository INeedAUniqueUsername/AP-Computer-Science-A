package Unit15.Assignments;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import Misc.Alex;

class BlinkyBall extends Ball {

	// constructors
	public BlinkyBall() {
		super();
	}

	public BlinkyBall(int x, int y) {
		super(x, y);
	}

	public BlinkyBall(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
	}

	public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd) {
		super(x, y, wid, ht, new Color(0), xSpd, ySpd);
	}

	public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd,
			int ySpd) {
		super(x, y, wid, ht, col, xSpd, ySpd);
	}

	@Override
	public void update() {
		super.update();
		setColor(new Color(colorWave(getX()), colorWave(getY()),
				colorWave(getX() + getY())));
	}

	public int colorWave(int input) {
		return Alex.triangle(input, 255);
	}
}