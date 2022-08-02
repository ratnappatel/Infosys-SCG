package com.infy.interfaces;

public class MyInterfaceImpl implements MyInterface {

	public static void main(String[] args) {
		MyInterface m1=new MyInterfaceImpl();
		m1.display();
		m1.getDefault();
		//m1.message("Ratna");
		MyInterface.getStatic();
		MyInterfaceImpl.getStatic();
	}
	//If we don't override it will use default definition provided within interface itself
	public void getDefault()
	{
		System.out.println("Defined/Overriden by implementation class.");
	}
	@Override
	public void display() {
		System.out.println(MyInterface.x);
		System.out.println("Overriding display method...");
		
	}
	public void message(String name)
	{
		System.out.println("Hello "+name);
	}
	
	//@Override
	public static void getStatic()
	{
		System.out.println("In Static of class Impl..");
	}
}
