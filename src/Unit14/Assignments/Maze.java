//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Misc.Alex;
import static java.lang.System.*;

public class Maze
{
   private Integer[][] map;

	public Maze()
	{
		this(	10,
				"1 0 0 0 0 0 0 0"+
				"1 1 1 1 1 1 1 0"+
				"1 0 0 0 0 0 1 0"+
				"1 0 1 1 1 1 1 0"+
				"1 0 0 0 0 0 0 0"+
				"1 1 1 1 1 1 1 1"
				);
	}

	public Maze(int size, String line)
	{
		map = new Integer[size][size];
		char[] c = line.toCharArray();
		int i = 0;
		for(int j = 0; i < size; i++) {
			for(int k = 0; j < size; j++) {
				map[i][j] = Integer.valueOf(c[i]);
				i++;
			}
		}
	}

	public Boolean hasExitPath(int r, int c)
	{
		ArrayList<Boolean[][]> paths = new ArrayList<Boolean[][]>();
		int size = map.length;
		explore(paths, new Boolean[size][size], r, c);
		return false;
	}

	private void explore(ArrayList<Boolean[][]> allPaths, Boolean[][] visited, int rPos, int cPos) {
		//We are in bounds on a new, valid spot
		if(isInBounds(rPos, cPos) && !visited[rPos][cPos] && map[rPos][cPos] == 1) {
			visited[rPos][cPos] = true;
			if(cPos == map.length-1) {
				//We reached the end, so record this path
				allPaths.add(visited);
			} else {
				explore(allPaths, visited.clone(), rPos, cPos+1);
				explore(allPaths, visited.clone(), rPos, cPos-1);
				explore(allPaths, visited.clone(), rPos+1, cPos);
				explore(allPaths, visited.clone(), rPos-1, cPos);
			}
		}
	}
	private Boolean isInBounds(int row, int column) {
		return Alex.isInBounds(row, column, map);
	}
	
	public String toString()
	{
		return Alex.matrixToString(map);
	}
}