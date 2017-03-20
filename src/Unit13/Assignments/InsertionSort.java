package Unit13.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{
		list = new ArrayList<>();
	}
	//modfiers
	public void add( String  word)
	{
		int loc = Collections.binarySearch(list, word);
		//out.println(String.format("Location: %d", loc));
		if(loc < 0) {
			loc = Math.abs(loc)-1;
			if(loc > list.size()) {
				//out.println(String.format("Appending %s", word));
				list.add(word);
			} else {
				//out.println(String.format("Adding %s at %d", word, loc));
				list.add(loc, word);
			}
		}
	}
	public void remove(String word)
	{
		list.remove(word);
	}

	public String toString()
	{
		return list.toString();
	}
}