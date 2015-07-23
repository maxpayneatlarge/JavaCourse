package com.improving.monopoly;

public class Square {
	private String name;
	private Square nextSquare;
	
	public Square(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public Square getNextSquare() {
		return nextSquare;
	}
	
	public void setNextSquare(Square nextSquare){
		this.nextSquare = nextSquare;
	}
}
