package com.lyra.exercise.lilian.v1;

public class Parser {
	
 
	
	/*
	 *
	 *  5 5
		1 2 N
	 */


	public PitchGrid createPitchGrid(String cmd) {
		
		/*validation */
		
		int maxX = Integer.parseInt(cmd.split(" ")[0]);
		int maxY = Integer.parseInt(cmd.split(" ")[1]);
		return new PitchGrid(maxX, maxY);
	}
	
	public Trainee createTrainee(String cmd) {
		int xPos = Integer.parseInt(cmd.split(" ")[0]);
		int yPos = Integer.parseInt(cmd.split(" ")[1]);
		Direction direction = Direction.getShortName(cmd.split(" ")[2]);
		return new Trainee(xPos, yPos, direction);
	}
    
}
