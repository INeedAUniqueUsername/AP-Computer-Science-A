package Unit13.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;

import Misc.Alex;
import static java.lang.System.*;

public class WordSort
{
	private String[] wordRay;

	public WordSort(String line)
	{
	   setList(line);	
	}

	public void setList(String line)
	{
		wordRay = line.split(" ");
	}

	public void sort()
	{
		Alex.sort(wordRay);
	}

	public String toString( )
	{
		String output="";
		for(int i = 0; i < wordRay.length; i++) {
			output += String.format("Word %d: %s\n", i, wordRay[i]);
		}
		return output+"\n\n";
	}
}