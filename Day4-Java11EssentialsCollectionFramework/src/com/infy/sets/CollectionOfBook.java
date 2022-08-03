package com.infy.sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

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
		
		TreeSet<Book> booksTree=new TreeSet<Book>();
		booksTree.add(new Book(2534,"Atomic Habits",819));
		booksTree.add(new Book(1764,"The Japanese Secret to a happy life",765));
		booksTree.add(new Book(8756,"A Gentleman in Moscow",467));
		booksTree.add(new Book(2736,"The Subtle Art",735));
		booksTree.add(new Book(2534,"Atomic Habits",819));
		
		System.out.println("========================================================");
		System.out.println(booksTree);
		
		
		}
		
	}

