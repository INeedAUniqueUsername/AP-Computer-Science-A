package Unit15.Assignments;

import java.awt.Color;

public class GravityBall extends Ball {
	int tick = 0;
	public GravityBall() {
		super();
	}

	public GravityBall(int x, int y) {
		super(x, y);
	}

	public GravityBall(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
	}

	public GravityBall(int x, int y, int wid, int ht, int xSpd, int ySpd) {
		super(x, y, wid, ht, new Color(0), xSpd, ySpd);
	}

	public GravityBall(int x, int y, int wid, int ht, Color col, int xSpd,
			int ySpd) {
		super(x, y, wid, ht, col, xSpd, ySpd);
	}
	
	public void update() {
		super.update();
		tick++;
		if(tick%30 == 0) {
			incVelY(1);
		}
	}
}
