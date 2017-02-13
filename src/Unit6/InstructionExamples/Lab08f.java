package Unit6.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab08f
{
	public static void main ( String[] args )
	{
		//add test cases
		for(String s : new String[] {"Hello", "World", "Fizz", "Buzz"}) {
			System.out.println(new Word(s));
			//System.out.println(new Word(new Word(new Word(s).toString()).toString()));
		}
	}
}