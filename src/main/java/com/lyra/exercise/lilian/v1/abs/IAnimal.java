package com.lyra.exercise.lilian.v1.abs;

public interface IAnimal {
	
	int TOTAL = 5;
	int TOTAL_COUNT = 10;
	String NAME ="abc";
	
	
	public static final int TOTAL_ = 5;
	void move() ; // 
	public abstract void move1();
	
	default void a() {
		
	}
}
