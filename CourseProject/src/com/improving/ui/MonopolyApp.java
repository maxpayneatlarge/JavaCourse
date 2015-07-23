package com.improving.ui;

import java.util.List;

import com.improving.monopoly.Game;
import com.improving.monopoly.IPlayer;
import com.improving.monopoly.Player;

public class MonopolyApp {

	public static void main(String[] args) {
		Game game = new Game(2);
		List<Player> players = game.getPlayers();
		
		for (int i = 0; i < 45; i++) {
			game.playRound();
			for (IPlayer player : players) {
				System.out.println("Round "+i);
				System.out.println(player.getToken() + " rolled a "
						+ player.getLastRoll());
				System.out.println(player.getToken() + " landed on "
						+ player.getLocation().getName());
				System.out.println(player.getToken() + " has $"+player.getMoney());
			}
		}
	}

}
