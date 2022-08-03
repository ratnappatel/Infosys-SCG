package com.infy.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo_02 {

	public static void main(String[] args) {
		List<Float> orderedProductPrice=new ArrayList<Float>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
			orderedProductPrice.add(sc.nextFloat());
		
		float orderValue=0.0f;
		for(Float price:orderedProductPrice)
			orderValue+=price;
		
		System.out.println("Unsoreted Price List");
		System.out.println(orderedProductPrice);
		
		Collections.sort(orderedProductPrice);

		System.out.println("Soreted Price List");
		System.out.println(orderedProductPrice);
		
		System.out.println("Total Order Cost is : "+orderValue);
			
	}

}
