package Unit14.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		setBoard("");
	}

	public TicTacToe(String game)
	{
		setBoard(game);
	}
	public void setBoard(String s) {
		mat = new char[3][];
		if(s.length() >= 9) {
			mat[0] = s.substring(0, 3).toCharArray();
			mat[1] = s.substring(3, 6).toCharArray();
			mat[2] = s.substring(6, 9).toCharArray();
		}
	}
	public String getWinner()
	{
		for(char c : new char[]{'X', 'O'}) {
			if(hasHorizontal(c)) {
				return String.format("%c wins %s", c, "horizontally");
			} else if(hasVertical(c)) {
				return String.format("%c wins %s", c, "vertically");
			} else if(hasDiagonal(c)) {
				return String.format("%c wins %s", c, "diagonally");
			}
		}
		return "cat's game - no winner!";
	}
	public boolean hasVertical(char c) {
		int size = mat.length;
		Columns: for(int column = 0; column < size; column++) {
			//Check by column
			Rows: for(int row = 0; row < size; row++) {
				//If one character does not match, stop looking at this row
				if(mat[row][column] != c) {
					continue Columns;
				}
			}
			//We will not reach this after breaking
			return true;
		}
		return false;
	}
	public boolean hasHorizontal(char c) {
		int size = mat.length;
		Rows: for(int row = 0; row < size; row++) {
			//Check by column
			Columns: for(int column = 0; column < size; column++) {
				//If one character does not match, stop looking at this row
				if(mat[row][column] != c) {
					continue Rows;
				}
			}
			//We will not reach this after breaking
			return true;
		}
		return false;
	}
	public boolean hasDiagonal(char c) {
		int length = mat.length;
		boolean result = true;
		for(int i = 0; i < length && result; i++) {
			if(mat[i][i] != c) {
				result = false;
			}
		}
		if(result) {
			return true;
		}
		result = true;
		int i_last = length-1;
		for(int i = 0; i < length && result; i++) {
			int i_other = i_last-i;
			if(mat[i_other][i] != c) {
				result = false;
			}
		}
		if(result) {
			return true;
		}
		return false;
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