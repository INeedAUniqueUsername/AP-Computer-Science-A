package Unit13.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

import Misc.Alex;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while(number > 0) {
			number /= 10;
			count++;
		}
		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int count = getNumDigits(number);
		int[] sorted = new int[count];
		for(int i = 0; i < count; i++) {
			sorted[i] = number%10;
			number /= 10;
		}
		
		for(int i = 0; i < count; i++) {
			int n_i = sorted[i];
			int min = Integer.MAX_VALUE;
			int min_index = n_i;
			for(int j = i; j < count; j++) {
				int n_j = sorted[j];
				if(n_j < min) {
					min = n_j;
					min_index = j;
				}
			}
			sorted[min_index] = n_i;
			sorted[i] = min;
		}
		
		return sorted;
	}
}