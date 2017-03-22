package Misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public final class Alex {
	//Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Comparable<Object>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> why_is_this_possible;

	public static final void main(String[] args) {
		int[][] a = new int[5][];
		a[0] = new int[1000];
		a[1] = new int[200000];
	}
	public static final <T> T[] subArray(T[] array, int left, int right) {
		/*
		System.out.println("Array: " + Arrays.toString(array));
		System.out.println("Left: " + left);
		System.out.println("Right: " + right);
		*/
		if(right <= left) {
			return (T[]) new Object[0];
		}
		int count = right-left;
		T[] result = (T[]) new Object[count];
		for(int i = 0; i < count; i++) {
			result[i] = array[left+i];
		}
		return result;
	}
	public static final void swapSortTest() {
		for (int i = 0; i < 20; i++) {
			Integer[] test = new Integer[i];
			for (int j = 0; j < i; j++) {
				test[j] = i - j;
			}
			System.out.println(Arrays.toString(test));
			swapSort(test);
		}
	}
	public static final String spaces(int count) {
		String result = "";
		for(int i = 0; i < count; i++) {
			result += " ";
		}
		return result;
	}
	public static final void swapSort(Comparable[] array) {
		int count = array.length;
		int i_left = 0;
		int i_right = i_left + 1;
		// Start at the left side and move right while swapping elements
		while (i_right < count) {
			Comparable s_left = array[i_left];
			Comparable s_right = array[i_right];
			if (s_left.compareTo(s_right) > 0) {
				array[i_right] = s_left;
				array[i_left] = s_right;
				i_left--; // Step left in case we have to move the left element
							// further
				if (i_left < 0) {
					i_left = 0;
				}
			} else {
				i_left++;
			}
			i_right = i_left + 1;
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

	public static final List<String> scanFileToList(String path) {
		ArrayList<String> output = new ArrayList<String>();
		try {
			Scanner s = new Scanner(new File(path));
			while (s.hasNextLine()) {
				output.add(s.nextLine());
			}
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return output;
	}

	public static final String[] scanFileToArray(String path) {
		return scanFileToList(path).toArray(new String[0]);
	}

	public static final String joinStringList(List<String> s, String separator) {
		return joinStringArray(s.toArray(new String[0]), separator);
	}

	public static final String joinStringArray(String[] s, String separator) {
		String output = "";
		int i_last = s.length - 1;
		for (int i = 0; i < i_last; i++) {
			output += s[i] + separator;
		}
		if (i_last > 0) {
			output += s[i_last];
		}
		return output;
	}

	public static final String randomStringMultiple(int count, int length,
			String separator) {
		String output = "";
		for (int i = 0; i < count - 1; i++) {
			output += randomString(length) + separator;
		}
		output += randomString(length);
		return output;
	}
	public static final String randomStringMultiple(int count, int length, String separator, char[] choices) {
		String output = "";
		for (int i = 0; i < count - 1; i++) {
			output += randomString(length, choices) + separator;
		}
		output += randomString(length, choices);
		return output;
	}
	public static final String randomString(int length) {
		String result = "";
		for (int i = 0; i < length; i++) {
			result += randomChar();
		}
		return result;
	}
	
	public static final String randomString(int length, char[] choices) {
		String result = "";
		int choicesCount = choices.length;
		for (int i = 0; i < length; i++) {
			result += choices[random(choicesCount)];
		}
		return result;
	}

	public static final char randomChar() {
		switch ((int) (Math.random() * 3)) {
		case 0:
			return randomLowerCase();
		case 1:
			return randomUpperCase();
		case 2:
			return randomNumber();
		default:
			return (Character) null;
		}
	}

	public static final char randomLowerCase() {
		return (char) ('a' + random(1 + 'z' - 'a'));
	}

	public static final char randomUpperCase() {
		return (char) ('A' + random(1 + 'Z' - 'A'));
	}

	public static final char randomNumber() {
		return (char) ('0' + random(1 + '9' - '0'));
	}
	public static final int random(int max) {
		return (int) (Math.random()*max);
	}
	public static final <T> String matrixToString(T[][] matrix) {
		String result = "";
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				result += matrix[i][j];
			}
			result += "\n";
		}
		return result;
	}
	
	public static final <T> boolean isInBounds(int r, int c, T[][] matrix) {
		return (r > -1 && c > -1) && (r < matrix.length && c < matrix[r].length);
	}
}
