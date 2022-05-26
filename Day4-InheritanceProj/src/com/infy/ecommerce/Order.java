package com.infy.ecommerce;

import java.util.Date;

public class Order {
	
	private int number;
	private Date orderDate;
	private float orderCost;
	private Product [] orderedProducts;
		
	public Order() {
		// TODO Auto-generated constructor stub
	}

	
	public Order(int number, Date orderDate, float orderCost, Product[] orderedProducts) {
		super();
		this.number = number;
		this.orderDate = orderDate;
		this.orderCost = orderCost;
		this.orderedProducts = orderedProducts;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public float getOrderCost() {
		return orderCost;
	}


	public void setOrderCost(float orderCost) {
		this.orderCost = orderCost;
	}


	public Product[] getOrderedProducts() {
		return orderedProducts;
	}


	public void setOrderedProducts(Product[] orderedProducts) {
		this.orderedProducts = orderedProducts;
	}


	public void displayOrderDetails()
	{
		System.out.println("Order Number : "+this.number);
		System.out.println("Order Value : "+this.orderCost);
		System.out.println("Product Ordered : ");
		System.out.println("-----------------------------------");
		// Enhanced For Loop
		// for(int i=0;i<orderedProducts.length;i++)
			//orderedProduct[i].displayProductDetails();
		for(Product p:orderedProducts)
		{
			if(p==null)
				break;
			else
				p.displayProductDetails();
		}
		
	}
	//placing an order = = creating an object of the class
	
	

}
