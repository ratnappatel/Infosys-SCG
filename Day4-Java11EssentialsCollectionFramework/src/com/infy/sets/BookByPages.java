package com.infy.sets;

import java.util.Comparator;

public class BookByPages implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		int result=b1.getNoOfPages()-b2.getNoOfPages();
		return result;
	}

}
