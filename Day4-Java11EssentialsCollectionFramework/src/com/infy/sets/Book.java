package com.infy.sets;

public class Book {
	private int isbn;
	private String title;
	private int noOfPages;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(int isbn, String title, int noOfPages) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.noOfPages = noOfPages;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	
	@Override
	public int hashCode()
	{
		System.out.println("Hashcode ....");
		return this.isbn;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		System.out.println("Equals ....");
		Book b=(Book)obj;
		if(this.isbn== b.isbn && this.title.equals(b.title))
			return true;
		else
			return false;
		
	}
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", noOfPages=" + noOfPages + "]\n";
	}
	

}
