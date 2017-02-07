package Unit3.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		//add test cases
		Scanner input = new Scanner(System.in);
		Distance dist = new Distance();
		//dist.setCoordinates(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()); dist.calcDistance(); dist.print();
		dist.setCoordinates(1,1,2,1); dist.calcDistance(); dist.print();
		dist.setCoordinates(1,1,-2,2); dist.calcDistance(); dist.print();
		dist.setCoordinates(1,1,0,0); dist.calcDistance(); dist.print();
	}
}