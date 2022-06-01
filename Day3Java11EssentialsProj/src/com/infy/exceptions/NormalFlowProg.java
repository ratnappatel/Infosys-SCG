package com.infy.exceptions;

public class NormalFlowProg {

	public static void main(String[] args) {

		System.out.println("Main method started....");
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi Everyone....");
			if(i<3)
			{
				int res=23/2; // Logical Error == Exception[ArithmeticException]
			}
		}
		System.out.println("Main method Exited....");
	}

}
