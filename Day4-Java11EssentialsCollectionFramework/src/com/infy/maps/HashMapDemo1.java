package com.infy.maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {

		// Collection which holds a book title and its shelf-no
		
		Map<String,Integer> bookDetails=new LinkedHashMap<String,Integer>();
		bookDetails.put("Game Of Throne", 16);
		bookDetails.put("Tathya as it is", 25);
		bookDetails.put("Valap na Ven", 1);
		bookDetails.put("Satsang Sevak",1);
		//bookDetails.put("Satsang Sevak",4);
		bookDetails.put(null, 23);
		
		// Display Whole Content of the Map
		System.out.println(bookDetails);
		
		
		  // Display value of each key 
		Set<String> keys=bookDetails.keySet();
		System.out.println("usage of keySet()");
		  for(String key:keys)
			  System.out.println("Book : "+key+" available at shelf no :"+bookDetails.get(
		  key));
		  
		  System.out.println("=================================="); 
		  // Display all key  along with their value 
		  Set<Map.Entry<String,Integer>>  entry=bookDetails.entrySet();
		  
		  System.out.println("usage of entrySet()");
		  for(Map.Entry m:entry) 
			  { System.out.print("Book Title : "+m.getKey());
			  System.out.print(" Available at : "+m.getValue()+"\n"); 
		  }
		  
		  
		  // To check an existence of any key boolean
		  boolean res=bookDetails.containsKey("Satsang Sevak");
		  System.out.println("Is Book Called 'Satsang Sevak' available in this map : "+res);
		  
		  bookDetails.remove("Game Of Throne"); 
		  System.out.println(bookDetails);
		 
	}

}
