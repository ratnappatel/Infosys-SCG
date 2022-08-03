package com.infy.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListSemo_01 {

	public static void main(String[] args) {
		// default nature of collection allow any type of Object
		List<Long> mobileNos=new ArrayList<Long>(); //Heterogenous collection 
		mobileNos.add(9829837874L); //autoboxing long ==> Long
		mobileNos.add(9529216356L);
		mobileNos.add(9414041384L);
		mobileNos.add(9601290547L);
		
		//To display we can use for-each loop / iterator interface /for-native
		
		for(Long no:mobileNos) // can only be used for homogenous collection
			System.out.println(no);
		System.out.println("=========================");
		for(int i=0;i<mobileNos.size();i++)
			System.out.println(mobileNos.get(i));
		System.out.println("=========================");
		
		Iterator itr=mobileNos.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		//sorted view of all mobile nos.
		
		
	}

}
