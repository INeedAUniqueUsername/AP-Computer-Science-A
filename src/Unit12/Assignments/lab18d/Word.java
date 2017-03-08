package Unit12.Assignments.lab18d;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		setString(s);
	}

	public void setString(String s) {
		word = s;
	}
	public int compareTo( Word rhs )
	{
		String word_other = rhs.toString();
		int length_this = word.length();
		int length_other = word_other.length();
		int result = 0;
		if(length_this < length_other) {
			result = -1;
		} else if(length_this == length_other) {
			result = word.compareTo(word_other);
		} else if(length_this > length_other) {
			result = 1;
		}
		return result;
	}

	public String toString()
	{
		return word;
	}
}