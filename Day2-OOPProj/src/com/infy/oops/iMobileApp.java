package com.infy.oops;

public class iMobileApp {

	//Encapsulated
	private int accountNo;
	private double balance;
	private String address;
	private String mobileNo;
	public iMobileApp(int accountNo, double balance, String address, String mobileNo) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.address = address;
		this.mobileNo = mobileNo;
	}
	
	//getter for mobileNo=read
	public int getAccountNo()
	{
		return this.accountNo;
	}
	
	/*
	 * public void setAccountNo(int accountNo) { this.accountNo=accountNo; }
	 */
	public double getBalance()
	{
		return this.balance;
	}
	
	public double deposite(double amount)
	{
		this.balance=this.balance+amount;
		return this.balance;
	}
	public double withdraw(double amount)
	{
		this.balance=this.balance-amount;
		return this.balance;
	}
	public static void main(String[] args) {
		int a=(int)((450*5)/100.0);
		System.out.println(a);
	}
	
}
