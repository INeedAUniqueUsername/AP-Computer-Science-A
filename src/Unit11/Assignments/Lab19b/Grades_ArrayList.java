package Unit11.Assignments.Lab19b;

import java.util.ArrayList;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Grades_ArrayList
{
	private ArrayList<Double> grades;
	
	public Grades_ArrayList()
	{
		setGrades("");
	}
	
	public Grades_ArrayList(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		grades = new ArrayList<Double>();
		String[] g = gradeList.substring(gradeList.indexOf("-") + 2).split(" ");
		for(int i = 0; i < g.length; i++) {
			grades.add(Double.valueOf(g[i]));
		}
	}
	
	public void setGrade(int spot, double grade)
	{
		grades.set(spot, grade);
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
		return grades.size();
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