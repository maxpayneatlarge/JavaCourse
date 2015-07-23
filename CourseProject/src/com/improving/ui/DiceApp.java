package com.improving.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		
		int value1 = d.getFaceValue();
		int value2 = die2.getFaceValue();
		int value3 = die3.getFaceValue();
		System.out.println("Value1 = "+value1);
		System.out.println("Value2 = "+value2);
		System.out.println("Value3 = "+value3);
		
		List<Die> dice = new ArrayList<>();
		dice.add(die3);
		dice.add(d);
		dice.add(die2);
		
		Collections.sort(dice);
		
		for (Die die : dice) {
			System.out.println(die.getFaceValue());
		}
	}
}
