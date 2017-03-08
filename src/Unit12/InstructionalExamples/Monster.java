package Unit12.InstructionalExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster
{
	private String name;
	private int howBig;	

	public Monster()
	{
		this("", 0);
	}

	public Monster(String n, int size)
	{
		setName(n);
		setSize(size);
	}
	public void setName(String s) {
		name = s;
	}
	public String getName()
	{
		return name;
	}
	public void setSize(int s) {
		howBig = s;
	}
	public int getHowBig()
	{
		return howBig;
	}
	
	public boolean isBigger(Monster other)
	{
		return howBig > other.getHowBig();
	}
	
	public boolean isSmaller(Monster other)
	{
		//call isBigger() use !
		return !isBigger(other);
	}

	public boolean namesTheSame(Monster other)
	{
		return name.equals(other.getName());
	}
	
	public String toString()
	{
		return String.format("%s %d", name, howBig);
	}
}