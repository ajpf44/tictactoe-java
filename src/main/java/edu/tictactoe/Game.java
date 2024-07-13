package edu.tictactoe;

import java.util.Scanner;

import edu.tictactoe.controller.PlayerInput;
import edu.tictactoe.model.GameBoard;
import edu.tictactoe.view.BoardCLI;

public class Game {
	public static void main(String[] args) {
		BoardCLI.clear();
		boolean playing = true;
		
		Scanner sc = new Scanner(System.in);
		GameBoard gBoard = new GameBoard();
		
		BoardCLI.logGreetingsMsg();
		int rounds = 0;
		do{
			System.out.println("Round " + rounds);
			System.out.println("Player n round: ");
			
			BoardCLI.logBoard(gBoard);
			System.out.printf("Play: ");
			PlayerInput.capture(sc);
			BoardCLI.clear();
			++rounds;
		}while(playing);
		
		sc.close();
		System.out.println("fim do programa");
	}
	
}
