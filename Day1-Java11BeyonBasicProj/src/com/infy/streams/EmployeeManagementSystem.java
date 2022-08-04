package com.infy.streams;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		Employee employees[]=new Employee[10];
		
		employees[0]=new Employee(22, "Jerin ", 25000.00);
		employees[1]=new Employee(33, "Amelia", 37000.00);
		employees[2]=new Employee(44, "Manu", 27000.00);
		employees[3]=new Employee(55, "Ketan", 26000.00);
		employees[4]=new Employee(11, "Mayur", 67000.00);
		employees[5]=new Employee(77, "Kalpana", 19000.00);
		employees[6]=new Employee(88, "Neel", 38000.00);
		employees[7]=new Employee(99, "Gargesh", 73000.00);
		employees[8]=new Employee(342, "Uttam", 83000.00);
		employees[9]=new Employee(352, "Pinakin", 89000.00);
		
		//list employees who draws salary higher than 50k
		
		for(int i=0;i<employees.length;i++)
		{
			if(employees[i].getSalary()>50000)
				System.out.println(employees[i]);
		}
		
		
		// find avg salary of all employee
		double avg=0.0;
		double total=0.0;
		
		for(int i=0;i<employees.length;i++)
				total+=employees[i].getSalary();
		avg=total/(employees.length);
		System.out.println("The average Salary of all employees is :"+avg);
		
		List<Employee> employees1=new ArrayList<Employee>();
		for(Employee e:employees)
		{
			if(e.getSalary()>25000 && e.getSalary()<40000)
				employees1.add(e);
		}
		System.out.println(employees1);
		for(Employee e:employees1)
			e.setSalary(e.getSalary()+5000);
	}
	
	
}
