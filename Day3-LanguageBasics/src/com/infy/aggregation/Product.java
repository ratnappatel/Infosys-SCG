package com.infy.aggregation;

public class Product {
	
	private int id;
	private String title;
	private float price;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String title, float price) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
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

}
