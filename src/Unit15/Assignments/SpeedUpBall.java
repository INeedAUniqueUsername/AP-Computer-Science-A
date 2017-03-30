package Unit15.Assignments;


//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   //instance variables

	public SpeedUpBall() {
		super();
	}

	public SpeedUpBall(int x, int y) {
		super(x, y);
	}

	public SpeedUpBall(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
	}

	public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd) {
		super(x, y, wid, ht, new Color(0), xSpd, ySpd);
	}

	public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd,
			int ySpd) {
		super(x, y, wid, ht, col, xSpd, ySpd);
	}
	public void collide() {
		incVelX(getVelX() > 0 ? 1 : -1);
		incVelY(getVelY() > 0 ? 1 : -1);
	}
}

