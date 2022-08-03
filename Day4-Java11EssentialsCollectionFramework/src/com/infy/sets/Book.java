package com.infy.sets;

// Must design POJO which is self comparable for checking equality with other object
public class Book implements Comparable<Book> {
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
	
	public boolean equals(Object o1)
	{
		Book b1=(Book)o1;
		if(b1.isbn==this.isbn && b1.title.equals(this.title) && b1.noOfPages==this.noOfPages)
			return true;
		else
			return false;
					
	}
	
	public int hashCode()
	{
		int code=this.isbn+this.noOfPages+this.title.hashCode();
		return code;
	}
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", noOfPages=" + noOfPages + "]\n";
	}
	@Override
	public int compareTo(Book b) {
	
		int result=this.title.compareTo(b.title);
		return result;
	}
	

}
