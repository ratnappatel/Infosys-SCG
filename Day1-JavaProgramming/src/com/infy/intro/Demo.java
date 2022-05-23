package com.infy.intro;
class Demo {
	public static void main(String[] args) {
		// always initialize variables which are declared within method/function
		// BECAUSE THEY DO NOT HOLD DEFAULT VALUE
		int quantity=4;
		float totalCost = 10 * quantity; // error on this line
		System.out.println(totalCost);
		
		float x=10.3F;
	}
}
