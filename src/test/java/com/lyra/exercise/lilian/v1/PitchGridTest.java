package com.lyra.exercise.lilian.v1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PitchGridTest {
	
	private PitchGrid pitchGrid;
	
	
	@Before
	public void setup() {
		pitchGrid = new PitchGrid(6, 6);
	}
	
	@Test
	public void  outofPitchBound_passLocationValue_returnBooleanValue() {
		boolean actual = pitchGrid.outofPitchBound(3, 2);
		assertEquals(true, actual);
		
	}
   
	
}
