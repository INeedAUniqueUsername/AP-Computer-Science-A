package Unit13.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;

import Misc.Alex;
import static java.lang.System.*;

public class Lab15a
{
	public static void main(String args[])
	{
		//add test cases
		WordSort ws = new WordSort(Alex.randomStrings(20, 2, " "));
		ws.sort();
		System.out.println(ws);
	}
}