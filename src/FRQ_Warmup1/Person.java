package FRQ_Warmup1;
public abstract class Person {
	private String myName;
	public Person () {
		myName = "Playa";
	}
	public Person (String name) {
		myName = name;
	}
	public abstract String talk ();
	public String toString () {
		return myName + "\n";
		}
}