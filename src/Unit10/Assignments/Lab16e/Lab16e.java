package Unit10.Assignments.Lab16e;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Lab16e
{
	public static void main( String args[] ) throws IOException
	{
		Histogram test = new Histogram();
		for(String f : new String[] {"src\\Unit10\\Assignments\\Lab16e\\lab16e1.dat", "src\\Unit10\\Assignments\\Lab16e\\lab16e2.dat", "src\\Unit10\\Assignments\\Lab16e\\lab16e3.dat"}) {
			test.setFile(f);
			test.setLetters(randomChars());
			test.loadAndAnalyzeFile();
			out.println("Letter occurring most : "+test.mostFrequent());
			out.println("Letter occurring least : "+test.leastFrequent());
			out.println("\n");
			out.println(test);
		}


		//more test cases
	}
	public static char[] randomChars() {
		char[] result = new char[(int) (Math.random()*25)+1];
		for(int i = 0; i < result.length; i++) {
			result[i] = (char) (97 + (int) (Math.random() * 26));
		}
		return result;
	}
}