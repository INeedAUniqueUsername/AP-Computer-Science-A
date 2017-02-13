package Unit6.InstructionExamples;


//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class ForLoopRunner
{
	//instance variables and constructors could be used, but are not really needed
	
	//runForLoop() will run a for loop from start to stop going up by increment
	public static void runForLoop(int start, int stop, int increment )
	{
		for(int i = start; i < stop; i += increment) {
			System.out.println(i);
		}
	}
}