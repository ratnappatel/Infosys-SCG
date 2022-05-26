package com.infy.aggregation;

import java.util.Date;

public class Myntra {

	public static void main(String[] args) {
		Product p1=new Product(1, "Laptop", 120000f);
		Product p2=new Product(26, "Bluetooth Headphone", 4599.98f);
		Product p3=new Product(38, "FitBit By Samsung", 5987.82f);
		
		Product products[]= {p1,p2,p3};
		
		Order o1=new Order(101, new Date(), products);
		o1.displayOrderDetails();
	}

}
