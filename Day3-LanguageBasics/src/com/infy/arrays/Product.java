package com.infy.arrays;

public class Product {
	private int id;
	private String title;
	private float price;
	private String [] color; //10 p1[2] / p2[12]
	public Product() {
		color=new String[10];
	}

	public Product(int id, String title, float price, String[] color) {
		this.id = id;
		this.title = title;
		this.price = price;
		this.color = color;
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

	public String[] getColor() {
		return color;
	}

	public void setColor(String[] color) {
		this.color = color;
	}
	public void displayProductDetails()
	{
		System.out.println("Product Details are ******************************");
		System.out.println("Product Id : "+id);
		System.out.println("Product Title : "+title);
		System.out.println("Product Price : "+price);
		System.out.print("Product Available in Color : ");
		for(int i=0;i<color.length;i++)
			System.out.print(color[i]+", ");
		System.out.println("\n===============================================");
	}

	public static void main(String[] args) {
		String colors[]= {"Grey","Rose-Gold","White","Black"};
		
		Product p1=new Product(101, "iPhone-10", 2345.678f, colors);
		p1.displayProductDetails();
		
		System.out.println("Array of Products.....");
		
		Product products[]=new Product[5]; // An array of Object[user-defined/custom Objects]
		
		products[0]=new Product(1, "Title 1", 123.45f, colors);
		products[1]=new Product(2, "Title 2", 123.45f, colors);
		products[2]=new Product(3, "Title 3", 123.45f, colors);
		products[3]=new Product(4, "Title 4", 123.45f, colors);
		products[4]=new Product(5, "Title 5", 123.45f, colors);
		
		for(int i=0;i<products.length;i++)
			products[i].displayProductDetails();
		
		for(Product p: products)
			p.displayProductDetails();

	}

}
