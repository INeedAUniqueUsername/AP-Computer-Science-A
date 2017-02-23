package Unit9.Activities;


import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {
	/**
	 * cards contains all the cards in the deck.
	 */
	private Card[] cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Card[] c = new Card[ranks.length * suits.length * values.length];
		int i = 0;
		for(String r : ranks) {
			for(String s : suits) {
				for(int v : values) {
					c[i]= new Card(r, s, v);
					i++;
				}
			}
		}
		setCards(c);
	}
	/*
	public void setCards(String[] r, String[] s, int[] pv) {
		cards = new ArrayList<Card>();
		for(int i = 0; i < r.length; i++) {
			cards.add(new Card(r[i], s[i], pv[i]));
		}
		size = cards.size();
	}
	*/

	public void setCards(Card[] c) {
		cards = c;
		size = c.length;
	}
	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		return size == 0;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
		
	}
	
	public void shufflePerfect() {
		Card[] shuffled = new Card[52];
		int k = 0;
		for(int j = 0; j <= 25; j++) {
			cards[k] = shuffled[k];
			k += 2;
		}
		k = 1;
		for(int j = 26; j <= 51; j++) {
			cards[j] = shuffled[k];
			k += 2;
		}
	}
	public void shuffleSelect() {
		for(int k = 51; k >= 1; k--) {
			int r = (int) (Math.random() * k);
			Card c_k = cards[k];
			Card c_r = cards[r];
			cards[k] = c_r;
			cards[r] = c_k;
		}
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		size --;
		return cards[size];
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards[k];
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.length - 1; k >= size; k--) {
			rtn = rtn + cards[k];
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.length) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}