package Unit7.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleFour
{
   private int size;
   private String letter;

	public TriangleFour()
	{
		this(0, "");
	}

	public TriangleFour(int count, String let)
	{
		setTriangle(let, count);
	}

	public void setTriangle( String let, int sz )
	{
		letter = let; size = sz;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String result = "";
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < i; j++) {
				result += " ";
			}
			for(int k = size - i; k < size; k++) {
				result += letter;
			}
			result += "\n";
		}
		return result;
	}
}