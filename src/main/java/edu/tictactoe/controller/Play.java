package edu.tictactoe.controller;

import edu.tictactoe.model.GameBoard;

public class Play {
	public boolean updateBoard(GameBoard board, int i, int j, int playerId)
	{
		if( i >= 3 || i < 0 || j >= 3|| j < 0) return false;
		
		return board.update(i, j, playerId); 
	}
}
