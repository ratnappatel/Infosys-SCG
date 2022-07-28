package com.infy.association;


import java.time.LocalDate;
import java.util.Date;


public class Myntra {

	public static void main(String[] args) {
		Product p1=new Product(1, "Laptop", 120000f);
		Product p2=new Product(26, "Bluetooth Headphone", 4599.98f);
		Product p3=new Product(38, "FitBit By Samsung", 5987.82f);
		
		Product products[]= {p1,p2,p3}; //added-to-cart
		
		Order o1=new Order(234, new Date(), products);
		o1.displayOrderDetails(); // displaying order details 
		
		Bill b1=new Bill(29,LocalDate.now(), "Credit-Card");
		b1.generateBill(o1);
	}

}
