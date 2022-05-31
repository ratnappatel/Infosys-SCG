package com.infy.functionalInterface;

public class MyInterfaceImpl2 {

	public static void main(String[] args) {
		// use lambda expression to override single abstract method
		// () -> {}
		MyInterface m= (a,b) -> a*b;
		System.out.println(m.product(12,12));

	}

}
