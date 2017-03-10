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
		
		//Start from 0 and go right until we find two elements to swap. Swap the elements and then set the start index to that of the lesser element. 
		boolean active = true;
		int i_start = 0;
		int i_end = words.size()-1;
		while(active) {
			active = false;
			for(int i_left = i_start; i_left < i_end; i_left++) {
				int i_right = i_left+1;
				Word left = words.get(i_left);
				Word right = words.get(i_right);
				//If the left element should succeed the right element, then rearrange
				if(left.compareTo(right) > 0) {
					words.set(i_left, right);
					words.set(i_right, left);
					i_start = Math.max(0, i_left - 1);
					active = true;
					break;
				}
			}
			System.out.println(words);
		}
		System.out.println(words);
	}
}