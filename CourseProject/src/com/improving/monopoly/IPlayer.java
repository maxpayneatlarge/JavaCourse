package com.improving.monopoly;

public interface IPlayer {

	Token getToken();

	int getMoney();

	Square getLocation();

	int getLastRoll();

}