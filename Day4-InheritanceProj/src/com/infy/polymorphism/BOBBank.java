package com.infy.polymorphism;

public class BOBBank extends RBIBank{
	public BOBBank(double initialBalance) {
		super(initialBalance);
	}
	public void calInterestQuaterly()
	{
		double interest=this.getAvailableBalace()*0.07;
		System.out.println("Interest for this Quater is(BOB) :"+interest);
	}

}
