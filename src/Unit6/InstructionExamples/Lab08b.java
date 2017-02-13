package Unit6.InstructionExamples;

import java.util.Scanner;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab08b
{
	static Scanner input;
	public static void main ( String[] args )
	{
		input = new Scanner(System.in);
		ForLoopRunner.runForLoop(2,90,5);

		//add more test cases
		for(int i = 0; i < 10; i++) {
			ForLoopRunner.runForLoop(askForNumber("Start"), askForNumber("Stop"), askForNumber("Increment"));
		}
	}
	public static int askForNumber(String name) {
		System.out.println(String.format("%s :: ", name));
		return input.nextInt();
	}
}