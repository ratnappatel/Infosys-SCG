package com.infy.datatypes;

public class BreakContinueDemo {

	public static void main(String[] args) {

		// 1,2 ,3 ,4 5, 6,  8,  10
		int x=0;
		while(x<=10)
		{
			x++;
			if(x==7 || x==9)
				continue;
			System.out.print(x+", ");
		}
		System.out.println();
		
		// ignore printing 3 after 7 don't print any numbers.
		for(int i=1;i<=10;i++)
		{
			if(i==3)
				continue;
			else if(i>7)
				break;
			System.out.print(i+", ");
		}
	}
}
