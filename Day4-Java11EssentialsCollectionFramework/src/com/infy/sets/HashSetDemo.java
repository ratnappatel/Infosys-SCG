package com.infy.sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// gurantee unique elements collection [when we add elements it compares with an existing element in collection]

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer> numbers=new HashSet<Integer>();
		
		System.out.println(numbers.add(34));
		numbers.add(16);
		numbers.add(29);
		numbers.add(86);
		numbers.add(53);
		System.out.println(numbers.add(34));
		
		System.out.println(numbers);
		
		Set<String> movies=new HashSet<String>();
		Scanner sc=new Scanner(System.in);
		String choice="";
		do
		{
			System.out.println("Enter Movie Name to add in the collection");
			movies.add(sc.next());
			System.out.println("Would you like to add some more movies to the collection?(yes/no)");
			choice=sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		System.out.println("========================================");
		for(String movie: movies)
			System.out.println(movie);

	}

}
