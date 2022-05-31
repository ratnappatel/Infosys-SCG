package com.infy.functionalInterface;

// An interface containing single abstract method is called SAM interface
@FunctionalInterface
public interface MyInterface {
	int product(int a,int b);
	default void show() {
		System.out.println("Default method inside Functional Interface");
	}
}
