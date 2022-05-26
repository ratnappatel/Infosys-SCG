package com.infy.polymorphism;

public class RBIBank {
	
	private double availableBalace;
	
	public double getAvailableBalace() {
		return availableBalace;
	}
	public void setAvailableBalace(double availableBalace) {
		this.availableBalace = availableBalace;
	}
	public RBIBank(double initialBalace) {
		this.availableBalace=initialBalace;
	}
	public void calInterestQuaterly()
	{
		double interest=this.availableBalace*0.04;
		System.out.println("Interest for this Quater is(RBI) 4% :"+interest);
	}

}
