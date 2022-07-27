package com.infy.oops;

public class TestMethod {

	public static void main(String[] args) {

		CallByReferenceMethod ref=new CallByReferenceMethod(10, 20);
		CallByValueMethod val=new CallByValueMethod();
		
		int result=ref.product(ref);
		System.out.println("Product is : "+result);
		result=val.product(40, 30);
		System.out.println("Product is : "+result);
	}

}
