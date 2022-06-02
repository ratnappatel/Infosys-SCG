package com.infy.sets;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentSetCollection {

	public static void main(String[] args) {

		// Ordered Set Collection + Custom Object
		Set<Student> students=new LinkedHashSet<Student>();
		
		students.add(new Student(125, "Uttam"));
		students.add(new Student(187,"Gargesh"));
		students.add(new Student(712, "Neel"));
		students.add(new Student(253, "Chesta"));
		students.add(new Student(125, "Uttam"));
		
		System.out.println(students);
		
		// Sorted Set Collection + Custom Object
		Set<Student> students1=new TreeSet<Student>();
		
		students1.add(new Student(125, "Uttam"));
		students1.add(new Student(187,"Gargesh"));
		students1.add(new Student(712, "Neel"));
		students1.add(new Student(253, "Chesta"));
		students1.add(new Student(125, "Uttam"));
		
		System.out.println(students1);
	}

}
