package Unit14.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Arrays;

import Misc.Alex;

public class AtCounter
{
	private final boolean DEBUG = false;
	private final boolean PRINT_MAP = true;
	
	private char[][] atMat;
	private int atCount;
	private boolean[][] visited;
	public AtCounter()
	{
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
	public AtCounter(String map) {
		String[] rows = map.split(" ");
		int height = rows.length;
		atMat = new char[height][];
		for(int i = 0; i < height; i++) {
			atMat[i] = rows[i].toCharArray();
		}
	}

	public void count(int r, int c)
	{
		print(String.format("Beginning at R%dC%d", r, c));
		atCount = 0;
		int height = atMat.length;
		visited = new boolean[height][];
		for(int i = 0; i < height; i++) {
			int width = atMat[i].length;
			visited[i] = new boolean[width];
			for(int j = 0; j < width; j++) {
				visited[i][j] = false;
			}
		}
		printVisited();
		explore(r, c);
		/*
		int result = 0;
		for(boolean[] row : visited) {
			for(boolean b : row) {
				if(b) {
					result++;
				}
			}
		}
		*/
		print(String.format("Done: Found %d", atCount));
	}
	public void countRandomSpot() {
		while(true) {
			int r = Alex.random(atMat.length);
			int c = Alex.random(atMat[r].length);
			if(isAt(atMat[r][c])) {
				count(r, c);
				break;
			}
		}
	}
	private void explore(int r, int c) {
		//If we have an @ 
		if(isInBounds(r, c)) {
			char location = atMat[r][c];
			if(!visited[r][c]) {
				if(isAt(location)) {
					print(String.format("Exploring R%dC%d", r, c));
					visited[r][c] = true;
					atCount++;
					printVisited();
					
					print("Exploring Down...");	explore(r+1, c);
					print("Exploring Up...");	explore(r-1, c);
					print("Exploring Right...");		explore(r, c+1);	
					print("Exploring Left...");	explore(r, c-1);
				} else {
					print(String.format("Already explored R%dC%d", r, c));
				}
			} else {
				print(String.format("Found %s at R%dC%d", location, r, c));
			}
		} else {
			print(String.format("R%dC%d is out of bounds", r, c));
		}
	}
	private boolean isInBounds(int r, int c) {
		return (r > -1 && c > -1) && (r < atMat.length && c < atMat[r].length);
	}
	private boolean isAt(char c) {
		return c == '@';
	}
	private void printVisited() {
		if(PRINT_MAP) {
			String result = "";
			for(int i = 0; i < visited.length; i++) {
				boolean[] row = visited[i];
				for(int j = 0; j < row.length; j++) {
					boolean b = row[j];
					result += b ? "X" : atMat[i][j];
				}
				result += "\n";
			}
			System.out.println(result);
		}
	}
	private void print(String message) {
		if(DEBUG) {
			System.out.println(message);
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