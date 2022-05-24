package com.infy.datatypes;

import java.util.Scanner;

public class IncomeTaxCalc {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age .");
		int age=sc.nextInt();
		System.out.println("Enter Your Gender");
		String gender=sc.next();
		System.out.println("Enter Your CTC");
		double salary=sc.nextDouble();		
		
		System.out.println("Calculation is as below:");
		if(age<60)
		{
			if(gender.equalsIgnoreCase("female"))
			{
				if(salary<=500000)
					System.out.println("You have to Pay 5% TAX.");
				else if(salary>=1000000)
					System.out.println("You have to pay 10% TAX");
			}
			else if(gender.equalsIgnoreCase("male"))
			{
				if(salary<=500000)
					System.out.println("You have to Pay 10% TAX.");
				else if(salary>=1000000)
					System.out.println("You have to pay 15% TAX");
			}
			else
			{
				System.out.println("YET To Decide");
			}
		}
		else
		{
			System.out.println("You are not eligible to pay Income Tax");
		}
	}

}
