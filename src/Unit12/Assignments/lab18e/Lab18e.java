package Unit12.Assignments.lab18e;


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

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("src\\Unit12\\Assignments\\Lab18e\\Lab18e.dat"));
		ArrayList<Word> words = new ArrayList<Word>(file.nextInt());
		file.nextLine();
		while(file.hasNextLine()) {
			words.add(new Word(file.nextLine()));
		}
		Collections.sort(words);
		System.out.println(words);
	}
}