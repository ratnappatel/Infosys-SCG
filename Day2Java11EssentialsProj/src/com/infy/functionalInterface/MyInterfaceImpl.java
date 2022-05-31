package com.infy.functionalInterface;

public class MyInterfaceImpl implements MyInterface {

	public static void main(String[] args) {
	
		MyInterface m=new MyInterfaceImpl();
		m.product(10, 20);
	}

	@Override
	public int product(int a,int b) {
		int product=a*b;
		System.out.println("The Product of a given Nos. "+product);
		return product;
		
	}

}
