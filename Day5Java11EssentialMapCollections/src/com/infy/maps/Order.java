package com.infy.maps;

import java.util.Date;

public class Order
{
	private int id;
	private String orderDate;
	private int qty;
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(int id, String orderDate, int qty) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.qty = qty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + qty;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		Order other = (Order) obj;
		if (id != other.id)
			return false;
		if (qty != other.qty)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "\nOrder [id=" + id + ", orderDate=" + orderDate + ", qty=" + qty + "]";
	}
	
	
}
