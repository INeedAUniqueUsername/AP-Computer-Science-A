package Unit2.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02a
{
	public static void main( String[] args )
	{
		Rectangle test = new Rectangle();
		test.setLengthWidth(2,6);
		test.calculatePerimeter( );
		test.print();

		test.setLengthWidth(12,5);
		test.calculatePerimeter( );
		test.print();
		
		//add more test cases
		for(int i = 0; i < 10; i++)
		{
			int length = randomInt(i * 10);
			int width = randomInt(i * 10);
			test.setLengthWidth(length, width);
			test.calculatePerimeter();
			System.out.println("Length: " + length);
			System.out.println("Width: " + width);
			test.print();
		}
	}
	public static int randomInt(int max)
	{
		return (int) (Math.random()*max + 1);
	}
}