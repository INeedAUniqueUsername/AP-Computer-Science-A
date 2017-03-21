package Unit14.InstructionExamples;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Misc.Alex;
import static java.lang.System.*;

public class Lab24e
{
	public static void main( String args[] ) throws IOException
	{
		String[] file = Alex.scanFileToArray("src\\Unit14\\InstructionExamples\\Lab24e.dat");
		for(int i = 1; i <= Integer.parseInt(file[0]); i++) {
			System.out.println(new FancyWordTwo(file[i]));
		}
	}
}