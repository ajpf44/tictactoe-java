package edu.tictactoe.model;

public class GameBoard {
	public static final int n = 3;
	/**
	 * matrix that represents the board of the game
	 * 0 for empty space, 1 for player 1 and 2 for player 2
	 * */
	private int[][] board;
	
	public GameBoard() {
		board = new int[n][n];
	}
	
	void restart() {
		for(int i =0;i < n; ++i) {
			for(int j =0; j < n; ++i) {
				board[i][j] = 0;
			}
		}
	}
	
	public boolean update(int i, int j, int playerId) {
		if(board[i][j] == 0) {
			board[i][j] = playerId;
			return true;
		}
		
		return false;
	}
	
	public int[][] getBoard() {
		return board;
	}
}
