package Unit15.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class InvisibleBall extends Ball
{
	boolean visible = true;
	int tick = 0;
	public InvisibleBall() {
		super();
	}

	public InvisibleBall(int x, int y) {
		super(x, y);
	}

	public InvisibleBall(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
	}

	public InvisibleBall(int x, int y, int wid, int ht, int xSpd, int ySpd) {
		super(x, y, wid, ht, new Color(0), xSpd, ySpd);
	}

	public InvisibleBall(int x, int y, int wid, int ht, Color col, int xSpd,
			int ySpd) {
		super(x, y, wid, ht, col, xSpd, ySpd);
	}
	public void update() {
		super.update();
		tick++;
		if(tick%15 == 0) {
			if(visible) {
				if(Math.random() < .25) {
					visible = false;
				}
			} else {
				if(Math.random() < .75) {
					visible = true;
				}
			}
		}
		
	}
	public void draw(Graphics g) {
		if(visible)
			super.draw(g);
	}
}

