package com.lyra.exercise.lilian.v1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class DirectionTest {

	
	@Test
	public void getShortName_passValidCmd_returnDirection() {
		Direction[] expectedDirection = Direction.values();
		List<Direction> list = Arrays.asList(expectedDirection);
		String[] cmds = new String[] {"N","S","W","E"};
		
		for(int i =0; i< expectedDirection.length; i++) {
			assertEquals(list.get(i), Direction.getShortName(cmds[i]));
		}
		
	}
	
	// test exceptions if cmd is not valid
	@Test
	public void getShortName_passInvalidCmd_returnNull() {
		
		
		String[] cmds = new String[] {"A","B","C","D","F"};
		
		for(int j =0; j< cmds.length; j++) {
			assertEquals(null,Direction.getShortName(cmds[j]));
		}
	}
}