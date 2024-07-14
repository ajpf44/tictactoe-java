package edu.tictactoe.controller;

import edu.tictactoe.model.GameBoard;


/**
 * 	A class to verify if the game is over, and evaluate who is the winner
 * */
public class GameEvaluator {

	public static String isFinished(GameBoard board) {
		
		int[][] gMatrix = board.getBoard();
		
		//verify lines for a winner;
		for(int i = 0; i < gMatrix.length; ++i) {
			for(int j =0; j < gMatrix[i].length; ++j) {
				System.out.printf("%d", gMatrix[i][j]);
			}
			System.out.println();
		}
		
		return "";
	}
}
