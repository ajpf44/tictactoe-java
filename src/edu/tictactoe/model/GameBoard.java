package edu.tictactoe.model;

public class GameBoard {
	public static final int n = 3;
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
	
	boolean update(int i, int j, int player) {
		if(board[i][j] == 0) {
			board[i][j] = player;
			return true;
		}
		
		return false;
	}
	
	public int[][] getBoard() {
		return board;
	}
}
