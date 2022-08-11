package com.lyra.exercise.lilian.v1;

public enum Direction {
	North,
	South,
	West,
	East;
	
	public static Direction getShortName(String d) {
		
		for(Direction direction: Direction.values()) {
			if(direction.name().substring(0, 1).equalsIgnoreCase(d)) {
				return direction;
			}
		}
		
		return null;
	}
}
