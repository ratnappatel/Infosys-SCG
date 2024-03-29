package com.infy.model;

public class Employee {
	
	private String name;
	private Integer empId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public Employee(String name, Integer empId) {
		super();
		this.name = name;
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + "]";
	}
}

