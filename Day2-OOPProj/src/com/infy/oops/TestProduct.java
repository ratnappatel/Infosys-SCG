package com.infy.oops;

public class TestProduct {

	public static void main(String[] args) {

		Product p1=new Product(123, "iPhone13", 1899999.00f, "Mobile");
		p1.calculateDiscountedPrice();
		System.out.println("Price after applying discount would be :"+p1.discountedPrice);
		
		Product p2=new Product(123, "IFB Automatic WashingMachine", 35000.890f, "Electronics");
		p2.calculateDiscountedPrice();
		System.out.println("Price after applying discount would be :"+p2.discountedPrice);
		
		Product p3=new Product(123, "Fairy Tales", 589.00f, "Books");
		p3.calculateDiscountedPrice();
		System.out.println("Price after applying discount would be :"+p3.discountedPrice);
		
		Product p4=new Product(123, "Wireless Mouse", 189.00f, "Laptop Accessories");
		p4.calculateDiscountedPrice();
		System.out.println("Price after applying discount would be :"+p4.discountedPrice);
		
				
	}

}
