package Unit2.Assignments;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02g
{
	public static void main( String[] args )
	{
		//add test cases
		for(int i = 0; i < 10; i++)
		{
			Fahrenheit f = new Fahrenheit();
			f.setFahrenheit(Math.random() * 10 * i);
			f.print();
		}
	}
}