package Unit8.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;

public class Lab14a
{
	public static void main( String args[] )
	{
		int[] one = {4,10,0,1,7,6,5,3,2,9};
	
		System.out.println(Arrays.toString(one));
		System.out.println("sum of spots 3-6  =  " + ArrayFunHouse.getSum(one,3,6));
		System.out.println("sum of spots 2-9  =  " + ArrayFunHouse.getSum(one,2,9));
		System.out.println("# of 4s  =  " + ArrayFunHouse.getCount(one,4));		
		System.out.println("# of 9s  =  " + ArrayFunHouse.getCount(one,9));				

		int[] two = {4,2,3,4,6,7,8,9,0,10,0,1,7,6,5,3,2,9,9,8,7};
		
		//add test cases
		
		for(int i = 10; i < 20; i++) {
			int[] test = new int[i];
			//Add i random numbers from 0 to i
			for(int j = 0; j < i; j++) {
				test[j] = (int) (Math.random()*i);
			}
			//2 sum tests
			System.out.println(Arrays.toString(test));
			for(int j = 0; j < 2; j++) {
				int start = (int) (Math.random()*(i/2));
				int end = start + (int) (Math.random()*(i/2));
				System.out.println(String.format("Sum of %d-%d = %d", start, end, ArrayFunHouse.getSum(test, start, end)));
			}
			//2 count tests
			for(int j = 0; j < 2; j++) {
				int value = (int) (Math.random() * i);
				System.out.println(String.format("Count of %ds = %d", value, ArrayFunHouse.getCount(test, value)));
			}
			//2 removal tests
			for(int j = 0; j < 2; j++) {
				int value = (int) (Math.random() * i);
				System.out.println(String.format("Removal of %ds = %s", value, Arrays.toString(ArrayFunHouse.removeVal(test, value))));
			}
		}
	}
}