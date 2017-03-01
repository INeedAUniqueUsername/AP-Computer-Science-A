package Unit10.InstructionExamples;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word
{
	private String word;
   private static String vowels = "AEIOUaeiou";   //only one

	public Word()
	{
		setWord("");
	}

	public Word(String wrd)
	{
		setWord(wrd);
	}

	public void setWord(String wrd)
	{
		word = wrd;
	}
	
	public int getNumVowels()
	{
		int result = 0;
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if(vowels.indexOf(c) != -1) {
				result++;
			}
		}
		return result;
	}
	
	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
		return word;
	}
}