package Unit6.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		//add test cases
		
		
		for(String s : new String[] {"Hello there", "Add more test cases", "Does this work?"}) {
			System.out.println(new LetterRemover(s, s.charAt(0)));
		}
	}
}