package Unit5.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		setChar(' ');
	}

	public CharacterAnalyzer(char c)
	{
		setChar(c);
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		return (theChar >= 65 && theChar <= 90);
	}

	public boolean isLower( )
	{
		return (theChar >= 97 && theChar <= 122);
	}
	
	public boolean isNumber( )
	{
		return (theChar >= 48 && theChar <= 57);
	}	

	public int getASCII( )
	{
		return theChar;
	}

	public String toString()
	{
		String type = "";
		if(isUpper()) { type = "uppercase character"; }
		else if(isLower()) { type = "lowercase character"; }
		else if(isNumber()) { type = "number"; }
		else { type = "miscellaneous character"; }
		
		return String.format("%c is a %s. ASCII == %d", getChar(), type, getASCII());  
	}
}