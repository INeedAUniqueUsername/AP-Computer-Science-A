package Unit2.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02b
{
	public static void main( String[] args )
	{
		Sum test = new Sum();
		test.setNums(5,5);
		test.sum();
		test.print();

		test.setNums(90,100.0);
		test.sum();
		test.print();

		//add more test cases
		for(int i = 0; i < 10; i++)
		{
			int num1 = randomInt(i * 10);
			int num2 = randomInt(i * 10);
			test.setNums(num1, num2);
			test.sum();
			System.out.println("num1 == " + num1);
			System.out.println("num2 == " + num2);
			test.print();
		}
	}
	public static int randomInt(int max)
	{
		return (int) (Math.random()*max + 1);
	}
}