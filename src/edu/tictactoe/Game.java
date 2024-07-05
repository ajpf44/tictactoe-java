package edu.tictactoe;

import java.util.Scanner;

import edu.tictactoe.model.GameBoard;
import edu.tictactoe.view.BoardCLI;

public class Game {
	public static void main(String[] args) {
		BoardCLI.clear();
		BoardCLI.logGreetingsMsg();
		boolean playing = true;
		
		Scanner sc = new Scanner(System.in);
		GameBoard gBoard = new GameBoard();
		BoardCLI.logBoard(gBoard);
		
		while(playing) {
			System.out.printf("Play: ");
			String str =sc.nextLine();		
			
			BoardCLI.clear();
			BoardCLI.logBoard(gBoard);
		}
		
		sc.close();
		System.out.println("fim do programa");
	}
	
}
