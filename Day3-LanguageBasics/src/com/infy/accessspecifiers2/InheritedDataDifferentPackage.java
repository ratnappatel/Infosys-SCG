package com.infy.accessspecifiers2;

import com.infy.accessspecifiers1.Data;

public class InheritedDataDifferentPackage extends Data{

	public InheritedDataDifferentPackage() {
			
		//System.out.println("a = "+a);
		//privateMethod();
		//System.out.println("c = "+c);
		//defaultMethod();
		
		System.out.println("b = "+b);
		protectedMethod();
		System.out.println("d = "+d);
		publicMethod();
	}
	public static void main(String[] args) {
		InheritedDataDifferentPackage d1=new InheritedDataDifferentPackage();//4-int var = 4*4 = 16bytes will be allocated to an object
	}

}
