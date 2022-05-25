package com.infy.accessspecifiers1;

public class InheritedData extends Data {
	public InheritedData() {
		//privateMethod();
		protectedMethod();
		defaultMethod();
		publicMethod();
		
		//System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		
	}

	public static void main(String[] args) {
		InheritedData id=new InheritedData();

	}

}
