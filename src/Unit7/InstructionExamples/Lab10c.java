package Unit7.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab10c
{
	public static void main(String args[])
	{
		for(int i = 0; i < 10; i++) {
			BiggestString b = new BiggestString(generateRandomString(), generateRandomString(), generateRandomString());
			System.out.println(b);
			System.out.println(String.format("biggest = %s", b.getBiggest()));
		}
	}
	public static String generateRandomString() {
		String result = "";
		for(int i = 0; i < 10; i++) {
			result += new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}[(int) (Math.random() * 26)];
		}
		return result;
	}
}