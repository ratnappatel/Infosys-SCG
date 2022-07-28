package com.infy.oops;
public class Tester {

	public static void main(String[] args) {
		Tester tester = new Tester();
		tester.evaluate(4, 2.5f);
	}

	public void evaluate(int a, int b) {
		System.out.print("First evaluate method invoked");
		System.out.println(a + b);
	}

	public void evaluate(float a, float b) {
		System.out.print("Second evaluate method invoked");
		System.out.println(a + b);
	}
}
 