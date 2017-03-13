package Unit11.Assignments.Lab19b;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;

import Misc.Alex;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);
		Class c = new Class(
				Alex.askForNextLine(keyboard, "Class Name :: "),
				Alex.askForInt(keyboard, "Class Size :: ")
				);
		for(int i = 0; i < c.getStudentCount(); i++) {
			c.addStudent(i, new Student(Alex.askForNextLine(
					keyboard, "Student Name :: "),
					Alex.askForInt(keyboard, "Student Grade Count :: ") + " - " + Alex.askForNextLine(keyboard, "Student Grades :: ")
					));
		}
		System.out.println(c);
		c.sortByAverage();
		System.out.println(c);
	}		
}