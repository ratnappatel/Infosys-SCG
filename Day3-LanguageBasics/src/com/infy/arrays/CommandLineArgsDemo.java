package com.infy.arrays;

public class CommandLineArgsDemo {

	public static void main(String[] args) {

		// How to conver input from one type to other
		// "10" "20" ==> "10"+"20" ==> 1020
		// String to int[Integer] ==> parsing string to an int value
		// targeted data type ==> its wrapper class to find method which takes
		//source datatype(string)
		// "10" = 10
		
		int no1=Integer.parseInt(args[0]);
		int no2=Integer.parseInt(args[1]);
		int product=no1+no2;
		
		
		System.out.println("Product of Given Nos. = "+product);
	}

}
