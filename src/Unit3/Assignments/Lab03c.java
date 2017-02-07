package Unit3.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
   	//add test cases
		Quadratic quad = new Quadratic();
		quad.setEquation(  5, -8,  3); quad.calcRoots(); quad.print();
		quad.setEquation(  3,  2, -7); quad.calcRoots(); quad.print();
		quad.setEquation(  9,  6,  1); quad.calcRoots(); quad.print();
		Scanner input = new Scanner(System.in);
		
		System.out.print("a :: "); int a = input.nextInt();
		System.out.print("b :: "); int b = input.nextInt();
		System.out.print("c :: "); int c = input.nextInt();
		quad.setEquation(a, b, c); quad.calcRoots(); quad.print();
	}
}