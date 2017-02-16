package Unit7.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("Guessing Game - How many numbers?");
			new GuessingGame(keyboard.nextInt()).playGame(keyboard);
			System.out.println("Play again?");
		} while (keyboard.next().equalsIgnoreCase("Y"));
	}
}