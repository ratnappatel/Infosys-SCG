package com.infy.exceptions;

public class ErrorDemo {

	public static void recursive(int i)
	{
		while(i!=0)
		{
			i--;
			System.out.print(i+", ");
			recursive(i);
		}
	}
	public static void main(String[] args) {
		recursive(10);
	}

}
