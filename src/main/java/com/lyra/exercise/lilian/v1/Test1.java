package com.lyra.exercise.lilian.v1;

public class Test1 {

	public static void main(String[] args) {
		Position position = new Position();
		position.x = 3;
		position.y = 5;
		
		position.setX(3);
		position.setY(5);
		
		position = new Position(4, 6);
	}
}
