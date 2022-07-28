package com.infy.association;

import java.util.Scanner;

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
		this.price=price;
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
		// create an application which will add product into product array using runtime input
		Scanner sc=new Scanner(System.in);
		
		Product products[]=new Product[5];
		for(int i=0;i<5;i++)
		{
			Product p=new Product();
			System.out.println("Enter Product ID :");
			int id=sc.nextInt();
			System.out.println("Enter Product Title : ");
			String title=sc.next();
			System.out.println("Enter Product Price : ");
			float price=sc.nextFloat();
			
			p.setId(id);
			p.setTitle(title);
			p.setPrice(price);
			
			products[i]=p;
			
		}
		for(Product p:products)
			p.displayProductDetails();
	}
	

}
