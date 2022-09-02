package com.lyra.exercise.lilian.v1;

public enum Direction implements ITurnable, IMoveable {
	North {

		@Override
		public Direction turnLeft() {
			return Direction.West;
		}

		@Override
		public Direction turnRight() {
			// TODO Auto-generated method stub
			return Direction.East;
		}

		@Override
		public Position move(Position position) {
			return new Position(position.getX(), position.getY() + 1);
		}
		
	},
	
	South{

		@Override
		public Direction turnLeft() {
			return Direction.East;
		}

		@Override
		public Direction turnRight() {
			// TODO Auto-generated method stub
			return Direction.West;
		}

		@Override
		public Position move(Position position) {
			return new Position(position.getX(), position.getY() -1);
		}
		
	},
	
	West{

		@Override
		public Direction turnLeft() {
			return Direction.South;
		}

		@Override
		public Direction turnRight() {
			// TODO Auto-generated method stub
			return Direction.North;
		}

		@Override
		public Position move(Position position) {
			return new Position(position.getX() -1, position.getY());
		}
		
	},
	East{

		@Override
		public Direction turnLeft() {
			return Direction.North;
		}

		@Override
		public Direction turnRight() {
			// TODO Auto-generated method stub
			return Direction.South;
		}

		@Override
		public Position move(Position position) {
			return new Position(position.getX() + 1, position.getY());
		}
		
	};
	
	 
	
//	South,
//	West,
//	East;
	
	public static Direction getShortName(String d) {
		
		for(Direction direction: Direction.values()) {
			if(direction.name().substring(0, 1).equalsIgnoreCase(d)) {
				return direction;
			}
		}
		
		return null;
	}
}
