package com.infy.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		String emps[]=new String[10];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 Employee's name");
		for(int i=0;i<emps.length;i++)
		{
			emps[i]=sc.next();
		}
		for(int i=0;i<emps.length;i++)
			System.out.println("emps ["+i+"] = "+emps[i]);
		
		System.out.println("List of Employee's [A-Z]");
		// in memory sorting of elements
		/*
		 * for(int i=0;i<emps.length;i++) { for(int j=i+1;j<emps.length;j++) { String
		 * temp; if(emps[i].compareTo(emps[j])>0) { temp=emps[i]; emps[i]=emps[j];
		 * emps[j]=temp; } } }
		 */
		//algorithm for arrays
		
		Arrays.sort(emps); 
		for(int i=0;i<emps.length;i++)
			System.out.println("emps ["+i+"] = "+emps[i]);
		System.out.println("Enhanced For Loop \n");
		for(String s:emps)
			System.out.print(s+", ");
		
		
	}

}
