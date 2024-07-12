package edu.tictactoe.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameBoardTest {

	@Test
	void testUpdate() {
		GameBoard gb = new GameBoard();
		Player p = new Player("X",1 );
		gb.update(0, 0, p.getId());
		
		int[][] expectedBoard = new int[3][3];
		expectedBoard[0][0] = p.getId();
		
		Assertions.assertArrayEquals(expectedBoard, gb.getBoard());
	}
}
