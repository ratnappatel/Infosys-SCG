package com.infy.ecommerce;

import java.util.Date;
import java.util.Scanner;

public class ABCGroceryApp {

	public static void main(String[] args)
	{
		Product products[]=new Product[10]; // Product- is a user-defined/custom datatype
		Scanner sc=new Scanner(System.in);
		String name;
		Product p;
		int qty;
		String choice="yes";
		float totalCost=0.0f;
		int i=0;
		do 
		{
			p=new Product();
			System.out.println("Enter Product Name");
			name=sc.next(); // to read one string without any blank space
			p.setName(name);
			p.setPrice(p.findProductPrice(name));
			System.out.println("Enter Quantity Required.");
			qty=sc.nextInt();
			products[i++]=p;
			totalCost=totalCost+(qty*p.getPrice());
			p=null;
			
			
			System.out.println("Do you want to add more Products ?(yes/no)");
			choice=sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		
		Order o1=new Order(101,new Date(),totalCost,products);
		o1.displayOrderDetails();
	}

}
