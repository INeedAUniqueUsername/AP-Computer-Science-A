package Unit9.Activities;


/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card {

	/**
	 * String value that holds the suit of the card
	 */
	private String suit;
	//public static final String[] SUITS = new String[] {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	/**
	 * String value that holds the rank of the card
	 */
	private String rank;
	//public static final String[] RANKS = new String[] {"Hearts", "Spades", "Diamonds", "Clubs"};

	/**
	 * int value that holds the point value.
	 */
	private int pointValue;

	/*
	public static String randomSuit() {
		return SUITS[(int) (Math.random() * 13)];
	}
	public static String randomRank() {
		return RANKS[(int) (Math.random() * 4)];
	}
	*/

   /**
	 * Creates a new <code>Card</code> instance.
	 *
	 * @param cardRank  a <code>String</code> value
	 *                  containing the rank of the card
	 * @param cardSuit  a <code>String</code> value
	 *                  containing the suit of the card
	 * @param cardPointValue an <code>int</code> value
	 *                  containing the point value of the card
	 */
	public Card(String cardRank, String cardSuit, int cardPointValue) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		setCard(cardRank, cardSuit, cardPointValue);
	}

	public void setCard(String r, String s, int pv) {
		rank = r; suit = s; pointValue = pv;
	}
	/**
	 * Accesses this <code>Card's</code> suit.
	 * @return this <code>Card's</code> suit.
	 */
	public String suit() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		return suit;
   }

	/**
	 * Accesses this <code>Card's</code> rank.
	 * @return this <code>Card's</code> rank.
	 */
	public String rank() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		return rank;
	}

   /**
	 * Accesses this <code>Card's</code> point value.
	 * @return this <code>Card's</code> point value.
	 */
	public int pointValue() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		return pointValue;
	}

	/** Compare this card with the argument.
	 * @param otherCard the other card to compare to this
	 * @return true if the rank, suit, and point value of this card
	 *              are equal to those of the argument;
	 *         false otherwise.
	 */
	public boolean matches(Card otherCard) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		return (
			suit == otherCard.suit() &&
			rank == otherCard.rank() &&
			pointValue == otherCard.pointValue()
			);
	}

	/**
	 * Converts the rank, suit, and point value into a string in the format
	 *     "[Rank] of [Suit] (point value = [PointValue])".
	 * This provides a useful way of printing the contents
	 * of a <code>Deck</code> in an easily readable format or performing
	 * other similar functions.
	 *
	 * @return a <code>String</code> containing the rank, suit,
	 *         and point value of the card.
	 */
	@Override
	public String toString() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		return String.format("%s of %s (%d points)", rank, suit, pointValue);
	}
}
