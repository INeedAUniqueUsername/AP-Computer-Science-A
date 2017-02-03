package Unit1.InstructionExamples;
//© A+ Computer Science  -  www.apluscompsci.com
//Name - Alex Chen
//Date - 2/3/17
//Class - AP Computer Science A
//Lab  -

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("Graphics Runner");
		
		setSize(WIDTH,HEIGHT);

		getContentPane().add(new SmileyFace());
		
		//getContentPane().add(new BigHouse());		
		
		//getContentPane().add(new Robot());
		
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}