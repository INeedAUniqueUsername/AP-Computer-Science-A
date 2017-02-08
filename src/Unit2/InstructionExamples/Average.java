package Unit2.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Average
{
	//instance variables
	private double one, two, average;

	public void setNums(double num1, double num2)
	{
		one = num1; two = num2;
	}

	public void average( )
	{
		double sum=0;
		sum = one + two;
		average = sum/2;
	}
	public void print( )
	{
		System.out.println(String.format("The average of %.3f and %.3f is %.3f", one, two, average));
	}
}