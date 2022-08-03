package com.infy.maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {

		// TreeMap by default sorts keys of map
		Map<String,Integer> employeesDetail=new TreeMap<String,Integer>();
		
		employeesDetail.put("Ratna",8473463);
		employeesDetail.put("Uttam",797669);
		employeesDetail.put("Pinakin",98298);
		employeesDetail.put("Ketan",941404);
		employeesDetail.put("Neel",960129);
		employeesDetail.put("Ratna",894916);
		
		
		System.out.println(employeesDetail);
	}

}
