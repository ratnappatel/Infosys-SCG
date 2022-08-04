package com.infy.lambdas;

import java.util.Scanner;

public class LamdaExpDemo01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("What type of Loan you want?(Car|Home|Personal|Business)");
		String loanType=sc.next();
		System.out.println("What principle amount do you need as your loan amount?");
		double loanAmount=sc.nextDouble();
		System.out.println("For how many year you need the loan?");
		int years=sc.nextInt();
		
		CalculateInterest interest=null;
		switch(loanType)
		{
			case "Car":
			{
				interest=(amount,year)->(amount*0.077)*year;
				
				break;
			}
			case "Home":
			{
				 interest=(amount,year)->(amount*0.065)*year;
				
				break;
			}
			case "Personal":
			{
				interest=(double amount,int year)->(amount*0.080)*year;
				
				break;
			}
			case "Business":
			{
				interest=(double amount,int year)->(amount*0.085)*year;
				
				break;
			}
			default:
				System.out.println("Invalid Loan Type..");
		}
		double result=interest.calcInterest(loanAmount, years);
		System.out.println("The Total Interest on you "+loanType+" loan is : "+result);
	}

}

