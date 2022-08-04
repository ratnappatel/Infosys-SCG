package com.infy.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AuthorArrayList {

	List<Author> authors;
	Author a1, a2, a3, a4, a5;

	public AuthorArrayList() {

		a1 = new Author(12, "a1", 324);
		a2 = new Author(27, "a7", 278);
		a3 = new Author(82, "a3", 84);
		a4 = new Author(47, "a8", 37);
		a5 = new Author(86, "a5", 90);
	}

	public void getArrayListImpl() {
		authors = new ArrayList<Author>();
		
		
		authors.add(a3);
		authors.add(a4);authors.add(a1);
		authors.add(a5);authors.add(a2);

		Iterator<Author> itr = authors.iterator();
		/*
		 * while(itr.hasNext()) {
		 * 
		 * Object obj=itr.next(); Author a=(Author)obj;
		 * 
		 * Author a=itr.next();
		 * 
		 * System.out.println("Author Id : "+a.getId());
		 * System.out.println("Author Name : "+a.getName());
		 * System.out.println("No. of Books Written : "+a.getNoOfBooks());
		 * 
		 * System.out.println(a+"\n"); }
		 */
		this.sortedList(authors);
	}

	public void sortedList(List list) {
		Collections.sort(list);
		System.out.println(list);
	}

	public void getLinkedListImpl() {
		LinkedList<Author> authors1 = new LinkedList<Author>();
		authors1.add(a1);
		authors1.addLast(a2);
		authors1.addFirst(a3);
		authors1.add(a4);
		authors1.addFirst(a5);

		System.out.println(authors1);
		this.sortedList(authors1);
		
		authors1.sort((a1,a2)->a1.getId()-a2.getId());
		System.out.println(authors1);
	}

	public static void main(String[] args) {

		AuthorArrayList al = new AuthorArrayList();
		al.getArrayListImpl();
		al.getLinkedListImpl();

	}

}
