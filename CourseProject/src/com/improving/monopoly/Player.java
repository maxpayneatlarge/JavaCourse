package com.improving.monopoly;

import com.improving.dice.Die;

public class Player implements IPlayer {
	private Token token;
	private Square location;
	private int money;
	private int lastRoll;
	
	public Player(Token token, Square square, int money){
		this.token = token;
		this.money = money;
		this.location = square;
	}

	/* (non-Javadoc)
	 * @see com.improving.monopoly.IPlayer#getToken()
	 */
	@Override
	public Token getToken() {
		return this.token;
	}

	/* (non-Javadoc)
	 * @see com.improving.monopoly.IPlayer#getMoney()
	 */
	@Override
	public int getMoney() {
		return money;
	}

	/* (non-Javadoc)
	 * @see com.improving.monopoly.IPlayer#getLocation()
	 */
	@Override
	public Square getLocation() {
		return location;
	}
	
	/* (non-Javadoc)
	 * @see com.improving.monopoly.IPlayer#getLastRoll()
	 */
	@Override
	public int getLastRoll() {
		return lastRoll;
	}

	public void takeTurn(Die die1, Die die2) {
		die1.roll();
		die2.roll();
		
		lastRoll = die1.getFaceValue() + die2.getFaceValue();
		
		for (int i = 0; i < lastRoll; i++) {
			location = location.getNextSquare();
			location.passOverBy(this);
		}
		
		location.landOnBy(this);
	}
	
	public void credit(int amount){
		this.money += amount;
	}

	public void debit(int amount) {
		this.money -= amount;
	}

}
