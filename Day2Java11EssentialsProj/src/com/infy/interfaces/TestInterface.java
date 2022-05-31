package com.infy.interfaces;

public class TestInterface implements MyInterface
{

	public static void main(String[] args) {
		MyInterface m=new TestInterface();
		System.out.println(MyInterface.x);
		m.show();
		MyInterface.show2();
		
		TestInterface t1=new TestInterface();
		t1.show2();
}

	  @Override public void show() {
	  System.out.println("Show overriden by child class");
	 	  }
	  
	
	  public void show2() {System.out.println("Overriden static show2 ");}
	 

}
