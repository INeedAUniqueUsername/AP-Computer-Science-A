package Unit13.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;

import java.util.Arrays;		//use Arrays.toString() to help print out the array

import Misc.Alex;

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] array)
	{
		quickSort(array, 0, array.length-1);
		out.println(String.format("Done: %s", String.format(Arrays.toString(array))));
	}


	private static void quickSort(Comparable[] list, final int low, final int high)
	{
		System.out.println("Sorting: " + Arrays.toString(Alex.subArray(list, low, high)));
		if(low < high) {
			int split = partition(list, low, high);
			System.out.println(String.format("Split: %d", split));
			/*
			System.out.println(String.format("Left: %s", Arrays.toString(Alex.subArray(list, low, split))));
			System.out.println(String.format("Right: %s", Arrays.toString(Alex.subArray(list, split+1, high))));
			*/
			quickSort(list, low, split-1);
			quickSort(list, split, high);
		}
	}
	private static int partition(Comparable[] array, int left, int right)
	{
		System.out.println(String.format("Paritioning: %s", Arrays.toString(array)));
		int pivot;
		Comparable c_pivot;
		Comparable c_right;
		Comparable c_left;
		while(left < right) {
			//Move the pivot to the top and move the bottom upwards
			pivot = right;
			c_pivot = array[pivot];
			c_left = array[left];
			while(c_left.compareTo(c_pivot) < 0) {
				//System.out.println("Raising the bottom");
				left++;
				c_left = array[left]; //Remember to update
			}
			if(left < pivot) {
				//System.out.println("Bottom <-> Pivot");
				array[pivot] = c_left;
				array[left] = c_pivot;
			}
			//Move the pivot to the bottom and move the top downwards
			pivot = left;
			c_pivot = array[pivot];
			c_right = array[right];
			while(c_right.compareTo(c_pivot) > 0) {
				System.out.println("Lowering the top");
				right--;
				c_right = array[right]; //Remember to update
			}
			if(pivot < right) {
				System.out.println("Pivot <-> Top");
				array[pivot] = c_right;
				array[right] = c_pivot;
			}
		}
		System.out.println(String.format("Paritioned: %s", Arrays.toString(array)));
		return right;
	}
}