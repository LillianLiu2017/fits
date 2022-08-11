package com.lyra.exercise.lilian.v1;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class ParserTest {
	
	
	private Parser parser;
	
	@Before
	public void setup() {
		parser = new Parser();
	}
	
	@Test
	public void createPitchGrid_passValidCmd_returnPitchGrid() {
		final String cmd = "6 5";
		PitchGrid pitchGrid = parser.createPitchGrid(cmd);
		assertEquals(0, pitchGrid.getMinX());
		assertEquals(0, pitchGrid.getMinY());
		assertEquals(6, pitchGrid.getMaxX());
		assertEquals(5, pitchGrid.getMaxY());
		
	}

}
