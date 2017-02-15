package Unit7.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class BiggestString
{
	private String one,two,three;

	public BiggestString()
	{
		this("","","");
	}

	public BiggestString(String a, String b, String c)
	{
		setStrings(a, b, c);
	}

	public void setStrings(String a, String b, String c)
	{
		one = a; two = b; three = c;
	}

	public String getBiggest()
	{
		String result = "";
		for(String s : new String[] {one, two, three}) {
			if(s.compareTo(result) > 0) {
				result = s;
			}
		}
		return result;
	}

	public String toString()
	{
	   return String.format("%s %s %s", one, two, three);
	}
}