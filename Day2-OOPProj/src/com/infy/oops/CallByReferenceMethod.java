package com.infy.oops;

public class CallByReferenceMethod {
	int a;
	int b;
	
	public CallByReferenceMethod(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int product(CallByReferenceMethod c1)
	{
		return this.a*this.b;
	}

}
