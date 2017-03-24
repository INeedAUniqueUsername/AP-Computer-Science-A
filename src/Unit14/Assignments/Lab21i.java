package Unit14.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import Misc.Alex;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner s = new Scanner(new File("src\\Unit14\\Assignments\\Lab21i.dat"));
		while(s.hasNextLine()) {
			int count = s.nextInt();
			s.nextLine();
			String line = s.nextLine();
			Maze test = new Maze(count, line);
			Boolean[][] path = test.getExitPath(0, 0);
			System.out.println(test);
			if(path == null) {
				System.out.println("Exit not found");
			} else {
				System.out.println(String.format("Exit found - %d steps", test.countSteps(path)));
				System.out.println(test.pathToString(path));
			}
			System.out.println("--------------------------");
		}
	}
}