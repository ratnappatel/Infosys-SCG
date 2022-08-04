package com.infy.streams;

import java.util.Arrays;

public class EmployeeMgStream {

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
		
		Arrays.stream(employees)
			.filter((e)->e.getSalary()>50000)
			.sorted((e1,e2)->(e1.getName().compareTo(e2.getName())))
			.forEach(System.out::println);

	}

}
