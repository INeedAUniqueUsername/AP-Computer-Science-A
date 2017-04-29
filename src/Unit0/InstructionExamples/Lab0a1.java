package Unit0.InstructionExamples;
//© A+ Computer Science  -  www.apluscompsci.com
//Name - John Doe
//Date - 2/1/17
//Class - AP Computer Science A
//Lab  - 0

public class Lab0a1
{
	public static void main(String[] args)
	{
		System.out.println("John Doe");
		System.out.println("2/1/17");
		System.out.println("Period 2");
		System.out.println("+++++++++++++++++++++++++ ");
		for(int i = 0; i < 23; i++)
		{
			if(Math.random() > 0.4)
				System.out.println(	"||||||||||||||||||||||||| " );
			else
				System.out.println("========================= ");
		}
		System.out.println("+++++++++++++++++++++++++ ");
	}
}