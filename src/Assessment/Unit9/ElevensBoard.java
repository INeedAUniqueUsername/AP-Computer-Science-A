package Assessment.Unit9;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a triple of any cards
	 * whose values add to 11, and (2) a pair of face cards with the same rank
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		int cards = selectedCards.size();
		boolean result = (cards == 3 && containsTripleSum11(selectedCards)) || (cards == 2 && containsFacePair(selectedCards));
		print("Legal: " + result);
		return result;
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a triple of any cards whose values add to 11, or (2) a pair
	 * of face cards with the same rank.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		List<Integer> indexes = cardIndexes();
		boolean result = containsTripleSum11(indexes) || containsFacePair(indexes);
		print("Plays: " + result);
		return result;
	}

	/**
	 * Check for an 11-triple in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-triple.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-triple; false otherwise.
	 */
	private boolean containsTripleSum11(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		int indexes = selectedCards.size();
		
		for(int i = 0; i < indexes; i++) {
			int index_i = selectedCards.get(i);
			Card c_i = cardAt(index_i);
			
			for(int j = i+1; j < indexes; j++) {
				int index_j = selectedCards.get(j);
				Card c_j = cardAt(index_j);
				
				for(int k = j+1; k < indexes; k++) {
					int index_k = selectedCards.get(k);
					Card c_k = cardAt(index_k);
					
					print(String.format("Card %d: %d", index_i, c_i.pointValue()));
					print(String.format("Card %d: %d", index_j, c_j.pointValue()));
					
					if(c_i.pointValue() + c_j.pointValue() + c_k.pointValue() == 11) {
						print("Sum 11: True");
						return true;
					}
				}
			}
		}
		print("Triple Sum 11: False");
		return false;
	}

	/**
	 * Check for a pair of face cards in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a face pair.
	 * @return true if the board entries in selectedCards
	 *              include two face cards with the same rank.
	 */
	private boolean containsFacePair(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		int indexes = selectedCards.size();
		for(int i = 0; i < indexes; i++) {
			int index_i = selectedCards.get(i);
			Card c_i = cardAt(index_i);
			//If the card is not a face, then do not check it
			String c_i_rank = c_i.rank();
			switch(c_i_rank) {
			case "jack" :
			case "queen" :
			case "king" :
				for(int j = i+1; j < indexes; j++) {
					int index_j = selectedCards.get(j);
					Card c_j = cardAt(index_j);
					if(c_i_rank.equals(c_j.rank())) {
						print("Face Pair: False");
						return true;
					}
				}
				break;
			}
		}
		print("Face Pair: True");
		return false;
	}
	private void print(String message) {
		if(I_AM_DEBUGGING) {
			System.out.println(message);
		}
	}
}
