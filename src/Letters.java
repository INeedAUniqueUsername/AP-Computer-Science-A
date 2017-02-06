import java.util.ArrayList;


public class Letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello World";
		int length = input.length();
		System.out.println(input);
		for(int i = 0; i < length-1; i++)
		{
			char here = input.charAt(i);
			char next = input.charAt(i+1);
			String before = input.substring(0, i);
			String after = input.substring(i+2);
			input = before + next + here + after;
			System.out.println(input);
		}
		/*
		char last = input.charAt(length - 1);
		char first = input.charAt(0);
		
		String between = input.substring(1, length - 1);
		input = last + between + first;
		System.out.println(input);
		*/
	}

}
