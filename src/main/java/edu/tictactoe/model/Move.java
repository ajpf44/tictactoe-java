package edu.tictactoe.model;

public class Move {
	private int i;
	private int j;
	
	public static boolean isValidMove(int i, int j) {
		return !( i >= 3 || i < 0 || j >= 3|| j < 0);
	}
	
	public Move() {}

	public Move(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
}
