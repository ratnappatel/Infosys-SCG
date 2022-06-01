package com.infy.exceptions;

public class ExceptionHandling_01 {

	public static void main(String[] args) {
		System.out.println("Main Method Started......");
		
	
		int result=0;
		try // contains statement which may throw an exception
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]); // "abc" ==> int
			result=a/b; // Termination point for normal flow of program
		}
		// By Following Dynamic Binding create only one catch which takes base class argument for all the 3 exception class
		/*
		 * catch(Exception e) { if(e instanceof ArithmeticException)
		 * System.out.println("second argument could not be 0 "); else if(e instanceof
		 * ArrayIndexOutOfBoundsException)
		 * System.out.println("second argument is missing"); else if(e instanceof
		 * NumberFormatException)
		 * System.out.println("Input Arguments must be the valid number"); else
		 * System.out.println(e.getMessage()); }
		 */
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e)
		{
			e.printStackTrace();
		}
		/*
		 * catch(ArithmeticException ae) // put exception handling logic {
		 * System.out.println("second argument could not be 0 "); }
		 * catch(ArrayIndexOutOfBoundsException aie) // put exception handling logic {
		 * System.out.println("second argument is missing"); }
		 * catch(NumberFormatException ne) {
		 * System.out.println("Input Arguments must be the valid number"); }
		 */
		System.out.println("Division Result is : "+result);
		System.out.println("Main Method Exited......");
	}
	}
