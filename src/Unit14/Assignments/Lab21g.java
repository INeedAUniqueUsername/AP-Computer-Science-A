package Unit14.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import Misc.Alex;

public class Lab21g
{
	public static void main(String args[])
	{
		
		AtCounter path1 = new AtCounter(	"@@@@@@@@@@@@@@@@@@@@@@@@@@@ " +
											"--------------------------@ " +
											"@@@@@@@@@@@@@@@@@@@@@@@@@-@ " +
											"@---------------------@-@-@ " +
											"@-@@@@@@@@@@@@@@@@@@@-@-@-@ " +
											"@-@---@@@@@@@@@@@@@@@-@-@-@ " +
											"@-@-@-----------------@-@-@ " +
											"@-@-@@@@@@@@@@@@@@@@@-@-@-@ " +
											"@-@-@-----------------@-@-@ " +
											"@-@-@@@@@@@@@@@@@@@@@@@-@-@ " +
											"@-@---------------------@-@ " +
											"@-@@@@@@@@@@@@@@@@@@@@@@@-@ " +
											"@@@@@@@@@@@@@@@@@@@@@@@@@@@ "
					);
		path1.count(5, 7);
		System.out.println("Found " + path1.getAtCount());
		/*
		AtCounter path2 = new AtCounter(Alex.randomStringMultiple(20, 20, " ", new char[]{'@', '@', '@', '-'}));
		path2.countRandomSpot();
		System.out.println("Done: Found " + path2.getAtCount());
		*/
	}
}