package Unit10.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordTester
{
	public static void main(String[] args)
	{
		for(int i = 0; i < 10; i++) {
			String s = "";
			char[] chars = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g' , 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
			for(int j = 0; j < 20; j++) {
				s += chars[(int) (Math.random() * 26)];
			}
			System.out.println(new Word(s));
		}
	}
}