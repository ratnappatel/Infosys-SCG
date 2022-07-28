package com.infy.association;

import java.util.Date;

public class Order {
	
	//Property of the class
	private int id;
	private Date orderDate;
	// defines Has-a relationship titghtly-coupled
	private Product orderedProducts[];
	
	
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(int id, Date orderDate, Product[] orderedProducts) {
		
		this.id = id;
		this.orderDate = orderDate;
		this.orderedProducts = orderedProducts;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Product[] getOrderedProducts() {
		return orderedProducts;
	}
	public void setOrderedProducts(Product[] orderedProducts) {
		this.orderedProducts = orderedProducts;
	}	
	
	public void displayOrderDetails()
	{
		System.out.println("=========================================");
		System.out.println("Details of Order id : "+this.id);
		System.out.println("Date of Order Placed : "+this.orderDate);
		for(int i=0;i<orderedProducts.length;i++)
			orderedProducts[i].displayProductDetails();
		System.out.println();
	}
	public float getTotalCost()
	{
		float totalCost=0.0f;
		for(Product p:orderedProducts)
		{
			System.out.println(p.getPrice());
			totalCost+=p.getPrice();
		}
		return totalCost;
	}
}
