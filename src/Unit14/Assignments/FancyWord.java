package Unit14.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

import Misc.Alex;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{
		setString("");
	}

	public FancyWord(String s){
		setString(s);
	}
	public void setString(String s) {
		int length = s.length();
		mat = new char[length][length];
		if(length > 0) {
			for(int i = 0; i < length; i++) {
				for(int j = 0; j < length; j++) {
					mat[i][j] = ' ';
				}
			}
			int i_last = length - 1;
			mat[0] = s.toCharArray();
			for(int i = 1; i < i_last; i++) {
				char c = s.charAt(i);
				mat[i][i] = c;
				mat[i_last-i][i] = c;
				//mat[i][i_last - i] = c;
			}
			mat[i_last] = mat[0];
			/*
			for(int i = 0; i <= i_last; i++) {
				int i_other = i_last - i;
				char c = s.charAt(i);
				char c_other = s.charAt(i_other);
				mat[i_last][i] = c_other;
				mat[i_last][i_other] = c;
			}
			*/
			
		}
	}
	public String toString()
	{
		String result = "";
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				result += mat[i][j];
			}
			result += "\n";
		}
		return result;
	}
}