package Unit4.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class FirstAndLast
{
	private String word;
	private char firstLetter;
	private char lastLetter;

	public FirstAndLast()
	{
		setString("");
	}

	public FirstAndLast(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

	public void findFirstLastLetters()
	{
		firstLetter = findFirstLetter(word);
		lastLetter = findLastLetter(word);
	}
	public char findFirstLetter(String s)
	{
		return s.charAt(0);
	}
	public char findLastLetter(String s)
	{
		return s.charAt(word.length()-1);
	}

 	public String toString()
 	{
 		return String.format("First letter :: %s\nLast letter :: %s\n%s", firstLetter, lastLetter, word);
	}
}