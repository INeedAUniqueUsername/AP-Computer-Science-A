package FRQ_Warmup1;

public class Player extends Person {
	private final String PHRASE = "Hit Me!";
	public Player () { super(); }
	public Player (String name) { super(name); }
	@Override
	public String talk() { return PHRASE; }
	public String toString() { return super.toString() + PHRASE + "\n"; }
}