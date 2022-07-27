package com.infy.accessspecifiers2;

import com.infy.accessspecifiers1.Data;

public class InstanceDataAccess {

	public static void main(String[] args) {
		Data d1=new Data();//4-int var = 4*4 = 16bytes will be allocated to an object
		/*
		 * System.out.println("a = "+d1.a); d1.privateMethod();
		 * 
		 * System.out.println("b = "+d1.b); d1.protectedMethod(); //outside package
		 * withiut inheritance not available
		 * 
		 * System.out.println("c = "+d1.c); d1.defaultMethod();
		 */
		
		System.out.println("d = "+d1.d);
		d1.publicMethod();

	}

}
