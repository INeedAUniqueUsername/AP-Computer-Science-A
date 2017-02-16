package Unit7.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
		setMax(stop);
	}
	public void setMax(int max) {
		upperBound = max;
	}
	public void playGame(Scanner input)
	{
		int answer = (int) (Math.random() * upperBound+1);
		int guesses = 0;
		boolean active = true;
		while(active) {
			System.out.println(String.format("Enter a number between 1 and %d :: ", upperBound));
			if(input.nextInt() == answer) {
				active = false;
			} else {
				guesses++;
			}
		}
		System.out.println(String.format("It took %d guesses to guess %d", guesses, answer));
		System.out.println(String.format("You guessed wrong %d percent of the time", (100*guesses)/upperBound));
	}

	public String toString()
	{
		String output="";
		return output;
	}
}