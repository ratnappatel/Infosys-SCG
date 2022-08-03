package com.infy.sets;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BooksTreeSetLambdaExp {

	public static void main(String[] args) {
		Set<Book> books=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("On what basis you would like to sort Book List?");
		System.out.println("1. By Title");
		System.out.println("2. By ISBN No");
		System.out.println("3. By NoOfPages");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1: {
				books=new TreeSet<Book>();
				break;
			}
			case 2:
			{
				books=new TreeSet<Book>((b1,b2)->b1.getIsbn()-b2.getIsbn());
				break;
			}
			case 3:
			{
				books=new TreeSet<Book>((book1,book2)->book1.getNoOfPages()-book2.getNoOfPages());
				break;
			}
			default:
				System.out.println("Invalid Choice");
		}
		books.add(new Book(2534,"Atomic Habits",819));
		books.add(new Book(1764,"The Japanese Secret to a happy life",765));
		books.add(new Book(8756,"A Gentleman in Moscow",467));
		books.add(new Book(2736,"The Subtle Art",735));
		books.add(new Book(2534,"Atomic Habits",819));
		
		System.out.println(books);
	}

}
