package Unit2.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02f
{
	public static void main( String[] args )
   {
		//add test cases
		for(int i = 0; i < 10; i++)
		{
			Line l = new Line(randomInt(i * 10), randomInt(i * 10), randomInt(i * 10), randomInt(i * 10));
			l.calculateSlope();
			l.print();
		}
	}
	public static int randomInt(int max)
	{
		return (int) (Math.random() * max + 1);
	}
}