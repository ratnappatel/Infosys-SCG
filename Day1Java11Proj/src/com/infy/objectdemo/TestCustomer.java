package com.infy.objectdemo;

public class TestCustomer {

	public static void main(String[] args) {

		// custom-object user-defined object
		Customer c1=new Customer(101,"abc");
		Customer c2=new Customer(101,"abc");
		
		if(c1==c2)
			System.out.println("c1 == c2");
		else
			System.out.println("c1 != c2");
		
			System.out.println("c1 = "+c1);// internally calling toString function
			System.out.println("c2 = "+c2);
			
			if(c1.equals(c2))
				System.out.println("c1 equals to c2");
			else
				System.out.println("c1 not equals to c2");	
	}

}
