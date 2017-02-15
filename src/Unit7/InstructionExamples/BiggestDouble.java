package Unit7.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a, b, c, d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a; two = b; three = c; four = d;
	}

	public double getBiggest()
	{
		double max = -1000000000;
		for(double d : new double[] { one, two, three, four }) {
			if(d > max) {
				max = d;
			}
		}
		return max;
	}

	public String toString()
	{
	   return String.format("%f %f %f %f", one, two, three, four);
	}
}