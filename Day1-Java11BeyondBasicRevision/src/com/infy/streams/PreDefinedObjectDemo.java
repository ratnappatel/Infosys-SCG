package com.infy.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PreDefinedObjectDemo {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,4,6,7,8,9,10);
		// Square of first 3 Even Nos print/create list/set 
		
		//List<Integer> 
		Set<Integer> squares=numbers.stream()
			   .filter((no)->{
				   System.out.println("Filtering "+no);
				   return no%2==0;
			   })
			   .map((no)->{
				   System.out.println("Mapping "+no);
				   return no*no;
			   })
			   .limit(3)
			   .collect(Collectors.toSet());
			   //.collect(Collectors.toList());
			   //.forEach(System.out::println);
		
		System.out.println(squares);
		
		
		
	}

}
