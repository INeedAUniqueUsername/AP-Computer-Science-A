package Unit8.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayStats
{
	//instance variable
	private int[] nums;
	//constructor
	public ArrayStats(int[] n) {
		setNums(n);
	}
	//set method
	public void setNums(int[] n) {
		nums = n;
	}
	public int getNumGroupsOfSize(int size)
	{
		int result = 0;
		int lookFor = 0;
		int lookForSize = 0;
		for(int n : nums) {
			if(n == lookFor) {
				lookForSize++;
				if(lookForSize == size) {
					result++;
				}
			} else {
				lookFor = n;
				lookForSize = 0;
			}
		}
		return result;
	}
	
	public String toString()
	{
		return ""+Arrays.toString(nums);
	}
}