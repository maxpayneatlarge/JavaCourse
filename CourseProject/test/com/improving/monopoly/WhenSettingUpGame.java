package com.improving.monopoly;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class WhenSettingUpGame {

	@Test
	public void shouldHave40Squares() {
		//setup
		Game game = new Game();
		List<Square> squares = game.getSquares();
		assertEquals(40, squares.size());
	}
	
	@Test
	public void checkSquareNames(){
		Game game = new Game();
		List<Square> squares = game.getSquares();
		assertEquals("GO",squares.get(0).getName());
		for (int i = 1; i < squares.size(); i++) {
			assertEquals("Square "+i, squares.get(i).getName());
		}
	}
	
	@Test
	public void shouldDefaultTo2Players(){
		Game game = new Game();
		List<Player> players = game.getPlayers();
		assertEquals(2, players.size());
	}
	
	@Test
	public void shouldAllowMorePlayers(){
		Game game = new Game(8);
		List<Player> players = game.getPlayers();
		assertEquals(8, players.size());
	}
	
	@Test
	public void shouldHaveCorrectTokensAssigned(){
		Game game = new Game(8);
		List<Player> players = game.getPlayers();
		assertEquals(Token.Thimble, players.get(0).getToken());
		assertEquals(Token.Shoe, players.get(1).getToken());
		assertEquals(Token.Car, players.get(2).getToken());
		assertEquals(Token.TopHat, players.get(3).getToken());
		assertEquals(Token.Battleship, players.get(4).getToken());
		assertEquals(Token.Iron, players.get(5).getToken());
		assertEquals(Token.Dog, players.get(6).getToken());
		assertEquals(Token.Wheelbarrow, players.get(7).getToken());
	}
	
	@Test
	public void shouldHavePlayersStartWith$1500(){
		Game game = new Game(8);
		List<Player> players = game.getPlayers();
		for (int i = 0; i < players.size(); i++) {
			assertEquals(1500, players.get(i).getMoney());
		}
	}
	
	@Test
	public void shouldHavePlayersStartOnGo(){
		Game game = new Game(8);
		List<Player> players = game.getPlayers();
		List<Square> squares = game.getSquares();
		Square startSquare = squares.get(0);
		for (int i = 0; i < players.size(); i++) {
				assertEquals(startSquare,players.get(i).getLocation());
		}
	}
	
	@Test
	public void shouldHaveMoreThanOnePlayer(){
		try{
			Game game = new Game(1);
			fail("Should have thrown an exception!");
		}catch(IllegalArgumentException e){
			assertEquals("Not enough players!", e.getMessage());
		}
		
	}
	
	@Test
	public void shouldNotHaveMoreThan8Players(){
		try{
			Game game = new Game(10);
			fail("Should have thrown an exception");
		}catch(IllegalArgumentException e){
			assertEquals("Too many players!", e.getMessage());
		}
	}

}
