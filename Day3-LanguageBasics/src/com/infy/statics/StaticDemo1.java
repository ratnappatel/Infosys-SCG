package com.infy.statics;

public class StaticDemo1 {

	 static int amount;
	public StaticDemo1() {
		amount+=100;
	}
	public static void printAmount()
	{
		// static method can only access static var
		System.out.println("Current amount is : "+amount);
	}
	public void addAmount(int amount)
	{
		this.amount+=amount;	
		
	}
	static 
	{
		int a=100;
		System.out.println("Inside Static Block ");
		//amount=2000;
	}
	public static void main(String[] args) {
		System.out.println("Main Method Started...");
		StaticDemo1 d1=new StaticDemo1();
		d1.printAmount(); //100
		
		d1.addAmount(500); 
		StaticDemo1 d2=new StaticDemo1();
		d2.addAmount(100); 
		d2.printAmount(); // 200
		
		StaticDemo1 d3=new StaticDemo1();
		d3.printAmount();// 100
		
	}

}
