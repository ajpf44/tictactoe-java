package edu.tictactoe.controller;

import java.util.Scanner;

import edu.tictactoe.model.Move;

public class PlayerInput {
	public static Move capture(Scanner sc) {
		String input = sc.nextLine();
		System.out.println(input + " - " +input.length());
		sc.nextLine();
		
		if(! validateInput(input)) {
			throw new IllegalArgumentException("Input it's not valid");
		}
				
		//TODO implmentar isso daqui de baixo, qual deve ser o movimento
		//TODO escrever testes para esta classe
		Move move = new Move();
		return move;
	}
	
	private static boolean validateInput(String input)
	{
		String inp = input.trim().toLowerCase();
		
		if(inp.length() != 2) return false;
		
		char[] validChars = {'a','b','c'};
		char charMove = inp.charAt(0);
		int intMove = Integer.valueOf(inp.charAt(1));
		
		if(!arrayOfCharsIncludes(charMove, validChars)) return false;
		if(intMove >= 3 || intMove < 0 ) return false;
		
		return true;
	}
	
	private static boolean arrayOfCharsIncludes(char character, char[] arrC) {
		for(char c: arrC) {
			if(character == c) return true;
		}
		
		return false;
	}
}
