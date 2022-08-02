package com.infy.interfaces;

@FunctionalInterface
public interface Mario {
	public void run();
	public default void displayGraphics() {}
	//public void fly();

}
