package Unit7.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		setTriangle("", 0);
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let, count);
	}

	public void setTriangle( String let, int sz )
	{
		size = sz;
		letter = let;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String result = "";
		for(int i = 1; i <= size; i++) {
			int letterStart = size - i;
			for(int j = 0; j < letterStart; j++) {
				result += " ";
			}
			for(int k = 0; k < i; k++) {
				result += letter;
			}
			result += "\n";
		}
		return result;
	}
}