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

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("src\\Unit14\\Assignments\\Lab24d.dat"));
		int count = file.nextInt(); file.nextLine();
		for(int i = 0; i < count; i++) {
			TicTacToe ttt = new TicTacToe(file.nextLine());
			System.out.println(ttt);
			System.out.println(ttt.getWinner());
		}
	}
}



