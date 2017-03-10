package Assessments;
import java.util.Scanner;

public class Assessment6Runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How many random numbers should be generated? ");
		int count = s.nextInt();
		System.out.println("What is the number of values for each random draw? ");
		int range = s.nextInt();
		Assessment6 a = new Assessment6(count, range);
		a.generateRandomNumbers();
		System.out.println();
		System.out.println(a);
	}
}