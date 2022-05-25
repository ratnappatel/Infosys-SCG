package com.infy.strings;

public class StringModificationDemo {

	public static void main(String[] args) {

		String s1="Hello";
		String s2="Hello";
		
		System.out.println("s1 hashcode = "+s1.hashCode());
		System.out.println("s2 hashcode = "+s2.hashCode());
		
		// Strings in Java are Immutable Object
		s1=s1+" World"; // at this line new object will get 
		//created to accomodate modification
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		
		System.out.println("s1 hashcode = "+s1.hashCode());
		System.out.println("s2 hashcode = "+s2.hashCode());
	}

}
