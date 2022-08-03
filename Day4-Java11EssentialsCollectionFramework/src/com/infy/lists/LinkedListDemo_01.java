package com.infy.lists;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo_01 {

	public static void main(String[] args) {
		List<Author> authors1=new LinkedList<Author>();
		Author a1,a2,a3,a4,a5;
		a1=new Author(12,"a1",324);
		a2=new Author(27,"a7",278);
		a3=new Author(82,"a3",84);
		a4=new Author(47,"a8",37);
		a5=new Author(86,"a5",90);
		
		authors1.add(a1);
		authors1.add(a2);
		authors1.add(a3);
		authors1.add(a4);
		authors1.add(a5);
	}

}
