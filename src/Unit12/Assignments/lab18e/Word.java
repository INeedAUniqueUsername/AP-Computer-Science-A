package Unit12.Assignments.lab18e;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s)
	{
		setString(s);
	}
	public void setString(String s) {
		word = s;
	}
	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for(char c : word.toCharArray()) {
			if(vowels.indexOf(c) != -1) {
				vowelCount++;
			}
		}
		return vowelCount;
	}
	private int countVowels(String s) {
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for(char c : s.toCharArray()) {
			if(vowels.indexOf(c) != -1) {
				vowelCount++;
			}
		}
		return vowelCount;
	}

	public int compareTo(Word rhs)
	{
		String word_other = rhs.toString();
		int result = 0;
		int vowels_this = numVowels();
		int vowels_other = countVowels(word_other);
		if(vowels_this < vowels_other) {
			result = -1;
		} else if(vowels_this == vowels_other) {
			result = word.compareTo(word_other);
		} else if(vowels_this > vowels_other) {
			result = 1;
		}
		return result;
	}

	public String toString()
	{
		return word;
	}
}