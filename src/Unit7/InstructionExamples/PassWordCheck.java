package Unit7.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
	private String password;

	public PasswordCheck()
	{
		setRandomPassword();
	}
	public void setRandomPassword() {
		String result = "";
		int length = (int) (Math.random()*10 + 10);
		for(int i = 1; i < length; i++) {
			result += new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}[(int) (Math.random() * 26)];
		}
		setPassword(result);
	}
	public void setPassword(String p) {
		password = p;
	}
	public void check()
	{
		System.out.println("Looks like you forgot your password. Quick, try to guess it!");
		Scanner keyboard = new Scanner(System.in);
		boolean active = true;
		int tries = 5;
		while(active) {
			String input = keyboard.nextLine();
			if(input.equals(password)) {
				System.out.println("Log in successful!");
				active = false;
			} else if(input.contains("forgot") && input.contains("my") && input.contains("password")) {
				System.out.println(String.format("This account's password is %s (TO DO: Implement actual Forgot My Password procedure)", password));
			} else {
				System.out.println("Invalid password!");
				tries--;
				if(tries < 1) {
					System.out.println("This account has been suspended");
					active = false;
				}
			}
		}
		
	}
}