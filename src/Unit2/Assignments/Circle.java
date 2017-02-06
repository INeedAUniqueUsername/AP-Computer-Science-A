package Unit2.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
		radius = rad;
	}

	public void calculateArea( )
	{
		area = Math.PI * Math.pow(radius, 2);
	}

	public void print( )
	{
		System.out.println("The area of a circle with radius " + radius + " is: " + area);
	}
}