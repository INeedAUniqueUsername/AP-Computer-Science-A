package Unit11.Assignments.Lab19b;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private double[] grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		grades = new double[Integer.valueOf(gradeList.substring(0, gradeList.indexOf(" ")))];
		String[] g = gradeList.substring(gradeList.indexOf("-") + 2).split(" ");
		for(int i = 0; i < g.length; i++) {
			grades[i] = Double.valueOf(g[i]);
		}
	}
	
	public void setGrade(int spot, double grade)
	{
		grades[spot] = grade;
	}
	
	public double getSum()
	{
		double result = 0;
		for(double n : grades) {
			result += n;
		}
		return result;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for(double n : grades) {
			if(n < low) {
				low = n;
			}
		}
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for(double n : grades) {
			if(n > high) {
				high = n;
			}
		}
		return high;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	public double getAverage() {
		return getSum() / getNumGrades();
	}
	public double getAverageMinusLow() {
		return (getSum() - getLowGrade()) / (getNumGrades() - 1);
	}
	public String toString()
	{
		String output="";
		for(double n : grades) {
			output += String.format("%.1f ", n);
		}
		return output;
	}	
}