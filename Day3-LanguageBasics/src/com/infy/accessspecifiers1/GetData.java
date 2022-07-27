package com.infy.accessspecifiers1;

public class GetData {

	Data d1=new Data(); // association
	public static void main(String[] args) {
		//instantiation
		Data d1=new Data();//4-int var = 4*4 = 16bytes will be allocated to an object
		//System.out.println("a = "+d1.a);
		//d1.privateMethod();
		
		System.out.println("b = "+d1.b);
		d1.protectedMethod();
		
		System.out.println("c = "+d1.c);
		d1.defaultMethod();
		
		System.out.println("d = "+d1.d);
		d1.publicMethod();
	}

}
