package Unit8.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab14d
{
	public static void main( String args[] )
	{
		//add test cases
		for(int i = 10; i < 100; i += 10) {
			int[] nums = new int[20];
			for(int j = 0; j < 20; j++) {
				nums[j] = (int) (Math.random() * i);
			}
			System.out.println(new Grades(nums));
		}
	}
}