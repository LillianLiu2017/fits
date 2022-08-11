package com.lyra.exercise.lilian.v1;


public class Trainee {

	private int xPos;
	private int yPos;
	private Direction currentdirection;
 
	public Trainee(int xPos, int yPos, Direction currentdirection ) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
		this.currentdirection = currentdirection;
 	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public Direction getCurrentdirection() {
		return currentdirection;
	}

	public void setCurrentdirection(Direction currentdirection) {
		this.currentdirection = currentdirection;
	}
}
	
	
	
		
		