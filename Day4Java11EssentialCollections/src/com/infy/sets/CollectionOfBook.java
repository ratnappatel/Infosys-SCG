package com.infy.sets;

import java.util.HashSet;
import java.util.Set;

public class CollectionOfBook {

	public static void main(String[] args) {

		// Require Object comparison logic
		// To Compare user-defined/custom objects we must override equals + hashcode method
		Set<Book> books=new HashSet<Book>();
		
		books.add(new Book(2534,"Atomic Habits",819));
		books.add(new Book(1764,"The Japanese Secret to a happy life",765));
		books.add(new Book(8756,"A Gentleman in Moscow",467));
		books.add(new Book(2736,"The Subtle Art",735));
		books.add(new Book(2534,"Atomic Habits",819));
		
		System.out.println(books);
		
	}

}
