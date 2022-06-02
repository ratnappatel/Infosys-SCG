package com.infy.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class IteratorDemo {
	
	List<Integer> numbers;
	Scanner sc;
	
	public IteratorDemo() {
		numbers=new ArrayList<Integer>();
		sc=new Scanner(System.in);
	}
	public void addNumbers()
	{
		System.out.println("Enter 5 numbers");
		for(int i=0;i<5;i++)
			numbers.add(sc.nextInt());
	}
	public void displayNumbersWithItrator()
	{
		// remove numbers from list if they are odd no.
		
		Iterator<Integer> itr=numbers.iterator();// without specifying generics they are considered as Object
		while(itr.hasNext())
		{
			int no=itr.next();
			if(no%2!=0)
				itr.remove();
			else
				System.out.println(no);
		}
		System.out.println("Actual Collection after Iterator..");
		System.out.println(numbers);
	}
	public void displayNumbersWithFor()
	{
		System.out.println("Using Enhanced For Loop");
		for(int no:numbers)
		{
			if(no%2!=0)
				numbers.remove(no); // Collection Object.remove(element/index)
			else
				System.out.println(no);
		}
		System.out.println("Actual Collection after Enhanced-For Loop..");
		System.out.println(numbers);
	}

	public static void main(String[] args) {
		IteratorDemo i=new IteratorDemo();
		i.addNumbers();
		i.displayNumbersWithItrator();
		i.displayNumbersWithFor();
		
	}

}
