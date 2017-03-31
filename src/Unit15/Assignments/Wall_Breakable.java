package Unit15.Assignments;

import java.awt.Graphics;

public class Wall_Breakable extends Wall {
	private boolean active = true;
	public Wall_Breakable(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}
	public boolean getActive() {
		return active;
	}
	public void destroy() {
		active = false;
	}
	public void draw(Graphics g) {
		if(active) {
			super.draw(g);
		}
	}
}
