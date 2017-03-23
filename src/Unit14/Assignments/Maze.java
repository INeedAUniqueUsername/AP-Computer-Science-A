package Unit14.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import Misc.Alex;
import static java.lang.System.*;

public class Maze
{
	private final static boolean DEBUG = true;
	private Integer[][] map;

	public Maze()
	{
		this(	8,
				"1 0 0 0 0 0 0 0 "+
				"1 1 1 1 1 1 1 0 "+
				"1 0 0 0 0 0 1 0 "+
				"1 0 1 1 1 1 1 0 "+
				"1 0 0 0 0 0 0 0 "+
				"1 1 1 1 1 1 1 1 "+
				"1 1 0 0 1 1 0 0 "+
				"1 1 1 1 1 1 1 1 "
				);
	}

	public Maze(int size, String line)
	{
		String[] c = line.split(" ");
		int i = 0;
		map = new Integer[size][size];
		for(int j = 0; j < size; j++) {
			for(int k = 0; k < size; k++) {
				map[j][k] = Integer.valueOf(c[i]);
				print(String.format("R%dC%d", j, k));
				i++;
			}
		}
	}

	public Boolean hasExitPath(int r, int c)
	{
		ArrayList<Boolean[][]> paths = new ArrayList<Boolean[][]>();
		int size = map.length;
		Boolean[][] visited = new Boolean[size][size];
		for(int i = 0; i < visited.length; i++) {
			for(int j = 0; j < visited[i].length; j++) {
				visited[i][j] = Boolean.valueOf(false);
				
			}
		}
		//Find all possible paths
		explore(paths, visited, r, c, map.length-1, map.length-1);
		
		//We found all the paths, so find the shortest
		Boolean[][] shortestPath = null;
		int shortestLength = Integer.MAX_VALUE;
		for(Boolean[][] p : paths) {
			int steps = countSteps(p);
			if(steps < shortestLength) {
				print(pathToString(p));
				shortestLength = steps;
				shortestPath = p;
			}
		}
		return !(shortestPath == null);
	}

	private void explore(ArrayList<Boolean[][]> allPaths, Boolean[][] visited, int rPos, int cPos, int rDest, int cDest) {
		//We are in bounds on a new, valid spot
		print(String.format("Exploring R%dC%d", rPos, cPos));
		if(isInBounds(rPos, cPos) && !visited[rPos][cPos] && map[rPos][cPos] == 1) {
			visited[rPos][cPos] = true;
			if((rPos == rDest || rDest == -1) && (cPos == cDest || cDest == -1)) {
				//We reached the end, so record this path
				print("Reached the exit");
				allPaths.add(visited);
			} else {
				print("Exploring Right");	explore(allPaths, visited.clone(), rPos, cPos+1, rDest, cDest); //Clone visited because we branch out
				print("Exploring Left");	explore(allPaths, visited.clone(), rPos, cPos-1, rDest, cDest);
				print("Exploring Down");	explore(allPaths, visited.clone(), rPos+1, cPos, rDest, cDest);
				print("Exploring Up");		explore(allPaths, visited.clone(), rPos-1, cPos, rDest, cDest);
			}
		} else {
			print("Reached dead end");
		}
	}
	private Boolean isInBounds(int row, int column) {
		return Alex.isInBounds(row, column, map);
	}
	private int countSteps(Boolean[][] path) {
		int result = 0;
		for(Boolean[] bb : path) {
			for(Boolean b : bb) {
				if(b) {
					result++;
				}
			}
		}
		return result;
	}
	public String toString()
	{
		return Alex.matrixToString(map);
	}
	public String pathToString(Boolean[][] path) {
		String result = "";
		for(int i = 0 ; i < path.length; i++) {
			for(int j = 0; j < path[i].length; j++) {
				if(path[i][j]) {
					result += "P";
				} else {
					result += map[i][j];
				}
			}
			result += "\n";
		}
		return result;
	}
	private static void print(String message) {
		if(DEBUG)
			System.out.println(message);
	}
}