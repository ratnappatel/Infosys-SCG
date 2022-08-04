package com.infy.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringListStreamOper {

	public static void main(String[] args) {
		//Lambda Expression passed as Argument in sorted()
		List<String> placesToVisit= new ArrayList<String>();
		placesToVisit.add("Chicago");
		placesToVisit.add("Venice");
		placesToVisit.add("Tokyo");
		placesToVisit.add("San Francisco");
		placesToVisit.add("Kyoto");
		placesToVisit.add("Abu Dhabi");
		
		placesToVisit.stream()
					 .sorted((str1,str2) -> str1.compareTo(str2))
					 .forEach(System.out::println);
		
		List<String> placeWithA=placesToVisit.stream()
					 .filter(s->s.contains("a"))
					 .map(s->s.toUpperCase())
					 .collect(Collectors.toList());
		System.out.println();
		System.out.println(placeWithA);

	}

}
