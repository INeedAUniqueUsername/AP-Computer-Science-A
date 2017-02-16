package Unit7.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int gcf = 1;
		int max = Math.max(Math.max(a, b), c);
		for(int i = 2; i < max; i++) {
			//All numbers are supposed to be positive. If all the remainders are zero, then they add up to zero
			if((a%i + b%i + c%i) == 0) {
				gcf = i;
				break;
			}
		}
		return gcf;
	}

	public String toString()
	{
		String result = String.format("All pythagorean triples containing numbers up to %d\n", number);
		for(int a = 1; a <= number; a++) {
			//b starts at a+1 to filter out duplicate combinations where a and b are rearranged.
			for(int b = a + 1; b <= number; b++) {
				if(a%2 != b%2) {
					for(int c = 1; c <= number; c++) {
						if((c%2 == 1) && (greatestCommonFactor(a, b, c) == 1) && (a*a + b*b == c*c) ) {
							result += String.format("%d %d %d\n", a, b, c);
						}
					}
				}
			}
		}
		return result;
	}
}