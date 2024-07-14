package edu.tictactoe;

import java.util.Scanner;

import edu.tictactoe.controller.GameEvaluator;
import edu.tictactoe.controller.PlayerInput;
import edu.tictactoe.model.GameBoard;
import edu.tictactoe.model.Move;
import edu.tictactoe.view.BoardCLI;

public class Game {
	public static void main(String[] args) {
		BoardCLI.clear();
		boolean playing = true;
		
		Scanner sc = new Scanner(System.in);
		GameBoard gBoard = new GameBoard();
		
		BoardCLI.logGreetingsMsg();
		int rounds = 1;
		int playerRound = 1; 
		do{
			System.out.println("Round " + rounds);
			System.out.printf("Player %d round: \n", playerRound);
			BoardCLI.logBoard(gBoard);
			System.out.printf("Play: ");
			Move m = PlayerInput.capture(sc);
			boolean wasUpdated = gBoard.update(m.getI(), m.getJ(), playerRound);
			GameEvaluator.isFinished(gBoard);
			sc.nextLine();
			sc.nextLine();
			if( ! wasUpdated) {
				System.out.println("Error updating board");
			} else {
				System.out.println("Board updated");
			}
			playerRound = rounds%2 + 1;
			++rounds;
			
			BoardCLI.clear();
		}while(playing);
		
		sc.close();
		System.out.println("fim do programa");
	}
	
}
