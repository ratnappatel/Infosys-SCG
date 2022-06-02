package com.infy.sets;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedTreeSetDemo {

	public static void main(String[] args) {

		Set<Integer> sequences=new LinkedHashSet<Integer>();
		sequences.add(34);
		sequences.add(74);
		sequences.add(18);
		sequences.add(23);
		sequences.add(56);
		sequences.add(34);
		System.out.println("Unique & Ordered Collection [Maintaining Insertion Order of Elements]");
		System.out.println(sequences);
		
		
		Set<Integer> numbers=new TreeSet<Integer>();
		numbers.add(34);
		numbers.add(74);
		numbers.add(18);
		numbers.add(23);
		numbers.add(56);
		numbers.add(34);
		System.out.println("Unique & Sorted Collection By Default Ascending ...");
		System.out.println(numbers);
		
	}

}
