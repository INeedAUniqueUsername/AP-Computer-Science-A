package Unit10.Assignments.Lab16e;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{




	}

	public Histogram(char[] values, String fName)
	{
		setLetters(values);
		setFile(fName);
	}
	public void setLetters(char[] characters) {
		letters = new ArrayList<Character>();
		count = new ArrayList<Integer>();
		for(char c : characters) {
			letters.add(c);
			count.add(0);
		}
	}
	public void setFile(String f) {
		fileName = f;
	}
	public void loadAndAnalyzeFile() throws IOException
	{
		Scanner s = new Scanner(new File(fileName));
		String text = "";
		while(s.hasNext()) {
			text += s.nextLine() + "\n";
		}
		for(int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			int index = letters.indexOf(c);
			if(index != -1) {
				count.set(index, count.get(index)+1);
			}
		}
	}

	public char mostFrequent()
	{
		int max_value = Integer.MIN_VALUE;
		int max_index = -1;
		for(int i = 0; i < letters.size(); i++) {
			int value = count.get(i);
			if(value > max_value) {
				max_value = value;
				max_index = i;
			}
		}
		return letters.get(max_index);
	}

	public char leastFrequent()
	{
		int min_value = Integer.MAX_VALUE;
		int min_index = -1;
		for(int i = 0; i < letters.size(); i++) {
			int value = count.get(i);
			if(value < min_value) {
				min_value = value;
				min_index = i;
			}
		}
		return letters.get(min_index);
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}