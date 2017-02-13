package Unit6.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

public class ForLoopCircles extends Canvas
{
	public ForLoopCircles()
	{
		setBackground(Color.WHITE);
	}
	
	public void paint( Graphics window )
	{
		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
		
		window.drawString("Lab 8A", 20, 40 );
	  	window.drawString("Drawing Circles Using a for loop ", 20, 80 );
	  	drawCircles(window);
	}
	
	public void drawCircles(Graphics window)
	{
		//add in a for loop to draw the circles
		window.setColor(Color.BLUE);
		for(int x = 20; x < 600; x = x + 50) {
			//drawOval(int x1, it y1, int width, int height)
			window.drawOval( x, 200 + (int) ((x % 250) - (x % 200) + (x % Math.sqrt(x))), 40, 40 );
		}
	}
}