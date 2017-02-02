package Unit0.Assignments;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab0c
{
	public static void main (String[] args)
	{
		

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;
		String stringOne, stringTwo;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();


		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();


		//add in input for all variables
		System.out.print("Enter a double :: ");
		doubleOne = keyboard.nextDouble();
		System.out.print("Enter a double :: ");
		doubleTwo = keyboard.nextDouble();

		System.out.print("Enter a float :: ");
		floatOne = keyboard.nextFloat();
		System.out.print("Enter a float :: ");
		floatTwo = keyboard.nextFloat();
		
		shortOne = getShort(keyboard);
		shortTwo = getShort(keyboard);
		
		System.out.println("ENTER A STRING :: ");
		stringOne = keyboard.next();
		System.out.println("enter a string :: ");
		stringTwo = keyboard.next();


		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );

		//add in output for all variables

		System.out.println("" + intOne + " + " + intTwo + " = " + intOne + intTwo );
		System.out.println("Oops");
		System.out.println("" + intOne + " + " + intTwo + " = " + (intOne + intTwo) );

		System.out.println("double one = " + doubleOne );
		System.out.println("double two = " + doubleTwo );
		System.out.println("" + doubleOne + " - " + doubleTwo + " = " + (doubleOne - doubleTwo));
		
		System.out.println("float one = " + floatOne );
		System.out.println("float two = " + floatTwo );
		System.out.println("" + floatOne + " * " + floatTwo + " = " + (floatOne * floatTwo));
		
		System.out.println("short one = " + shortOne );
		System.out.println("short two = " + shortTwo );
		
		System.out.println("STRING ONE = " + stringOne.toUpperCase());
		System.out.println("string two = " + stringTwo.toLowerCase());
		keyboard.close();
	}
	//Filter out decimals and letters from the input
	public static short getShort(Scanner scan)
	{
		boolean done = false;
		short result = 0;
		while(!done)
		{
			System.out.print("Enter a short ::");
			String input = scan.next();
			boolean isDecimal = input.contains(".");
			boolean hasLetters = false;
			for(int i = 0; i < input.length(); i++)
			{
				if(Character.isLetter(input.charAt(i)))
				{
					hasLetters = true;
					break;
				}
			}
			if(isDecimal)
			{
				System.out.println("Is that a decimal? Disgusting!");
			}
			else if(hasLetters)
			{
				System.out.println("A letter! Eww!");
			}
			else {
				result = Short.parseShort(input);
				done = true;
			}
		}
		return result;
	}
}