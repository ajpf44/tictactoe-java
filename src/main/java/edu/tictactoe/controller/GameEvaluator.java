package edu.tictactoe.controller;



import edu.tictactoe.model.GameBoard;


/**
 * 	A class to verify if the game is over, and evaluate who is the winner
 * */
public class GameEvaluator {

	public static int isFinished(GameBoard board)
	{
		
		int[][] gMatrix = board.getBoard();
		
		//verify lines for a winner;
		int linesResult = verifyLines(gMatrix);
		if(linesResult > 0) return linesResult; 
		
		int columnsResult = verifyColumns(gMatrix);
		if(columnsResult > 0) return columnsResult;
		
		//verify diagonal
		int diagonalResult = verifyDiagonal(gMatrix);
		if(diagonalResult > 0) return diagonalResult;
		
		if(isDraw(gMatrix)) {
			return -1;
		}
		
		return 0;
	}
	
	private static int verifyDiagonal(int[][] gMatrix) {
		int firstDiag_Prod = 1;
		for(int i =0; i < gMatrix.length; ++i) {
			firstDiag_Prod *= gMatrix[i][i];
		}
		if(firstDiag_Prod == 1 || firstDiag_Prod == 8 ) return (int) Math.cbrt(firstDiag_Prod);
		
		int secondDiag_Prod = gMatrix[0][2] * gMatrix[1][1] * gMatrix[2][0];
		if(secondDiag_Prod == 1 || secondDiag_Prod == 8 ) return (int) Math.cbrt(secondDiag_Prod);
		
		return -1;
	}
	
	private static int verifyColumns(int[][] gMatrix) {
		//verify columns
		for(int i = 0; i < gMatrix.length; ++i) {
			int columnProd = 1;
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
	
	private static int verifyLines(int[][] gMatrix) {
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
		
		return -1;
	}
	
	private static boolean isDraw(int[][] gMatrix) {
		int matrixProd = 1;
		for(int i =0; i < gMatrix.length; ++i) {
			for(int j = 0; j < gMatrix.length; ++j) {
				matrixProd *= gMatrix[i][j];
			}
		}
		
		if(matrixProd > 0) return true;
		
		return false;
	}
	
	
}
