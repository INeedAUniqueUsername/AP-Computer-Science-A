package Unit15.Assignments;

import java.awt.Color;

public class StrangeGravityBall extends Ball {
	int tick = 0;
	double gravityAngle = 0;
	public StrangeGravityBall()
	{
		this(200, 200);
	}
	public StrangeGravityBall(int x, int y) {
		this(x, y, 10, 10);
	}
	public StrangeGravityBall(int x, int y, int w, int h) {
		this(x, y, w, h, new Color(0));
	}
	public StrangeGravityBall(int x, int y, int w, int h, Color c) {
		this(x, y, w, h, c, 3, 1);
	}
	public StrangeGravityBall(int x, int y, int w, int h, Color c, int vx, int vy) {
		super(x, y, w, h, c);
		setVelX(vx);
		setVelY(vy);
	}
	public void update() {
		super.update();
		tick++;
		//double angle_from_center = Math.PI+Math.atan2(600-getY(), 800-getX());
		if(tick%30 == 0) {
			incVelX((int) (5 * Math.cos(gravityAngle)));
			incVelY((int) (5 * Math.sin(gravityAngle)));
		}
		if(tick%150 == 0) {
			gravityAngle = Math.random() * 2 * Math.PI;
		}
	}
}
