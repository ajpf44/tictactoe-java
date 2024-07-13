package edu.tictactoe.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoveOptionsTest {

	@Test
	void testFromChar_existent() {
		char c = 'a';
		Assertions.assertEquals(MoveOptions.fromChar(c), MoveOptions.A);		
	}
	
	@Test
	void testFromChar_inexistent() {
		char c= 'm';
		Assertions.assertThrows(IllegalArgumentException.class,
				()-> MoveOptions.fromChar(c));
	}
}
