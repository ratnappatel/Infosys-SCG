package com.infy.lists;

// POJO  = Custom Object / User-Defined Object
public class Author implements Comparable<Author> {
	
	private int id;
	private String name;
	private int noOfBooks;
	public Author() {
		// TODO Auto-generated constructor stub
	}
	public Author(int id, String name, int noOfBooks) {
		super();
		this.id = id;
		this.name = name;
		this.noOfBooks = noOfBooks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfBooks() {
		return noOfBooks;
	}
	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", noOfBooks=" + noOfBooks + "]\n";
	}
	
	@Override
	public int compareTo(Author o) {
		//int result=this.noOfBooks-o.getNoOfBooks();
		int result=this.name.compareTo(o.getName());
		return result;
	}

}
