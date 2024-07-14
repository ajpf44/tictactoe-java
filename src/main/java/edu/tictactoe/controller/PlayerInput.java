package edu.tictactoe.controller;

import java.util.Scanner;

import edu.tictactoe.model.Move;

public class PlayerInput {
	public static Move capture(Scanner sc) {
		String input = sc.nextLine();
		
		if(! validateInput(input)) {
			throw new IllegalArgumentException("Input it's not valid");
		}
		
		Move move = getMoveFromInput(input.trim());
		
		return move;
	}
	
	private static Move getMoveFromInput(String input) {
		int i;
		int j = Integer.parseInt(input.substring(1));
		char c = input.charAt(0);
		
		switch (c) {
			case 'a': 
				i = 0;
				break;
			case 'b': 
				i = 1;
				break;
			case 'c': 
				i = 2;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + c);
		}
		
		Move newMove = new Move(i,j -1);
		return newMove;
	}
	
	private static boolean validateInput(String input)
	{
		String inp = input.trim().toLowerCase();
		
		if(inp.length() != 2) return false;
		
		char[] validChars = {'a','b','c'};
		char charMove = inp.charAt(0);
		int intMove = Integer.parseInt(input.substring(1)) ;
		
		if(!arrayOfCharsIncludes(charMove, validChars)) return false;
		if(intMove > 3 || intMove < 1 ) return false;
		
		return true;
	}
	
	private static boolean arrayOfCharsIncludes(char character, char[] arrC) {
		for(char c: arrC) {
			if(character == c) return true;
		}
		
		return false;
	}
}
