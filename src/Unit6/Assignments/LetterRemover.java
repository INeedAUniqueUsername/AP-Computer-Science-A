package Unit6.Assignments;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
		setRemover("", ' ');
	}

	//add in second constructor
	public LetterRemover(String s, char c) {
		setRemover(s, c);
	}
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		for(int index = cleaned.indexOf(lookFor); index != -1; index = cleaned.indexOf(lookFor)) {
			cleaned = cleaned.substring(0, index) + cleaned.substring(index + 1);
		}
		return cleaned;
	}

	public String toString()
	{
		return String.format("%s - %c = %s", sentence, lookFor, removeLetters());
	}
}