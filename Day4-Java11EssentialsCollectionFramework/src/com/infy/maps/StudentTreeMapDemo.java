package com.infy.maps;

import java.util.Map;
import java.util.TreeMap;

public class StudentTreeMapDemo {

	public static void main(String[] args) {

		// TreeMap always store unique key[equals&hashcode] & sorts key in ascending order
		Map<Student,Integer> students=new TreeMap<Student,Integer>();
		students.put(new Student(101,"A1"),987356);
		students.put(new Student(187,"A2"),736358);
		students.put(new Student(234,"A3"),243567);
		students.put(new Student(167,"A4"),543789);
		
		System.out.println(students);
	}

}
