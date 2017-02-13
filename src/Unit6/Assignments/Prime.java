package Unit6.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.lang.Math;
import java.util.ArrayList;

public class Prime
{
	private int number;

	public Prime()
	{
		setPrime(0);
	}

	public Prime(int num)
	{
		setPrime(num);
	}

	public void setPrime(int num)
	{
		number = num;
	}

	public boolean isPrime()
	{
		boolean prime = true;
		for(int i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}

	public String toString()
	{
		return String.format("%d is %s prime number", number, (isPrime() ? "a" : "not a"));
	}
}