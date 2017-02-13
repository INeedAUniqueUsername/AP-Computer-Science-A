package Unit6.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class ReverseNumber
{
   private int number;

	//add constructors
	public ReverseNumber() {
		setNumber(0);
	}
	public ReverseNumber(int n) {
		setNumber(n);
	}
	
	//add a set method
	public void setNumber(int n) {
		number = n;
	}
	public int getReverse()
	{
		int rev=0;
		int num = number;
		while(num > 0) {
			rev = rev*10 + num%10;
			num /= 10;
		}
		return rev;
	}

	//add  a toString
	public String toString() {
		return String.format("%d -> %d", number, getReverse());
	}
	
}