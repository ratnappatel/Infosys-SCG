package com.infy.lists;

import java.util.ArrayList;
import java.util.Collections;

public class ProductList {

	public static void main(String[] args) {
		// Collection of custom/user-defined Object
		ArrayList<Product> products=new ArrayList<Product>();
		
		Product p1=new Product(101, "i-Phone", 125000.98);
		products.add(p1);
		products.add(new Product(123,"Wireless-Keyboard",765.45));
		products.add(new Product(178,"Buletooth Speaker",999.85));
		products.add(new Product(231,"Alex",4500.38));
		products.add(new Product(278,"Fire-Stick",1299.45));
		
		// Enhanced For Loop to print just the object details
		
		for(Product p:products)
		{
			System.out.println(p);// implicitly calls toString method
			
			System.out.println("=============================");
			System.out.println("Product ID : "+p.getId());
			System.out.println("Product Title : "+p.getTitle());
			System.out.println("Product Price : "+p.getPrice()+"\n");
		}
		
		Collections.sort(products);
		// Iterator can help us to iterate each element and print by modified output
		System.out.println("Sorted List of Products..\n");
		for(Product p:products)
			System.out.println(p);
	}

}
