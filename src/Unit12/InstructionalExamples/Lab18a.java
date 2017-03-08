package Unit12.InstructionalExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab18a
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		Monster first = askForMonster(keyboard, "1st monster");
		Monster second = askForMonster(keyboard, "2nd monster");
		System.out.println(String.format("Monster 1 - %s", first));
		System.out.println(String.format("Monster 2 - %s", second));
		System.out.println(String.format("Monster 1 is %s than Monster 2", (first.isBigger(second)) ? "bigger" : "smaller"));
		System.out.println(String.format("Monster 1 %s Monster 2", (first.namesTheSame(second) ? "has the same name as" : "does not have the same name as")));
	}
	public static Monster askForMonster(Scanner s, String identifier) {
		System.out.println(String.format("Enter %s's name :: ", identifier));
		String name = s.nextLine();
		System.out.println(String.format("Enter %s's size :: ", identifier));
		int size = s.nextInt();
		s.nextLine();
		return new Monster(name, size);
	}
}