package com.infy.datatypes;

public class BasicTrianglePattern {

	public static void main(String[] args) {
		int n=7;
		for(int i=0;i<n;i++) // row
		{
			for(int j=0;j<=i;j++)// column
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
