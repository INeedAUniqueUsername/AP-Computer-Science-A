package FRQ_Warmup3;

public class TokenPass {
	private int[] board;
	private int currentPlayer;
	public TokenPass(int playerCount) {
		board = new int[playerCount];
		for(int i = 0; i < playerCount; i++) {
			board[i] = (int) (1 + Math.random() * 10);
		}
		int currentPlayer = (int) (Math.random() * playerCount);
	}
	public void distributeCurrentPlayerTokens() {
		int playerCount = board.length;
		int tokensLeft = board[currentPlayer];
		board[currentPlayer] = 0;
		int i = currentPlayer;
		while(tokensLeft > 0) {
			board[currentPlayer]++;
			i++;
			if(i >= board.length) {
				i = 0;
			}
		}
	}
}
