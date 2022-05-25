package com.infy.strings;

import java.util.Scanner;

public class StringMethodToReverse {

	public static void main(String[] args) 
	{
		/*
		 * // using toCharArray method Scanner sc=new Scanner(System.in); String
		 * input=sc.next();
		 * 
		 * char arr[]=input.toCharArray(); String reverseInput=""; for(int
		 * i=arr.length-1;i>=0;i--) reverseInput=reverseInput+arr[i];
		 * 
		 * System.out.println(reverseInput);
		 * 
		 * // USING charAt method String input1=sc.next(); String res=""; for(int
		 * i=input1.length()-1;i>=0;i--) { res=res+input1.charAt(i);
		 * System.out.println(res); }
		 * 
		 * System.out.println(res);
		 */
		String str="Today is Wednesday. Its yet Half a way to go..";
		String subStr=str.substring(15);
		System.out.println("String from 5th char onwards is : "+subStr);
		
		String middle=str.substring(10, 22);
		System.out.println("String in the middle is : "+middle);
		
	}

}
