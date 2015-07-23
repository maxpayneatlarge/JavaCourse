package com.improving.monopoly;

public class GoSquare extends Square {
	public GoSquare(){
		super("GO");
	}
	
	@Override
	public void landOnBy(Player player) {
	}
	
	@Override
	public void passOverBy(Player player){
		player.credit(200);
	}
}
