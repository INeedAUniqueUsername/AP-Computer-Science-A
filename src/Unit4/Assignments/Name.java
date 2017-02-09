package Unit4.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name() {
		setName("");
	}

	public Name(String s) {
		setName(s);
	}

   public void setName(String s) {
	   name = s;
   }

	public String getFirst() {
		return name.split(" ")[0];
	}

	public String getLast() {
		return name.split(" ")[1];
	}

 	public String toString() {
 		return name;
	}
}