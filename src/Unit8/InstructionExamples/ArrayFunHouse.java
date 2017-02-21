package Unit8.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.ArrayList;

public class ArrayFunHouse
{
	//instance variables and constructors could be used, but are not really needed

	//getSum() will return the sum of the numbers from start to stop, not including stop
	public static int getSum(int[] numArray, int start, int stop)
	{
		int result = 0;
		for(int i = start; i <= stop; i++) {
			result += numArray[i];
		}
		return result;
	}

	//getCount() will return number of times val is present
	public static int getCount(int[] numArray, int val)
	{
		int result = 0;
		for(int n : numArray) {
			if(n == val) {
				result++;
			}
		}
		return result;
	}

	public static int[] removeVal(int[] numArray, int val)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int n : numArray) {
			if(n != val) {
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