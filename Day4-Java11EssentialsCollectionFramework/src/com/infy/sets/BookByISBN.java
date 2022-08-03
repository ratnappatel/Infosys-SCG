package com.infy.sets;

import java.util.Comparator;

public class BookByISBN implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		int result=b1.getIsbn()-b2.getIsbn();
		return result;
	}

}
