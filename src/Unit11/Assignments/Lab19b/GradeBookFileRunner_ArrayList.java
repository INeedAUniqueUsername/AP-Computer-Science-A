package Unit11.Assignments.Lab19b;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.*;

import java.io.File;
import java.io.FileNotFoundException;

public class GradeBookFileRunner_ArrayList
{
	public static void main( String args[] ) throws Exception
	{
		out.println("Welcome to the Class Stats program!");
		ArrayList<Class> classes = new ArrayList<Class>();
		classes.add(generateClass("src\\Unit11\\Assignments\\Lab19b\\gradebook.dat"));
		for(Class c : classes) {
			System.out.println(c);
		}
	}
	public static Class generateClass(String name) {
		Scanner file;
		Class c = null;
		try {
			file = new Scanner(new File(name));
			String className = file.nextLine();
			int count = file.nextInt(); file.nextLine();
			c = new Class(className, count);
			for(int i = 0; i < count; i++) {
				c.addStudent(i, new Student(file.nextLine(), file.nextLine()));
			}
			c.sortByAverage();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
}