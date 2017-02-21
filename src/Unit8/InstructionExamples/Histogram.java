package Unit8.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;

public class Histogram
{
	private int[] numCount;

	//constructor 
	public Histogram(int max) {
		setRange(max);
	}
	//set method
	public void setRange(int n) {
		numCount = new int[n];
		for(int i = 0; i < n; i++) {
			numCount[i] = 0;
		}
	}
	//toString method
	public String toString() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(String.format("Enter numbers between %d and %d", 0, numCount.length - 1));
		while(keyboard.hasNextInt()) {
			numCount[keyboard.nextInt()] += 1;
		}
		/*
		ArrayList<String> histogram = new ArrayList<String>();
		for(int i = 0; i < 100; i++) {
			histogram.add("");
		}
		//Column, starts at left
		for(int i = 0; i < numCount.length-1; i++) {
			histogram.set(0, histogram.get(0) + i + " ");
			//Row, starts at bottom
			for(int j = 1; j <= numCount[i]; j++) {
				histogram.set(j, histogram.get(j) + "." + " ");
			}
		}
		String result = "";
		for(int i = histogram.size() - 1; i >= 0; i--) {
			result += histogram.get(i) + "\n";
		}
		*/
		String result = "";
		for(int i = 0; i < numCount.length - 1; i++) {
			result += i + " ";
			for(int j = 0; j < numCount[i]; j++) {
				result += "*";
			}
			result += "\n";
		}
		return result;
	}
}