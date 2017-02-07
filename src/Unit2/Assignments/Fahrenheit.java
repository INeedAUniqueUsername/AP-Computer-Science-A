package Unit2.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		double celsius = 0.0;
		//add code to convert fahrenheit to celsius
		celsius = fahrenheit - 32;
		celsius *= 5.0/9.0;
		return celsius;
	}

	public void print()
	{
		//this is part of the solution
		//System.out.println(getCelsius());
		System.out.println();
		System.out.printf(String.format("%.3f degrees Fahrenheit == %.3f degrees Celsius", fahrenheit, getCelsius()));
	}
}