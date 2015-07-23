package com.improving.monopoly;

public class IncomeTaxSquare extends Square {

		public IncomeTaxSquare(){
			super("Income Tax");
		}
		
		@Override
		public void landOnBy(Player player) {
			int amount = Math.min(player.getMoney()/10, 200);
			player.debit(amount);
		}
	
}
