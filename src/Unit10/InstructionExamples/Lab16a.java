package Unit10.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Lab16a
{
	public static void main( String args[] )
	{
		System.out.println(ArrayListFunHouse.getListOfFactors(9));
		
		//add more test cases
		for(int i = 50; i < 60; i++) {
			System.out.println(ArrayListFunHouse.getListOfFactors(i));
		}
	}
}