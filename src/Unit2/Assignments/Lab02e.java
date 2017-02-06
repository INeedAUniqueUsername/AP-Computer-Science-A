package Unit2.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02e
{
	public static void main( String[] args )
   {
		//add test cases
		Circle circ1 = new Circle();
		for(int i = 0; i < 10; i ++)
		{
			double radius = Math.random() * 10 * i;
			circ1.setRadius(radius);
			circ1.calculateArea();
			circ1.print();
		}
		
	}
}