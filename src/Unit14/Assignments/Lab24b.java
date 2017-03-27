package Unit14.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24b
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File ("src\\Unit14\\Assignments\\lab24b.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i<size; i++)
		{
			System.out.println(new FancyWord(file.nextLine()));
		}
		for(String s : new String[]{"Here is an hourglass, but where is the sand?".toUpperCase()}) {
			System.out.println(new FancyWord(s));
		}
	}
}