package com.infy.classes;

import java.util.Scanner;

public class Customer {

	// fields
	// Good Practice Programming in java says 
	//"always declare your class fields as private"
	private String customerId;
	private String customerName;
	private long contactNo;
	private String address;
	public Customer() {
		System.out.println("No-Args Constructor is called...");
	}
	
	public Customer(String customerId, String customerName, long contactNo, String address) {
		this(); // it will call no-arg constructor of this/current class
		System.out.println("Parameterized Constructor is Called...");
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNo = contactNo;
		this.address = address;
	}
	
	//getter = read current value of property
	public String getCustomerId()
	{
		return this.customerId;
	}
	
	// setter = update/change current value of property
	public void setCustomerId(String customerId)
	{
		this.customerId=customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		int otp=(int)(Math.random()*100000);
		System.out.println("OTP has sent to your registered mobile no  "+otp);
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input == otp)
			this.contactNo = contactNo;
		else
			System.out.println("OTP does not match ");
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void displayCustomerDetails()
	{
		System.out.println("Customer's details are given below::");
		System.out.println("Customer's ID : "+customerId);
		System.out.println("Customer's Name : "+customerName);
		System.out.println("Customer's Contact No : "+contactNo);
		System.out.println("Customer's Address : "+address);
	}
	
	
	public void payBill(double totalPrice, double discountPercentage) {
		System.out.println("Calculating final amount to be paid......");
		double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
		System.out.println("Hi " + customerName
				+ ", your final bill amount after discount is: "
				+ (int) (priceAfterDiscount * 100) / 100.0);
	}

	public void updateMobileNo(long no)
	{
		this.contactNo=no;
	}
	//functionalities
	public static void main(String[] args)
	{
		Customer neel=new Customer("C245","Neelkanth Patel",9601290547L,"B-507 Dwarika Apartment Manwa Kheda");// neel= reference variable
		neel.displayCustomerDetails();
		neel.payBill(289, 5.0);
		neel.updateMobileNo(23345544L);
		System.out.println("============================");
		neel.displayCustomerDetails();
		
		System.out.println("============================");
		Customer gargesh=new Customer("C875","Gargesh Patel",9828232711L,"2/5 Heerabagh Flats");
		neel=gargesh;
		gargesh.displayCustomerDetails();
		// once main method completes its execution 
		// neel object looses scope and will be marked as null
		
	}

}
