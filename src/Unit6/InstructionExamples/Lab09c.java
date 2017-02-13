package Unit6.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09c
{
	public static void main( String args[] )
	{
		//add test cases
		for(int i = 50; i < 1000; i += i%37) {
			System.out.println(new ReverseNumber(i));
		}
	}
}