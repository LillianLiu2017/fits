package com.lyra.exercise.lilian.v1;

public class Test {
	
	public static void main(String[] args) {
		InputStream inputStream = null; //new InputStream(" ", " ")
		Parser parser = new Parser();
		Trainee trainee = parser.createTrainee(inputStream.getCmd1());
		PitchGrid pitchGrid = parser.createPitchGrid(inputStream.getCmd2());
	}
}
