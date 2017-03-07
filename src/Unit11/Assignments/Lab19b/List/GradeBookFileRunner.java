package Unit11.Assignments.Lab19b.List;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("src\\Unit11\\Assignments\\Lab19b\\gradebook.dat"));
		String name = file.nextLine();
		int count = file.nextInt(); file.nextLine();
		Class c = new Class(name, count);
		for(int i = 0; i < count; i++) {
			c.addStudent(i, new Student(file.nextLine(), file.nextLine()));
		}
		System.out.println(c);
		c.sortByAverage();
		System.out.println(c);
	}
}