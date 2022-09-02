package com.lyra.exercise.lilian.v1;

public class CommandOperation {
	private Direction currentdirection;
	private int xPos;
	private int yPos;


	public String process(String cmd, PitchGrid pitchgrid) throws Exception {
        
//		if("M".equalsIgnoreCase(cmd)) {
//			move(pitchgrid);
//		}
//		
//		
//		if("L".equalsIgnoreCase(cmd)) {
//			turnLeft();
//		}
//		
// 		
//		if("R".equalsIgnoreCase(cmd)) {
//			turnRight();
//		}
		
		switch (cmd) {
			case "M": move(pitchgrid); break;
			case "L": turnLeft();break;
			case "R": turnRight(); break;
			default:break;
		 
		}
		
		
		return this.xPos + " "+ this.yPos;
		
	}


	private void turnRight() {
		this.currentdirection = this.currentdirection.turnRight();
	}


	private void turnLeft() {
		this.currentdirection = this.currentdirection.turnLeft();

	}


	private void move(PitchGrid pitchgrid) throws Exception {
//		if(this.currentdirection == Direction.North) {
//			this.yPos = this.yPos + 1;
//		}else if (this.currentdirection == Direction.South) {
//			this.yPos  = this.yPos -1;
//		}else if (this.currentdirection == Direction.East) {
//			this.xPos = this.xPos + 1;
//		}else if (this.currentdirection == Direction.West) {
//			this.xPos = this.xPos -1;
//		}
		
		Position p = this.currentdirection.move(new Position(this.xPos, this.yPos));
		this.xPos = p.getX();
		this.yPos = p.getY();
		
		if(pitchgrid.outofPitchBound(this.xPos, this.yPos)) {
			throw new Exception("out of pitch");
		}
	}


	}

