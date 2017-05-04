package Unit17.Assignments;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class NextWaveText {
	private int tick = 0;
	private final int interval = 120;
	private int x;
	private int y;
	private String message;
	public NextWaveText(String message) {
		setX(StarFighter.WIDTH/2 - 24 * (message.length()/2));
		setY(600);
		setMessage(message);
	}
	public void draw(Graphics g) {
		if(tick < interval) {
			g.setColor(Color.RED);
		} else if(tick < interval * 2) {
			g.setColor(Color.ORANGE);
		} else if(tick < interval * 3) {
			g.setColor(Color.YELLOW);
		}
		g.setFont(new Font("Consolas", Font.BOLD, 24));
		tick++;
		if(tick%interval < interval/2) {
			g.drawString(message, x, y);
		}
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
