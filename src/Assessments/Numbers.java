package Assessments;
public class Numbers {
	public static void main(String[] args) {
		for(int n : new int[]{12, 15, 26, 8, 1234}) {
			System.out.println(String.format("%d is %s", n, isGoofy(n) ? "goofy" : "not goofy"));
		}
		for(int n : getSomeGoofyNumbers(15)) {
			System.out.print(n + " ");
		}
	}
	
	public static boolean isGoofy(int num) {
		int sum = 0;
		int remaining = num;
		do {
			//Take the rightmost digit
			int digit = remaining%10;
			//Digit divisors are greater than zero and they divide evenly.
			if(digit > 0 && num % digit == 0) {
				//We have a digit divisor
				sum += digit;
			}
			//Take out the rightmost digit
			remaining /= 10;
		} while(remaining > 0); //If we still have digits
		return (sum % 2 == 1);
	}
	
	public static int[] getSomeGoofyNumbers(int count) {
		int[] result = new int[count];
		int k = 1;
		for(int i = 0; i < count; i++) {
			int n = -1;
			while(n == -1) {
				if(isGoofy(k)) {
					//Found it
					n = k;
				}
				k++; //Go to the next number
			}
			result[i] = n;
		}
		return result;
	}
}