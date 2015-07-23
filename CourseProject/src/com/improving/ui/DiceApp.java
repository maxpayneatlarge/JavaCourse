package com.improving.ui;

import com.improving.dice.Die;

public class DiceApp {
	
	public static void main(String[] args) {
		//roll the dice and get the faceValue
		Die d = new Die();
		d.roll();
		
		Die die2 = new Die();
		die2.roll();
		
		Die die3 = new Die(20);
		die3.roll();
		
		System.out.println("Result of Die roll: "+d.getFaceValue());
		System.out.println("Result of Die 2 roll: "+die2.getFaceValue());
		System.out.println("Result of 20 sided die roll: "+die3.getFaceValue());
	}
}
