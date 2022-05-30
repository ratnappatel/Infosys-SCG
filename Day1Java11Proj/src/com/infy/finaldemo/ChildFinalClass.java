package com.infy.finaldemo;

public class ChildFinalClass extends FinalClass{

	public void setX1(int x)
	{
		x=x+10;
		super.setX(x);
	}
	public static void main(String[] args) {
		ChildFinalClass f1=new ChildFinalClass();
		f1.setX(100);
		System.out.println(f1.getX());

	}

}
