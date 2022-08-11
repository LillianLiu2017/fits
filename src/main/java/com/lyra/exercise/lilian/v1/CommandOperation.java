package com.lyra.exercise.lilian.v1;

public class CommandOperation {
	private Direction currentdirection;
	private int xPos;
	private int yPos;


	public String process(String cmd, PitchGrid pitchgrid) throws Exception {
         if("M".equalsIgnoreCase(cmd)) {
			
			if(this.currentdirection == Direction.North) {
				this.yPos = this.yPos + 1;
			}else if (this.currentdirection == Direction.South) {
				this.yPos  = this.yPos -1;
			}else if (this.currentdirection == Direction.East) {
				this.xPos = this.xPos + 1;
			}else if (this.currentdirection == Direction.West) {
				this.xPos = this.xPos -1;
			}
			
			if(pitchgrid.outofPitchBound(this.xPos, this.yPos)) {
				throw new Exception("out of pitch");
			}
		}
		
		
		if("L".equalsIgnoreCase(cmd)) {
			if(this.currentdirection == Direction.North) {
				this.currentdirection = Direction.West;
 			}else if (this.currentdirection == Direction.South) {
 				this.currentdirection = Direction.East;
 			}else if (this.currentdirection == Direction.East) {
 				this.currentdirection = Direction.North;
 			}else if (this.currentdirection == Direction.West) {
 				this.currentdirection = Direction.South;
 			}
		}
		
 		
		if("R".equalsIgnoreCase(cmd)) {
			if(this.currentdirection == Direction.North) {
				this.currentdirection = Direction.East;
 			}else if (this.currentdirection == Direction.South) {
 				this.currentdirection = Direction.West;
 			}else if (this.currentdirection == Direction.East) {
 				this.currentdirection = Direction.South;
 			}else if (this.currentdirection == Direction.West) {
 				this.currentdirection = Direction.North;
 			}
		}
		
		
		return this.xPos + " "+ this.yPos;
		
		
		
		
	}


	}

