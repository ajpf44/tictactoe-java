package edu.tictactoe.view;

import edu.tictactoe.model.GameBoard;

public class BoardCLI {
	
	public static void logBoard(GameBoard gameBoard) 
	{
		int[][] board = gameBoard.getBoard();
		String[] rowsChar = {"A", "B", "C"};
		
		System.out.println("   1  2  3");
		for(int i=0; i < GameBoard.n; ++i) {
			System.out.printf(rowsChar[i] + " ");
			for(int j =0; j < GameBoard.n; ++j) {
				String str = boardChar(board[i][j]);
				
				if(j != GameBoard.n - 1)
					str += " | ";
				else
					str += "\n";
				
				System.out.printf(str);
			}
			if(i != GameBoard.n - 1)
				System.out.println("  ---------");
		}
	}
	
	public static void logMatrix(GameBoard gBoard) {
		int[][] matrixBoard = gBoard.getBoard(); 
		
		for(int i =0;i < matrixBoard.length; ++i) {
			for(int j =0; j < matrixBoard[i].length; ++i) {
				System.out.printf("%d", matrixBoard[i][j]);
			}
			System.out.println();
		}
	}
	
	private static String boardChar(int mark) {
		if(mark == 0) return " ";
		if(mark == 1) return "X";
		return  "O";
	}
	
	public static void clear() {
		System.out.printf("\033[H\033[2J"); 
		System.out.flush();
	}
	
	public static void logGreetingsMsg() {
		System.out.println("Welcome to Tic Tac Toe CLI game");
	}
}
