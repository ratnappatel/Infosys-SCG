package com.infy.abstraction;

public class Customer {

	public static void main(String[] args) {
		CustomerAccess myApp=new BankApp(95347,"986363644","abcgdsf jsdbv");
		System.out.println(myApp); // toString method will be invoked here
		myApp.setMobileNo("111111");
		System.out.println(myApp); 
	}
}
