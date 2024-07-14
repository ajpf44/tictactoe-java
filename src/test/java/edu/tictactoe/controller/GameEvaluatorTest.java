package edu.tictactoe.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import edu.tictactoe.model.GameBoard;

public class GameEvaluatorTest {

	@Test
	void testIsFinished() {
		GameBoard gBoard = new GameBoard();
		gBoard.update(0, 0, 1);
		gBoard.update(0, 1, 1);
		gBoard.update(0, 2, 1);
		
		int gameEval = GameEvaluator.isFinished(gBoard);
		
		Assertions.assertEquals(1, gameEval);
		
		
		GameBoard gBoard2 = new GameBoard();
		gBoard.update(0, 1, 2);
		gBoard.update(1, 1, 2);
		gBoard.update(2, 1, 2);
		
		int gameEval2 = GameEvaluator.isFinished(gBoard2);
		
		Assertions.assertEquals(2, gameEval2);
	}
}
