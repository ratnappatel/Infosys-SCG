package com.infy.lists;

public class Product implements Comparable<Product> {
	private int id;
	private String title;
	private double price;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String title, double price) {
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Product p) {
	
		int result=(int) (this.getPrice()-p.getPrice());
		System.out.println(this.getPrice()+" - "+p.getPrice());
		return result;
	}
}
