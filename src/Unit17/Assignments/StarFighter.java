package Unit17.Assignments;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;

import java.awt.Component;
import java.util.Scanner;

public class StarFighter extends JFrame
{
	static final int WIDTH = 800;
	static final int HEIGHT = 600;

	public StarFighter()
	{
		super("STARFIGHTER SYNDROME");
		setSize(WIDTH,HEIGHT);

		OuterSpace theGame = new OuterSpace();
		((Component)theGame).setFocusable(true);

		getContentPane().add(theGame);

		setVisible(true);
	}

	public static void main( String args[] )
	{
		StarFighter run = new StarFighter();
	}
}