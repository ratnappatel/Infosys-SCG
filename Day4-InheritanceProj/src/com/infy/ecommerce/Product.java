package com.infy.ecommerce;

public class Product {
	private String name;
	private float price;
	
	public Product() {
	}

	public Product(String name, float price) {
		this.name = name;
		this.price = price;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
		
	public void displayProductDetails()
	{
		System.out.println("Product Name : "+this.name);
		System.out.println("Product Price/item : "+this.price);
	}
	
	public float findProductPrice(String name)
	{
		if(name.equals("Laptop"))
			this.price=120000.00f;
		else if(name.equals("Portable-Table"))
			this.price=3450.50f;
		else if(name.equals("Mobile-Cover"))
			this.price=349.55f;
		return this.price;
	}

}
