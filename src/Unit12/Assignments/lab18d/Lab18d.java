package Unit12.Assignments.lab18d;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("src\\Unit12\\Assignments\\Lab18d\\lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		ArrayList<Word> words = new ArrayList<Word>(size);
		while(file.hasNextLine()) {
			words.add(new Word(file.nextLine()));
		}
		Collections.sort(words);
		for(Word w : words) {
			System.out.println(w.toString());
		}
	}
}