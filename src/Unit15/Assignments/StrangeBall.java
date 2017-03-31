package Unit15.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class StrangeBall extends Ball
{

   //instance variables

	public StrangeBall() {
		super();
	}

	public StrangeBall(int x, int y) {
		super(x, y);
	}

	public StrangeBall(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
	}

	public StrangeBall(int x, int y, int wid, int ht, int xSpd, int ySpd) {
		super(x, y, wid, ht, new Color(0), xSpd, ySpd);
	}

	public StrangeBall(int x, int y, int wid, int ht, Color col, int xSpd,
			int ySpd) {
		super(x, y, wid, ht, col, xSpd, ySpd);
	}
	public void collide() {
		setVelX((int) ((getVelX() > 0 ? 1 : -1) * ((Math.random() * 5) + 1)));
		setVelY((int) ((getVelY() > 0 ? 1 : -1) * ((Math.random() * 5) + 1)));
	}
}

