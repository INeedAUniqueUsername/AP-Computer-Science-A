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

public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
	
	public Class(String name, int stuCount)
	{
		this.name = name;
		studentList = new Student[stuCount];
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList[stuNum] = s;
	}
	
	public String getClassName()
	{
	   return name;
	}
	public double getClassSum() {
		double classSum = 0.0;
		for(Student s : studentList) {
			classSum += s.getAverage();
		}
		return classSum;
	}
	public double getClassAverage()
	{
		double classAverage=0.0;
		for(Student s : studentList) {
			classAverage += s.getAverage();
		}
		classAverage /= getStudentCount();
		return classAverage;
	}
	public int getStudentCount() {
		return studentList.length;
	}
	public double getStudentAverage(int stuNum)
	{
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		Student named = null;
		for(Student s : studentList) {
			if(s.getName().equals(stuName)) {
				named = s;
			}
		}
		return named != null ? named.getAverage() : 0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList[stuNum].getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";
		for(Student s : studentList) {
			double average = s.getAverage();
			if(average > high) {
				high = average;
				hName = s.getName();
			}
		}
		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";
		for(Student s : studentList) {
			double average = s.getAverage();
			if(average < low) {
				low = average;
				hName = s.getName();
			}
		}
		return hName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output = "";
		for(Student s : studentList) {
			if(s.getAverage() < failingGrade) {
				output += s.getName() + ", ";
			}
		}
		return output.substring(0, output.lastIndexOf(", "));
	}
	public void sortByAverage() {
		Alex.swapSort(studentList);
	}
	public String toString()
	{
		String output=""+getClassName()+"\n";
		for(Student s : studentList) {
			output += s.toString() + "\n";
		}
		output += String.format(
				"Class Sum: %.1f" + "\n" +
				"Class Average: %.1f" + "\n" +
				"Lowest Average: %s" + "\n" +
				"Highest Average: %s" + "\n" +
				"Failing: %s",
				getClassSum(),
				getClassAverage(),
				getStudentWithLowestAverage(),
				getStudentWithHighestAverage(),
				getFailureList(70)
				);
		return output;
	}
}