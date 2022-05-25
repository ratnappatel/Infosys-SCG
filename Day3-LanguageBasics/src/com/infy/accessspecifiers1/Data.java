package com.infy.accessspecifiers1;

public class Data {

	private int a=100;
	protected int b=200;
	int c=300; // default OR package
	public int d=400;
	
	private void privateMethod()
	{
		System.out.println("Private Method Called..");
	}
	protected void protectedMethod()
	{
		System.out.println("Protected Method Called..");
	}
	 void defaultMethod()
	{
		System.out.println("Default Method Called..");
	}
	public void publicMethod()
	{
		System.out.println("Public Method Called..");
	}

	// to test/run class as independently we must have main method
	public static void main(String args[])
	{
		Data d1=new Data();//4-int var = 4*4 = 16bytes will be allocated to an object
		System.out.println("a = "+d1.a);
		d1.privateMethod();
		System.out.println("b = "+d1.b);
		d1.protectedMethod();
		System.out.println("c = "+d1.c);
		d1.defaultMethod();
		System.out.println("d = "+d1.d);
		d1.publicMethod();
	}
}
