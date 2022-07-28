package com.infy.polymorphism;

public class CalculatorApp {

	// Method Overloading
	public void add(int x,float y)
	{
		float result=x+y;
		System.out.println("Total of Give Nos is : "+result);
	}
	public void add(int a,float b,int c)
	{
		float result=a+b+c;
		System.out.println("Total of Given Nos is : "+result);
	}
	public void add(float p,int q)
	{
		float result=p+q;
		System.out.println("Total of Given Nos is : "+result);
	}
	public void add(int a,int b) {}
	public static void main(String[] args) {
		CalculatorApp calc=new CalculatorApp();
		calc.add(12,45.98f,23); //static OR early OR COMPILE-TIME
		calc.add(20,25);
		// (INT , FLOAT)  (INT , FLOAT ,INT) (FLOAT , INT)
	
		
	}

}
