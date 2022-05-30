package com.infy.finaldemo;

public class FinalVarDemo {

	// final variables are constant and we cannot reassign value to it.
	private final int deliveryCharges=20;
	public FinalVarDemo(int charges) {
		//deliveryCharges=charges;
	}
	public int getDeliveryCharges()
	{
		return deliveryCharges;
	}
	public void changeDeliverCharges(int charges)
	{
		//this.deliveryCharges=charges;
		
	}
	
	public static void main(String[] args) {
		FinalVarDemo d1=new FinalVarDemo(200);
		System.out.println("The Delivery Charges are: "+d1.getDeliveryCharges());
		
	}

}
