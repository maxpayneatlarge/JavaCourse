package com.improving.monopoly;

import java.util.ArrayList;
import java.util.List;

import com.improving.dice.Die;

public class Game{

	private List<Square> squares;
	private List<Player> players;
	private Die die1;
	private Die die2;
	
	public Game(int numberOfPlayers){
		if(numberOfPlayers<2){
			throw new IllegalArgumentException("Not enough players!");
		}
		if(numberOfPlayers>8){
			throw new IllegalArgumentException("Too many players!");
		}
		
		buildSquares();
		linkSquares();
		buildPlayers(numberOfPlayers);
		buildDice();
	}


	private void buildDice() {
		die1 = new Die();
		die2 = new Die();
	}

	private void buildPlayers(int numberOfPlayers) {
		players = new ArrayList<>();
		for (int i = 0; i < numberOfPlayers; i++) {
			players.add(new Player(Token.values()[i], squares.get(0), 1500));
		}
	}

	private void buildSquares() {
		squares = new ArrayList<>();
		for(int i=0; i< 40; i++){
			if(i==0){
				squares.add(new Square("GO"));
			}else{
				squares.add(new Square("Square "+i));
			}
		}
	}
	

	private void linkSquares() {
		
		for (int i = 0; i < squares.size()-1; i++) {
			Square currentSquare = squares.get(i);
			Square nextSquare = squares.get(i+1);
			currentSquare.setNextSquare(nextSquare);
		}
		Square lastSquare = squares.get(39);
		Square startSquare = squares.get(0);
		lastSquare.setNextSquare(startSquare);
	}
	
	public Game(){
		this(2);
	}
	
	
	public List<Square> getSquares() {
		return squares;
	}

	public List<Player> getPlayers() {
		return this.players;
	}

	public void playRound(){
		for (Player player : players) {
			player.takeTurn(die1, die2);
		}
	}
	
}
