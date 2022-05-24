package com.infy.datatypes;

import java.util.Scanner;

public class ByteLimitDemo {

	public static void main(String[] args) {
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		byte x=121;
		System.out.println("x = "+x);
		/*
		 * Scanner sc=new Scanner(System.in); x=sc.nextByte();
		 */
		System.out.println("x = "+x);
		
		int y=129; 
		x=(byte)y;// explicit type conversion
		System.out.println("x = "+x);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		int i=234;
		float j=354.965f;
		
		int res=(int)(i+j); // Explicit Conversion
		
		float r=i+j;
		System.out.println("The total is : "+res+" / in float "+r);
		
		byte a=12;
		int b=a; //implicity type conversion
		System.out.println("b = "+b);
		
		
	}

}
