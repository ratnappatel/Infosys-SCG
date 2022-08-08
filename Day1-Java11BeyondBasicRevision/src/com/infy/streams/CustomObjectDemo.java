package com.infy.streams;

import java.util.Arrays;
import java.util.List;

public class CustomObjectDemo {

	public static void main(String[] args) {
		List<Person> persons=Arrays.asList(
				new Person(23, "Name 1", 41),
				new Person(45, "Name 9", 67),
				new Person(67, "Name 5", 59),
				new Person(9, "Name 2", 52),
				new Person(37, "Name 3", 45),
				new Person(47, "Name 8", 28),
				new Person(82, "Name 4", 21),
				new Person(83, "Name 6", 26)
				);
		
		// List persons whose age between 25 to 40 and having a name in sorted 
		persons.stream()
			   .filter((p)->{
				  // System.out.println("Filtering "+p);
				   return (p.getAge()>25 && p.getAge()<50);
			   })
			   .sorted((p1,p2)->p1.getAge()-p2.getAge())
			   .forEach(System.out::println);
			

	}

}
