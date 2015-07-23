package com.improving.dice;

public class Die implements Comparable<Die>{
	
	private int faceValue;
	private int numberOfSides;
	
	public Die(int sides){
		this.numberOfSides = sides;
		this.faceValue = 1;
	}
	
	public Die(){
		this(6);
	}
	
	public void roll(){
		int result = (int) (Math.random() * this.numberOfSides) + 1;
		setFaceValue(result);
	}
	
	private void setFaceValue(int valueOfRoll){
		this.faceValue = valueOfRoll;
	}
	
	public int getFaceValue(){
		return this.faceValue;
	}

	@Override
	public int compareTo(Die otherDie) {
		return this.getFaceValue() - otherDie.getFaceValue();
	}
}
