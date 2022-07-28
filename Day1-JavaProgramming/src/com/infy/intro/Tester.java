package com.infy.intro;
class Printer {
	static {
		System.out.println("Static block in Printer class");
	}

	public void display(String message) {
		System.out.println(message);
	}
}

public class Tester {
	public static int sampleVariable = 1;

	static {
		System.out.println("Static block in Tester class");
	}

	public static void main(String[] args) {
		sampleVariable++;
		Printer p = null;
		System.out.println("In main");
		p.display("The value of sample variable is: " + sampleVariable);
	}
}