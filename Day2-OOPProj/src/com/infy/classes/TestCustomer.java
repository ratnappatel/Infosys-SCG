package com.infy.classes;

public class TestCustomer {

	
	public static void main(String[] args) {
		Customer ratna=new Customer("C156","Ratna",836353L,"abc");
		
		ratna.displayCustomerDetails();
		ratna.setContactNo(3534354646L);
		ratna.displayCustomerDetails();
		
	}

}
