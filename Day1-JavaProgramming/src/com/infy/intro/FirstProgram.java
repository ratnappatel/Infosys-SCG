package com.infy.intro;

class FirstProgram {
	
	/*
	 * public static int sum(int no1,int no2) { return no1+no2; }
	 */
	// it must be this onlyyyyyyy
	
	// public/static  = keyword+modifier
	// keyword = defines return-type for a method [after completing 
	//execution of all statement within itself it will return nothing to calling program]
	//String args[] command line argument to the main method while executing program
	public static void main(String args[])
	{
		System.out.println("Hello n Welcome to the world of Programming..");
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		/*
		 * int result=sum(20,40);
		 * System.out.println("The Total of Given Nos. is "+result);
		 */
	}
}
