package com.improving.monopoly;

import com.improving.dice.Die;

public class Player {
	private Token token;
	private Square location;
	private int money;
	private int lastRoll;
	
	public Player(Token token, Square square, int money){
		this.token = token;
		this.money = money;
		this.location = square;
	}

	public Token getToken() {
		return this.token;
	}

	public int getMoney() {
		return money;
	}

	public Square getLocation() {
		return location;
	}
	
	public int getLastRoll() {
		return lastRoll;
	}

	public void takeTurn(Die die1, Die die2) {
		die1.roll();
		die2.roll();
		
		lastRoll = die1.getFaceValue() + die2.getFaceValue();
		
		for (int i = 0; i < lastRoll; i++) {
			location = location.getNextSquare();
		}
		
	}

}
