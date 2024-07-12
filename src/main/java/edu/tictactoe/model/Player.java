package edu.tictactoe.model;

public class Player 
{
	private int id;
	private int victories;
	
	public Player(String mark, int id)
	{
		super();
		this.id = id;
	}
		
	public int getId() {
		return id;
	}
	
	public int getVictories() {
		return victories;
	}
	
	public void setVictories(int victories) {
		this.victories = victories;
	}
}
