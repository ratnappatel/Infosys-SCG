package com.infy.interfaces;

public interface MyInterface {

	int x=100;
	
	//all method inside an interface are by default static abstract
	default void show() 
	{
		System.out.println("A default method definition for interface");
	}
	static void show2()
	{
		System.out.println("static method of an Interface");
	}
}
