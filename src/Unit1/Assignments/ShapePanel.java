package Unit1.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Polygon;
import java.awt.Rectangle;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ShapePanel extends JPanel
{
	//Shape[] shapes = new Shape[3];
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
		/*
		for(int i = 0; i < 3; i ++)
		{
			shapes[i] = new Shape(randomInt(600), randomInt(600), randomInt(200), randomInt(200), randomColor());
		}
		*/
	}

	/*
	public int randomInt(int max)
	{
		return (int) (Math.random() * max);
	}
	public Color randomColor()
	{
		return new Color[] {Color.RED, Color.ORANGE, Color.GREEN, Color.BLUE, Color.CYAN, Color.MAGENTA}[randomInt(6)];
	}
	*/
	
	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);
		//instantiate a Shape
		//tell your shape to draw
		new Shape(250, 250, 100, 100, Color.BLUE).draw(window);
		
		//instantiate a Shape
		//tell your shape to draw
		new Shape(400, 450, 300, 50, Color.YELLOW).draw(window);
		
		//instantiate a Shape
		//tell your shape to draw
		new Shape(100, 150, 100, 250, Color.GREEN).draw(window);
		
		/*
		for(Shape s: shapes)
		{
			s.draw(window);
		}
		*/
	}
}