package com.infy.datatypes;

public class LoopingConstructDemo {

	public static void main(String[] args) {

		// print hello message for 10 times
		// 1---> add 1 every time --->10 OR 0-9 OR 10-1 OR 9-0
		//for loop writes all three parameter
		for(int x=10;x>=1;x--)
			System.out.print("Hello, ");
		
		System.out.println("\n=====================================\n");
		int y=11;
		while(y<=10)
		{
			System.out.print("Loop : "+y+", ");
			y++;
		}
		
		// do-while loop executes minimum once even if the criteria does not match
		
		int a=1;
		do {
			System.out.print("Hi, ");
			a++;
		}while(a<=10);
	}

}
