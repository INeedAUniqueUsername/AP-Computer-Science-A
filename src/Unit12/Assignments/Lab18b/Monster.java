package Unit12.Assignments.Lab18b;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class Monster implements Comparable
{
	private int myHeight;
	private int myWeight;
	private int myAge;

	//write a default Constructor
	public Monster() {
		this(0, 0, 0);
	}
	//write an initialization constructor with an int parameter ht
	public Monster(int ht) {
		this(ht, 0, 0);
	}
	//write an initialization constructor with int parameters ht and wt
	public Monster(int ht, int wt) {
		this(ht, wt, 0);
	}
	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt, int age) {
		setWeight(wt);
		setHeight(ht);
		setAge(age);
	}
	//modifiers - write set methods for height, weight, and age
	public void setHeight(int ht) {
		myHeight = ht;
	}
	public void setWeight(int wt) {
		myWeight = wt;
	}
	public void setAge(int age) {
		myAge = age;
	}
	//accessors - write get methods for height, weight, and age
	public int getHeight() {
		return myHeight;
	}
	public int getWeight() {
		return myWeight;
	}
	public int getAge() {
		return myAge;
	}
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster(myHeight, myWeight, myAge);
	}

	public boolean equals( Object obj )
	{
		if(obj instanceof Monster) {
			Monster m = (Monster) obj;
			return (myWeight == m.getHeight() && myHeight == m.getWeight() && myAge == m.getAge());
		}
		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		int otherHeight = rhs.getHeight();
		int otherWeight = rhs.getWeight();
		int otherAge = rhs.getAge();
		int result = 0;
		for(int difference : new int[] {myHeight - otherHeight, myWeight - otherWeight, myAge - otherAge}) {
			if(difference != 0) {
				result = difference > 0 ? 1 : -1;
				break;
			}
		}
		return result;
		
	}

	//write a toString() method
	public String toString() {
		return String.format("%d %d %d", myHeight, myWeight, myAge);
	}
}