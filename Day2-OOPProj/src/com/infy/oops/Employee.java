package com.infy.oops;

public class Employee {
	
	private int id;
	private String name;
	private float salary;
	//constructor over-loading
	public Employee(String name) {
		this.id=(int)(Math.random()*1000); // 0.0 - 0.1
		this.name=name;
		this.salary=10000;
	}
	public Employee(int id, String name, float salary) {
		this(name);
		this.id = id;
		this.salary = salary;
	}


	public static void main(String[] args) {
		Employee e1=new Employee("Ratna");
		Employee e2=new Employee(12, "Uttam", 45678.89f);
		
		e1.displayDetails();
		System.out.println("==================================");
		e2.displayDetails();
		
		System.out.println("Address of e1 = "+e1.hashCode());
		System.out.println("Address of e2 = "+e2.hashCode());
		
		e2=e1;
		//e2 object become available for garbage collection.
		System.out.println("==================================");
		System.out.println("Address of e1 = "+e1.hashCode());
		System.out.println("Address of e2 = "+e2.hashCode());
		e1=null; // where e1 become eligible for garbage collection
		

	}
	
	public void displayDetails()
	{
		System.out.println("Employee ID : "+this.id);
		System.out.println("Employee Name : "+this.name);
		System.out.println("Employee Salary : "+this.salary);
	}
	

}
