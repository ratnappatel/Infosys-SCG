package com.infy.inheritance;

public class BasicInheritanceDemo {

	public static void main(String[] args) {
		Child c1=new Child(10,20,30);
		c1.display();
	}

}

class Parent
{
	private int no;
	public int otherNo;
	
	public Parent(int no, int otherNo) {

		super();
		System.out.println("Parent Class Constructor is called..");
		this.no = no;
		this.otherNo = otherNo;
	}
	public int getNo() {
		// can drive a new car but i will join you for that
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getOtherNo() {
		return otherNo;
	}
	public void setOtherNo(int otherNo) {
		this.otherNo = otherNo;
	}
	public void displayData()
	{
		System.out.println("Private No : "+this.no);
		System.out.println("Public No : "+this.otherNo);
	}
}
class Child extends Parent
{	
	private int myNo;

	public Child(int no, int otherNo,int myNo) {
		super(no, otherNo);
		System.out.println("Child Class Constructor is called..");
		this.myNo=myNo;
		// TODO Auto-generated constructor stub
	}
	public int getMyNo() {
		return myNo;
	}

	public void setMyNo(int myNo) {
		this.myNo = myNo;
	}
	public void display()
	{
		System.out.println("Parent No :"+this.getNo());
		System.out.println("Child No : "+this.myNo);
		System.out.println("Other No : "+this.otherNo);
	}
}
