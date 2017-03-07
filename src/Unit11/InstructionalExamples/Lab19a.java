package Unit11.InstructionalExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;

import Unit12.Assignments.Lab18b.Monster;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Lab19a
{
   public static void main( String args[] )
   {
		Scanner keyboard = new Scanner(in);
		
		out.print("How many monsters are in the herd? :: ");
		int size = keyboard.nextInt();
		Monsters herd = new Monsters(size);

		for(int i=0; i<size;i++)
		{
			//read in monster values 
			//ask for ht
			
			//ask for wt
			
			//ask for age
	
			
			//instantiate a new Monster() and add it to the herd
			herd.add(i, new Monster(
					getInput(keyboard, "Height :: "),
					getInput(keyboard, "Weight :: "),
					getInput(keyboard, "Age :: ")
					));
		}		
		
		System.out.println("HERD :: "+herd+"\n");
		//print out the other stats
		
		
		
			
	}
   public static int getInput(Scanner scan, String message) {
	   System.out.println(message);
	   return scan.nextInt();
   }
}