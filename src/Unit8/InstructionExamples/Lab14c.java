package Unit8.InstructionExamples;

import java.util.Arrays;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab14c
{
	public static void main( String args[] )
	{
		for(int i = 10; i < 20; i++) {
			int[] test = new int[i];
			for(int j = 0; j < i; j++) {
				test[j] = (int) (Math.random() * i);
			}
			System.out.println(Arrays.toString(test));
			System.out.println(String.format("# of evens = %s", Arrays.toString(OddsAndEvens.getAllEvens(test))));
			System.out.println(String.format("# of odds = %s", Arrays.toString(OddsAndEvens.getAllOdds(test))));
		}
	}
}