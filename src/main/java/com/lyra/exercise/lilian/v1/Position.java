package com.lyra.exercise.lilian.v1;

public class Position extends GenericPosition{
	
	 private int x = 3;
	
	 private int y = 5;
	
	 public Position( ) {
	 		 
		}
 
	
	public Position(int x, int y) {
 		super();
		this.x = x;
		this.y = y;
	}
	 
	 
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	

}
