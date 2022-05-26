package com.infy.inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		C obj=new C(10,20);
	}

}
class A
{ private int a; public A(int a) { this.a=a; System.out.println("A Constructor "+a);	}}
class B extends A
{ private int b; public B(int a,int b) { super(a); this.b=b; System.out.println("B Constructor "+b);	}}
class C extends B
{ public C(int a,int b) { super(a,b); System.out.println("C Constructor ");	}}