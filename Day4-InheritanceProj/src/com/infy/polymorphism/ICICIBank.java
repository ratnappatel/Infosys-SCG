package com.infy.polymorphism;

public class ICICIBank extends RBIBank{

	public ICICIBank(double initialBalance) {
		super(initialBalance);
	}
	public void calInterestQuaterly()
	{
		double interest=this.getAvailableBalace()*0.065;
		System.out.println("Interest for this Quater is(ICICI) :"+interest);
	}
	public void display()
	{
		System.out.println("From ICICI");
	}
}
