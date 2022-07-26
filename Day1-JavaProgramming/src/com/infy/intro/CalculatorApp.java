package com.infy.intro;

// to instruct JVM - Class Loader which will load pre-defined classes during runtime to support
//execution of our/yours program
import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		System.out.println("Enter Two Nos.");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		System.out.println(no1+" , "+no2);
		System.out.println("Choose an operation you would like to perform on your data?");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division ");
		System.out.println("5. EXIT");
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1: {
						int res=no1+no2;
						System.out.println("Total of Given Nos. is "+res);
						break;
					}
			case 2:{
						int res=(no1>no2)?no1-no2:no2-no1;
						System.out.println("Difference between Given Nos. is "+res);
						break;
				}
			case 3:{
						int res=no1*no2;
						System.out.println("Product of Given Nos. is "+res);
						break;
					}
			case 4:{
						int res=no1/no2;
						System.out.println("Division of Given Nos. is "+res);
						break;
				}
			default:
					break;
		}
	}

}
