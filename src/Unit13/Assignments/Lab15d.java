package Unit13.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;

import Misc.Alex;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		ArrayList<String> words = (ArrayList<String>) Alex.scanFileToList("src\\Unit13\\Assignments\\Lab15d.dat");
		int count = Integer.parseInt(words.get(0));
		words.remove(0);
		for(int i =0; i < count; i++) {
			System.out.println(new FancyWords(words.get(i)));
		}
	}
}