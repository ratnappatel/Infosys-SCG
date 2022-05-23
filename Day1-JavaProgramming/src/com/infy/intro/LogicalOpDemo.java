package com.infy.intro;

import java.util.Scanner;

public class LogicalOpDemo {

	public static void main(String[] args) {
		System.out.println("Enter You User Name & Password");
		Scanner sc=new Scanner(System.in);
		
		// nextLine() == Today is my First Day on Java
		//next() == Today
		
		String uname=sc.next();
		String pwd=sc.next();
		// uname must Ratna and password must be ratna
		if(uname.equals("Ratna") || pwd.equals("ratna"))
			System.out.println("Welcome.....");
		else
			System.out.println("Authentication Failed....");

	}

}
