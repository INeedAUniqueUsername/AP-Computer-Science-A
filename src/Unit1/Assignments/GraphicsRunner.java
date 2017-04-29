package Unit1.Assignments;

//© A+ Computer Science  -  www.apluscompsci.com
//Name - John Doe
//Date - 2/3/17
//Class - AP Computer Science A
//Lab  -

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("MAKE YOUR OWN SHAPE");
		setSize(WIDTH,HEIGHT);

		//getContentPane().add(new ShapePanel());
		getContentPane().add(new Robot());
		setVisible(true);
	}

	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}