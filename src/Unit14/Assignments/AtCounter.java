package Unit14.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Arrays;

public class AtCounter
{
	private char[][] atMat;
	private int atCount;
	private boolean[][] visited;
	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{	{'@','-','@','-','-','@','-','@','@','@'},
								{'@','@','@','-','@','@','-','@','-','@'},
								{'-','-','-','-','-','-','-','@','@','@'},
								{'-','@','@','@','@','@','-','@','-','@'},
								{'-','@','-','@','-','@','-','@','-','@'},
								{'@','@','@','@','@','@','-','@','@','@'},
								{'-','@','-','@','-','@','-','-','-','@'},
								{'-','@','@','@','-','@','-','-','-','-'},
								{'-','@','-','@','-','@','-','@','@','@'},
								{'-','@','@','@','@','@','-','@','@','@'}
								};
	}

	public int countAts(int r, int c)
	{
		int height = atMat.length;
		visited = new boolean[height][];
		for(int i = 0; i < height; i++) {
			int width = atMat[i].length;
			visited[i] = new boolean[width];
			for(int j = 0; j < width; j++) {
				visited[i][j] = false;
			}
		}
		explore(r, c);
		int result = 0;
		for(boolean[] row : visited) {
			for(boolean b : row) {
				if(b) {
					result++;
				}
			}
		}
		return result;
	}
	private void explore(int r, int c) {
		//If we have an @ 
		if((r > 0 && c > 0) && (r < atMat.length && c < atMat[r].length) && !visited[c][r] && atMat[c][r] == '@') {
			visited[c][r] = true;
			
			printVisited();
			
			explore(r+1, c);
			explore(r-1, c);
			explore(r, c+1);
			explore(r, c-1);
		}
	}
	private void printVisited() {
		String result = "";
		for(int i = 0; i < visited.length; i++) {
			boolean[] row = visited[i];
			for(int j = 0; j < row.length; j++) {
				boolean b = row[j];
				result += b ? "X" : atMat[i][j];
			}
			result += "\n";
		}
	}
	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		return output;
	}
}