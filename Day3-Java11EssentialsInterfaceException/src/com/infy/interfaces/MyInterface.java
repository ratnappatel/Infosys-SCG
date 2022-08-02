package com.infy.interfaces;

public interface MyInterface {
	int x=100;
	void display(); 
	//can be overriden 50km/hr 2500coins=75km/hr
	default void getDefault()
	{
		System.out.println("In Default Method .....");
	}
	
	//cannot be overriden
	static void getStatic()
	{
		System.out.println("In Static Method of Interface..");
	}
}
