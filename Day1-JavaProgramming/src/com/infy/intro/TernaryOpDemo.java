package com.infy.intro;

public class TernaryOpDemo {

	public static void main(String[] args) {
		// convert string to number[int]
		int age=23;
		
		if(age>25)
			System.out.println("You are young");
		else
			System.out.println("You are Teenage");
		
		
		String output=age>25?"You are young":"You are Teenage";
		System.out.println(output);
		
		
		int a=100;
		int b=10;
		b+=a;
		System.out.println(b);
		

	}

}
