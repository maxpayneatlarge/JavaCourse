package com.improving.ui;

import java.util.List;

import com.improving.monopoly.Game;
import com.improving.monopoly.Player;

public class MonopolyApp {

	public static void main(String[] args) {
		Game game = new Game(2);
		List<Player> players = game.getPlayers();
		
		for (int i = 0; i < 15; i++) {
			game.playRound();
			for (Player player : players) {
				System.out.println(player.getToken() + " rolled a "
						+ player.getLastRoll());
				System.out.println(player.getToken() + " landed on "
						+ player.getLocation().getName());
			}
		}
	}

}
