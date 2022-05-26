package com.infy.statics;

public class Employee {
	// Auto-Generate IDs
	private static int no=100;
	private int id;
	private String name;
	private int deptNo;
	
	public Employee(String name,int deptNo) {
		this.id=++no;
		this.name=name;
		this.deptNo=deptNo;
	}
	public void displayDetails()
	{
		System.out.println("\nEmployee Details******************");
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.name);
		System.out.println("Department No : "+this.deptNo);
	}

}
// 