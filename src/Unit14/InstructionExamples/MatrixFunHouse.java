package Unit14.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class MatrixFunHouse
{
	private int[][] mat;

	public MatrixFunHouse()
	{
		this(0, 0);
	}

	public MatrixFunHouse(int numRows, int numCols)
	{
		setSize(numRows, numCols);
	}
	
   public void setSize(int numRows, int numCols)
   {
	   mat = new int[numRows][numCols];
   }	

	public void setSpot(int row, int col, int val)
	{
		mat[row][col] = val;
	}
	public int getRowTotal(int row)
	{
		int total=0;
		for(int n : mat[row]) {
			total += n;
		}
		return total;
	}

	public int getTotal()
	{
		int total=0;
		for(int[] n : mat) {
			for(int m : n) {
				total += m;
			}
		}
		return total;
	}

	public String toString()
	{
		String output="";
		for(int r=0; r<mat.length; r++)
		{
			for(int c=0; c<mat[r].length; c++)
			{
				output+=" "+mat[r][c];
			}
			output+="\n";
		}
		return output;
	}
}