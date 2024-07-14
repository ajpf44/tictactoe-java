package edu.tictactoe.controller;



import edu.tictactoe.model.GameBoard;


/**
 * 	A class to verify if the game is over, and evaluate who is the winner
 * */
public class GameEvaluator {

	public static int isFinished(GameBoard board) {
		
		int[][] gMatrix = board.getBoard();
		
		//verify lines for a winner;
		for(int i = 0; i < gMatrix.length; ++i) {
			int lineProd = 1;
			for(int j =0; j < gMatrix[i].length; ++j) {
				lineProd *= gMatrix[i][j];
			}
			if(lineProd == 1 || lineProd == 8) {
				System.out.println("Existe um ganhador");
				return (int) Math.cbrt(lineProd);
			}
		}
		
		//verify columns
		for(int i = 0; i < gMatrix.length; ++i) {
			int columnProd = 0;
			for(int j =0; j < gMatrix.length; ++j) {
				columnProd *= gMatrix[j][i];
			}
			if(columnProd == 1 || columnProd == 8) {
				System.out.println("Existe um ganhador");
				return (int) Math.cbrt(columnProd);
			}
		}
		
		return -1;
	}
}
