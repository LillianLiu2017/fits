package com.lyra.exercise.lilian.v1;

/*
 * clarify the size of the Pitch
 */

public class PitchGrid {
	
	    private int minX; // define the number in the bottom left corner
		private int maxX;
		private int minY;
		private int maxY;
		
		
		private static final int MIN_X = 0;
		private static final int MIN_Y = 0;

		
		public PitchGrid(int minX, int maxX, int minY, int maxY) {
			super();
			this.minX = minX;
			this.maxX = maxX;
			this.minY = minY;
			this.maxY = maxY;
		}
		
		public PitchGrid(int maxX, int maxY) {
			this(MIN_X, maxX, MIN_Y, maxY);
		}


		public int getMinX() {
			return minX;
		}

		public void setMinX(int minX) {
			this.minX = minX;
		}

		public int getMaxX() {
			return maxX;
		}

		public void setMaxX(int maxX) {
			this.maxX = maxX;
		}

		public int getMinY() {
			return minY;
		}

		public void setMinY(int minY) {
			this.minY = minY;
		}
		
		public int getMaxY() {
			return maxY;
		}

		public void setMaxY(int maxY) {
			this.maxY = maxY;
		}


		public boolean outofPitchBound (int x, int y ) {
		  return x > maxX || x < minX || y > maxY || y < maxY;
		}
		
}	
		
		

		

		
		

