package com.improving.monopoly;

public class LuxuryTaxSquare extends Square {
	
	public LuxuryTaxSquare(){
		super("Luxury Tax");
	}
	
	@Override
	public void landOnBy(Player player) {
		player.debit(75);
	}
}
