package edu.tictactoe.model;

public enum MoveOptions {
	A(0),
	B(0),
	C(0);
	
	private final int value;
	
	private MoveOptions(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public static MoveOptions fromChar(char c) {
		for(MoveOptions option: MoveOptions.values()) {
			if(option.name().equalsIgnoreCase(String.valueOf(c))) {
				return option;
			}
		}
		
		throw new IllegalArgumentException("No constant with character " + c + " found in MoveOptions enum");
	}
}
