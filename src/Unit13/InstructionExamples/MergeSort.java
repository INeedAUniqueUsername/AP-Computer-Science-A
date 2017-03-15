package Unit13.InstructionExamples;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class MergeSort
{
	private static int passCount;

	public static void mergeSort(Comparable[] list)
	{
		passCount=0;
		mergeSort(list, 0, list.length);
	}

	private static void mergeSort( Comparable[] list, int front, int back)  //O( Log N )
	{
		int middle = (front+back)/2;
		while(middle != front) {
			mergeSort(list, front, middle);
			mergeSort(list, middle, back);
			merge(list, front, back);
		}
	}

	private static void merge(Comparable[] list, int front, int back)  //O(N)
	{
		int[] temp = new int[back-front];
		int i = front;
		int j = (front+back)/2;
		int k = 0;
		int middle = j;
		while(i < middle && j < back) {
			if(list[i] < list[j]) {
				
			}
		}
	}
}