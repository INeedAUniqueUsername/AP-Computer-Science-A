package Unit14.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

import Misc.Alex;
import static java.lang.System.*;

public class PascalsTriangle
{
	private int[][] mat;

	public PascalsTriangle()
	{
		createTriangle(0);
	}

	public PascalsTriangle(int height)
	{
		createTriangle(height);
	}

	public void createTriangle(int height)
	{
		mat = new int[height][];
		//Starts from the top and goes down
		for(int i = 0; i < height; i++) {
			//System.out.println("Row: " + i);
			final int width = i+1;
			mat[i] = new int[width];
			//Starts from the left and goes right
			for(int j = 0; j < width; j++) {
				//System.out.println("Column: " + j);
				if(j == 0 || j == i) {
					mat[i][j] = 1;
				} else {
					//This is safe for the top two rows because the previous cases will handle them
					mat[i][j] = mat[i-1][j] + mat[i-1][j-1];
				}
			}
		}
	}

	public String toString()
	{
		String output="";
		int tab_size = 8;
		int height = mat.length;
		//Make a triangle formation
		for(int i = 0; i < height; i++) {
			int indent = height - 1 - i;
			//Add left indent
			for(int j = 0; j < indent; j++) {
				output += Alex.spaces(tab_size/2);
			}
			//Add spaces to separate the numbers
			for(int n : mat[i]) {
				output += n + Alex.spaces(tab_size-(""+n).length());
			}
			output += "\n";
		}
		return output;
	}
}
/*
                         1
                        1 1
                       1 2 1
                      1 3 3 1
                     1 4 6 4 1
                     
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1

*/