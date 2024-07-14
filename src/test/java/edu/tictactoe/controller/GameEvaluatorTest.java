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
	}
	
	@Test 
	void testIsFinished_column(){
		GameBoard gBoard = new GameBoard();
		gBoard.update(0, 1, 2);
		gBoard.update(1, 1, 2);
		gBoard.update(2, 1, 2);
		
		int gameEval2 = GameEvaluator.isFinished(gBoard);
		
		Assertions.assertEquals(2, gameEval2);
	}
	
	@Test
	void testIsFinished_diagonal() {
		//first diagonal
		GameBoard gBoard = new GameBoard();
		gBoard.update(0, 0, 2);
		gBoard.update(1, 1, 2);
		gBoard.update(2, 2, 2);
		
		int gameEval = GameEvaluator.isFinished(gBoard);
		
		Assertions.assertEquals(2, gameEval);
		
		//second diagonal
		GameBoard gBoard2 = new GameBoard();
		gBoard2.update(0, 2, 1);
		gBoard2.update(1, 1, 1);
		gBoard2.update(2, 0, 1);
		int gameEval2 = GameEvaluator.isFinished(gBoard2);
		Assertions.assertEquals(1, gameEval2);
	}
	
	@Test
	void testIsFinished_ongoing() {
		GameBoard gBoard = new GameBoard();
		gBoard.update(0, 0, 2);
		
		int gameEval = GameEvaluator.isFinished(gBoard);
		
		Assertions.assertEquals(0, gameEval);
	}
	
	@Test
	void testIsFinished_draw() {
		GameBoard gBoard = new GameBoard();
		gBoard.update(0, 0, 1);
		gBoard.update(0, 1, 2);
		gBoard.update(0, 2, 1);
		gBoard.update(1, 0, 2);
		gBoard.update(1, 1, 1);
		gBoard.update(1, 2, 1);
		gBoard.update(2, 0, 2);
		gBoard.update(2, 1, 1);
		gBoard.update(2, 2, 2);
		
		int gameEval = GameEvaluator.isFinished(gBoard);
		Assertions.assertEquals(-1, gameEval);
	}
}
