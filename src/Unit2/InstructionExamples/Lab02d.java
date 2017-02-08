package Unit2.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02d
{
	public static void main( String[] args )
   {
		Cube test = new Cube();
	 	test.setSide(112);
	 	test.calculateSurfaceArea();
	 	test.print();

	 	//add more test cases
	 	for(int i = 1; i <= 10; i++)
	 	{
	 		test.setSide(randomInt(i*10)); test.calculateSurfaceArea(); test.print();
	 	}
	 	
	 	
	 	
	}
	public static int randomInt(int max)
	{
		return (int) (Math.random()*max + 1);
	}
}