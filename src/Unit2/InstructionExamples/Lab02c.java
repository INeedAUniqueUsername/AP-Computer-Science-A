package Unit2.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02c
{
	public static void main( String[] args )
	{
		Average a = new Average();
 		//add more test cases
		for(int i = 1; i <= 10; i++)
		{
			a.setNums(random(i*10), random(i*10)); a.average(); a.print();
		}
	}
	public static double random(double max)
	{
		return Math.random()*max + 1;
	}
}