package Unit3.Assignments;

import java.util.Scanner;
/*
Unit 3: Loops
Answer the questions and complete the programs in preparation for the end of Unit exam
Review Questions:
	1.	Write a while loop that prints
		a.	All Squares less than n. For example, if n is 100, print 0 1 4 9 16 25 36 49 64 81.

		b.	All Positive numbers that are divisible by 10 and less than n. For example, if n is100, 10 20 30 40 50 60 70 80 90
		c.	All powers of two less than n. For example, if n is 100, print 1 2 4 8 16 32 64
	2.	What do these loops print?
		a.	for (int i = 1; i < 10; i++){Sytem.out.print(i + � �);}
1 2 3 4 5 6 7 8 9
		b.	for (int i = 1; i < 10; i+=2){Sytem.out.print(i + � �);}
1 3 5 7 9
		c.	for (int i = 10; i > 1; i--){Sytem.out.print(i + � �);}
10 9 8 7 6 5 4 3 2
		d.	for (int i = 0; i < 10; i++){Sytem.out.print(i + � �);}
0 1 2 3 4 5 6 7 8 9
		e.	for (int i = 1; i < 10; i = i * 2){Sytem.out.print(i + � �);}
1 2 4 8
		f.	for (int i = 1; i < 10; i++){if(i % 2 == 0){Sytem.out.print(i + � �);}}
	3.	Provide trace tables of the following loops.
		a.	int s = 1;
			int n = 1;
			while(s < 10) { s = s + n;}
			n++;
		b.	int s = 1;
			for(int n = 1; n < 5; n++){ s = s + n;}
		c.	int s = 1;
			int n = 1;
			do
			{ s = s + n;
			  n++;}
			while(s < 10 * n);
Exercises:
1.	Write a program that reads a sequence of integer inputs to print
a.	The smallest and largest of the inputs.
b.	The number of even and odd inputs.
c.	Cumulative totals. For example, if the input is 1 7 2 9, the program should print 1 8 10 19.
d.	All Adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the program should print 3 5 6.
2.	Write programs that read a line of input as a string and print
a.	Only the uppercase letters in the string.
b.	Every second letter of the string.
c.	The string, with all vowels replaced by an underscore.
d.	The number of vowels in the string.
e.	The positions of all vowels in the string.
3.	Write a program that reads a number and prints all of its binary digits: Print the remainder number % 2, then replace the number with number / 2. Keep going until the number is 0. For example, if the user provides the input 13, the output should be 
1
0
1
1
4.	Write a program that reads an integer and displays, using asterisks, a filling diamond of the given side length. For example, if the side length is 4, the program should display
   *
  ***
 *****
*******
 *****
  ***
   *
*/

public class Review03 {
	public static void main(String[] args) {
		Review03 r = new Review03();
		r.runExercises();
	}
	public void runExercises() {
		exercise1a();
	}
	public void exercise1a() {
		Scanner input = new Scanner(System.in);
		String result_a = "";
		int result_b_even = 0;
		int result_b_odd = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println(String.format("Number #%d :: ", i+1));
			int next = input.nextInt();
			result_a = result_a + String.format("%d ", next);
			if(next % 2 == 0) {
				result_b_even++;
			} else {
				result_b_odd++;
			}
		}
		System.out.println(result_a);
		input.close();
	}
}
