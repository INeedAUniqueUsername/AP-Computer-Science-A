package Unit9.Activities;


/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Deck test = new Deck(
				new String[] {"Scout", "Swordsman", "Archer"},
				new String[] {"Eyes", "Hands", "Feet"},
				new int[] {1, 5, 25}
				);
		System.out.println(test);
		test.shuffle();
		for(int i = 0; i < 5; i ++) {
			System.out.println(test.deal());
		}
		assert false : "a";
	}
	System.out.println(test);
}
