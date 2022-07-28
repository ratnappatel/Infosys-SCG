package com.infy.association;

// POJO class = data[private],getter/setter, default+argument cons
public class Product {
	
	private int id;
	private String title;
	private float price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String title, float price) {
		
		this.id = id;
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public void displayProductDetails()
	{
		System.out.println("\nDetail of Product "+this.title);
		System.out.println("Product Id : "+this.id);
		System.out.println("Product Price : "+this.price);
	}
	
	public String toString()
	{
		return "Id : "+this.id+"\nTitle : "+this.title+"\nPrice : "+this.price;
	}
	public static void main(String[] args) {
		Product p1=new Product();
		System.out.println(p1);
		//p1.displayProductDetails();
	}

}
