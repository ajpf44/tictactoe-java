package edu.tictactoe.controller;

import edu.tictactoe.model.GameBoard;
import edu.tictactoe.model.Move;

public class Play {
	public static boolean updateBoard(GameBoard board, Move move, int playerId)
	{
		int i = move.getI();
		int j = move.getJ();
		if( i >= 3 || i < 0 || j >= 3|| j < 0) return false;
		
		return board.update(i, j, playerId); 
	}
}
