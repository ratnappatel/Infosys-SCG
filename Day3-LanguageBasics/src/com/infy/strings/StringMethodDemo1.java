package com.infy.strings;

import java.util.Scanner;

public class StringMethodDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Customer ID :");
		String id=sc.next();
		
		if(id.startsWith("C"))
			System.out.println("You have Entered valid Customer ID");
		else
			System.out.println("You did not Entered valid Customer ID");
		
		System.out.println("Enter your gmail id ");
		String email=sc.next();
		
		if(email.contains("@gmail"))
			System.out.println("Valid Gmail Id");
		else
			System.out.println("Invalid Gmail Id");
			
		/*
		 * System.out.println("Enter String to be reversed..."); String input=sc.next();
		 */
		
		String s1="Its raining outside.";
		s1=s1.toUpperCase();
		System.out.println(s1);
			
	}

}
