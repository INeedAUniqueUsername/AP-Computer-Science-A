package Unit10.Assignments.Lab16d;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	String lib;
	
	public MadLib()
	{
		this("story.dat");
	}

	public MadLib(String fileName)
	{
		//load stuff
		loadNouns();
		loadVerbs();
		loadAdjectives();
		lib = "";
		try{
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNextLine()) {
				String line = file.nextLine();
				
				//Replace nouns
				for(char c : line.toCharArray()) {
					switch(c) {
					case '@' :
						lib += getRandomVerb();
						break;
					case '#' :
						lib += getRandomNoun();
						break;
					case '&' :
						lib += getRandomAdjective();
						break;
					default :
						lib += c;
						break;
					}
				}
				lib += "\n";
			}
		} catch(Exception e) {
			out.println(e);
			out.println("Houston we have a problem!");
		}
	}

	public void loadNouns()
	{
		try{
			nouns = new ArrayList<String>();
			Scanner file = new Scanner(new File("nouns.dat"));
			while(file.hasNextLine()) {
				nouns.add(file.nextLine());
			}
		}
		catch(Exception e)
		{
			out.println(e);
			out.println("\"Error,\" you say? Is that a noun?");
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			verbs = new ArrayList<String>();
			Scanner file = new Scanner(new File("verbs.dat"));
			while(file.hasNextLine()) {
				verbs.add(file.nextLine());
			}
		}
		catch(Exception e)
		{
			out.println(e);
			out.println("\"Catch,\" you say? Is that a verb?");
		}
	}

	public void loadAdjectives()
	{
		try{
			adjectives = new ArrayList<String>();
			Scanner file = new Scanner(new File("adjectives.dat"));
			while(file.hasNextLine()) {
				adjectives.add(file.nextLine());
			}
		}
		catch(Exception e)
		{
			out.println(e);
			out.println("\"Buggy,\" you say? Is that an adjective?");
		}
	}

	public String getRandomVerb()
	{
		return verbs.get((int) (Math.random()*verbs.size()));
	}
	
	public String getRandomNoun()
	{
		return nouns.get((int) (Math.random()*nouns.size()));
	}
	
	public String getRandomAdjective()
	{
		return adjectives.get((int) (Math.random()*adjectives.size()));
	}		

	public String toString()
	{
	   return lib;
	}
}