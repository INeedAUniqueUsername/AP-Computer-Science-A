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

public class ArrayListFunHouse
{
	/*
	 *method getListOfFactors will return a list of 
	 *all of the factors of number - excluding number
	 */
	public static ArrayList<Integer> getListOfFactors(int number)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		//add code here
		//Factors cannot be greater than half of the number
		for(int i = 1; i <= number/2; i++) {
			if(number%i == 0) {
				result.add(i);
			}
		}
		return result;
	}
}