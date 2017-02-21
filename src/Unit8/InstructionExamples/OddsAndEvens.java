package Unit8.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;

public class OddsAndEvens
{
	private static int countEm(int[] array, boolean odd)
	{
		int result = 0;
		if(odd) {
			for(int n : array) {
				if(n%2 == 1) {
					result++;
				}
			}
		} else {
			for(int n : array) {
				if(n%2 == 0) {
					result++;
				}
			}
		}
		return result;
	}
	
	public static int[] getAllEvens(int[] array)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int n : array) {
			if(n % 2 == 0) {
				result.add(n);
			}
		}
		int[] result2 = new int[result.size()];
		for(int i = 0; i < result.size(); i++) {
			result2[i] = result.get(i);
		}
		return result2;
	}

	public static int[] getAllOdds(int[] array)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int n : array) {
			if(n % 2 == 1) {
				result.add(n);
			}
		}
		int[] result2 = new int[result.size()];
		for(int i = 0; i < result.size(); i++) {
			result2[i] = result.get(i);
		}
		return result2;
	}
}