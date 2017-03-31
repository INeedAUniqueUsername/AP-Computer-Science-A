package Unit15.Assignments;

import java.awt.Color;

public class SpeedUpBall extends Ball {
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
	public void collideHorizontal() {
		super.collideHorizontal();
		incVelY(getVelY() > 0 ? 1 : -1);
	}
	public void collideVertical() {
		super.collideVertical();
		incVelX(getVelX() > 0 ? 1 : -1);
	}
}
