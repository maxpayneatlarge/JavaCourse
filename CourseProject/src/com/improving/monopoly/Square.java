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

	public void landOnBy(Player player) {
		// TODO Auto-generated method stub
		
	}

	public void passOverBy(Player player) {
		
	}
	
	
}
