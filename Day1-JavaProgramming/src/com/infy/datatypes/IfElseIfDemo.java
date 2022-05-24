package com.infy.datatypes;

import java.util.Scanner;

public class IfElseIfDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Day name");
		String day=sc.next();
		
		if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") ||day.equals("thursday"))
			System.out.println("Ups they are working day in Vietnam");
		else if(day.equals("friday"))
			System.out.println("friday is not a weekend day in India");
		else if(day.equals("saturday") || day.equals("sunday"))
			System.out.println("The days are always a holiday ");
		else
				System.out.println("Invalid Day Name");
			
	}

}
