package Unit8.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	int[] nums;
	public Grades() {
		setNums(new int[0]);
	}
	public Grades(int[] n) {
		setNums(n);
	}
	public void setNums(int[] n) {
		nums = n;
	}
	private double getSum()
	{
		double sum = 0.0;
		for(int n : nums) {
			sum += n;
		}
		return sum;
	}

	public double getAverage()
	{
		return getSum()/nums.length;
	}
	public String toString() {
		String result = "";
		for(int i = 0; i < nums.length; i++) {
			result += String.format("Grade #%d = %d\n", i, nums[i]);
		}
		result += String.format("Average = %f", getAverage());
		return result;
	}
}