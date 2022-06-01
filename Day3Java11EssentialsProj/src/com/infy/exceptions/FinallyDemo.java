package com.infy.exceptions;

public class FinallyDemo {

	public static void divide(int number1, int number2)
	{
		try 
		{
			int result=number1/number2;
			System.out.println("Division Result : "+result);
		} 
		catch (Exception e) {
		
			e.printStackTrace();
		}
		finally
		{
			System.out.println("I will be there always in any condition ....");
		}
	}
	public static void main(String[] args) {
		divide(10,0);
		divide(10,2);

	}

}
