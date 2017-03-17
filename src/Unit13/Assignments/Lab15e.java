package Unit13.Assignments;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;

import Misc.Alex;
import static java.lang.System.*;

public class Lab15e
{
	public static void main(String args[])
	{
		//test case 1
		int[] one = NumberSort.getSortedDigitArray(567891);
		for(int item : one)
		{
			System.out.print(item + " ");
		}
		System.out.println();
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < 6; i++) {
			System.out.println(Arrays.toString(NumberSort.getSortedDigitArray(Integer.valueOf(Alex.askForNextLine(s, "Number :: ")))));
		}
		s.close();
	}
}