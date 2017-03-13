package Unit11.Assignments.Lab19b;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Student implements Comparable {
	private String myName;
	private Grades_ArrayList myGrades;

	public Student() {
		this("", "");
	}

	public Student(String name, String gradeList) {
		setName(name);
		setGrades(gradeList);
	}

	public void setName(String name) {
		myName = name;
	}

	public void setGrades(String gradeList) {
		myGrades = new Grades_ArrayList(gradeList);
	}

	public void setGrade(int spot, double grade) {
		myGrades.setGrade(spot, grade);
	}

	public String getName() {
		return myName;
	}

	public int getNumGrades() {
		return myGrades.getNumGrades();
	}

	public double getSum() {
		return myGrades.getSum();
	}

	public double getAverage() {
		return myGrades.getAverage();
	}

	public double getAverageMinusLow() {
		return myGrades.getAverageMinusLow();
	}

	public double getHighGrade() {
		return myGrades.getHighGrade();
	}

	public double getLowGrade() {
		return myGrades.getLowGrade();
	}

	public String toString() {
		return myName + " = " + myGrades + " (" + getAverage() + ")";
		/*
		return String.format(
				"Name: %s" + "\n" + "\t" +
				"Grades: %s" + "\n" + "\t" +
				"Grade Count: %d" + "\n" + "\t" +
				"Grade Total: %.1f" + "\n" + "\t" +
				"Grade Average: %.1f" + "\n" + "\t" +
				"Grade Average Minus Low: %.1f" + "\n" + "\t" +
				"High Grade: %.1f" + "\n" + "\t" +
				"Low Grade: %.1f" + "\n",
				myName,
				myGrades,
				getNumGrades(),
				getSum(),
				getAverage(),
				getAverageMinusLow(),
				getHighGrade(),
				getLowGrade()
				);
		*/
	}

	@Override
	public int compareTo(Object arg0) {
		if(arg0 instanceof Student) {
			Student s = (Student) arg0;
			double a1 = getAverage();
			double a2 = s.getAverage();
			if(a1 < a2) {
				return -1;
			} else if(a1 > a2) {
				return 1;
			} else if(a1 == a2) {
				return 0;
			}
		}
		return 1/0;
	}
}