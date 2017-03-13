package Misc;

import java.util.Scanner;

public final class Alex {
	public static final void sort(Comparable[] array) {
		swapSort(array);
	}
	public static final void swapSort(Comparable[] array) {
		int count = array.length;
		int i_left = 0;
		int i_right = i_left+1;
		//Start at the left side and move right while swapping elements
		while(i_right < count) {
			Comparable s_left = array[i_left];
			Comparable s_right = array[i_right];
			if(s_left.compareTo(s_right) > 0) {
				array[i_right] = s_left;
				array[i_left] = s_right;
				i_left--;	//Step left in case we have to move the left element further
				if(i_left < 0) {
					i_left = 0;
				}
			} else {
				i_left++;
			}
			i_right = i_left+1;
		}
	}
	public static final int askForInt(Scanner s, String message) {
		System.out.println(message);
		int result = s.nextInt();
		s.nextLine();
		return result;
	}
	public static final String askForNext(Scanner s, String message) {
		System.out.println(message);
		String result = s.next();
		s.nextLine();
		return result;
	}
	public static final String askForNextLine(Scanner s, String message) {
		System.out.println(message);
		return s.nextLine();
	}
}
