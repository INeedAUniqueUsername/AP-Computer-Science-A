package Unit13.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		setWords(sentence);
	}

	public void setWords(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public String toString()
	{
		String output="";
		int max = Integer.MIN_VALUE;
		for(String w : wordRay) {
			max = Math.max(w.length(), max);
		}
		String[] rows = new String[max];
		for(int i = 0; i < rows.length; i++) {
			rows[i] = "";
		}
		for(int i = wordRay.length-1; i >= 0; i--) {
			String w = wordRay[i];
			char[] chars = w.toCharArray();
			int length = chars.length;
			for(int j = 0; j < length; j++) {
				rows[j] += chars[length-1-j];
			}
			for(int j = length; j < max; j++) {
				rows[j] += " ";
			}
		}
		for(String r : rows) {
			output += r + "\n";
		}
		return output+"\n\n";
	}
}