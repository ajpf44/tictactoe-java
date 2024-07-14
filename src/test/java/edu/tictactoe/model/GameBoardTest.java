package edu.tictactoe.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameBoardTest {

	@Test
	void testUpdate() {
		GameBoard gb = new GameBoard();
		gb.update(0, 0, 1);
		
		int[][] expectedBoard = new int[3][3];
		expectedBoard[0][0] = 1;
		
		Assertions.assertArrayEquals(expectedBoard, gb.getBoard());
	}
}
