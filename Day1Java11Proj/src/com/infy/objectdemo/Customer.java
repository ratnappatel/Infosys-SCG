package com.infy.objectdemo;

public class Customer {
	private int id;
	private String name;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	
	@Override
	public int hashCode() {
		System.out.println("hashcode invoked...");
		final int prime = 31;
		int result=this.id*prime;
		System.out.println("hashcode = "+result);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals invoked...");
		Customer c=(Customer)obj;
		
		if(this.id==c.id)
			return true;
		else
			return false;
			
	}
	
	@Override
	public String toString()
	{
		return "Customer ID : "+this.id+"\tCustomer Name : "+this.name;
	}

}
