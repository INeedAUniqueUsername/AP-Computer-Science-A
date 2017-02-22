package Unit9.Activities;


/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println(new Card(
					Card.randomSuit(),
					Card.randomRank(),
					(int) (Math.random() * 100)
					));
		}
	}
}
