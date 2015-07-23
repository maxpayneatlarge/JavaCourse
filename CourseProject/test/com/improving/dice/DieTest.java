package com.improving.dice;

import static org.junit.Assert.*;

import org.junit.Test;

public class DieTest {

	@Test
	public void testDieCreation_Not0(){
		Die testDie = new Die();
		assertNotEquals(0, testDie.getFaceValue());
	}
	
	@Test
	public void testRoll_MoreThan0() {
		//setup
		Die testDie = new Die();
		
		//exercise
		testDie.roll();
		
		//verify
		int value = testDie.getFaceValue();
		assertTrue(value>0);
	}
	
	@Test
	public void testRoll_LessThan7() {
		//setup
		Die testDie = new Die();
		
		//exercise
		testDie.roll();
		
		//verify
		int value = testDie.getFaceValue();
		assertTrue(value<7);
	}

}
