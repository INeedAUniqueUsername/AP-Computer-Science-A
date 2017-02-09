package Unit5.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05c
{
	public static void main ( String[] args )
	{
		for(String s : new String[] {"Hello", "Bye", "What", "Help"}) {
			System.out.println(new StringOddOrEven(s));
		}
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.println("Enter a string :: ");
			System.out.println(new StringOddOrEven(in.nextLine()));
		}
	}
}