package com.infy.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> emps=new ArrayList<String>(5);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employees Name");
		
		/*
		 * for(int i=0;i<10;i++) emps.add(sc.next());
		 */

			emps.add("Ratna");
			emps.add("Pinakin");
			emps.add("Ketan");
			emps.add("Kalpana");
			emps.add("Mayur");
			emps.add("Bihari");
			emps.add("Manorama");
			emps.add("Gargesh");
			emps.add("Neelkanth");
			emps.add("Uttam");
			
			  emps.add("23.45"); //emps.add(192); emps.add(false);
			 
		
		
		System.out.println("The Size of Arraylist is : "+emps.size());
		
		System.out.println(emps); // toString() overriden by collection classes
		System.out.println("Sorted List of Employees");
		// algorithms for any collection type
		Collections.sort(emps);
		System.out.println(emps);
		
		emps.add(3, "Ghanshyam");
		System.out.println(emps);
		
		int index=emps.indexOf("Ratna");
		System.out.println("Element Ratna is @ "+index+" Index");
			
		
	}

}
