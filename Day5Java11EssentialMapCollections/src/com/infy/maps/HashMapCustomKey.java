package com.infy.maps;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class HashMapCustomKey {

	public static void main(String[] args) {
		// key = custom object so jvm cannot compare to check uniqueness
		// we must override equals& hashcode methods for the same
		Map<Order,Double> orders=new HashMap<Order,Double>();
		
		orders.put(new Order(10,"23-08-2019",25),45000.560);
		orders.put(new Order(28,"12-03-2017",17),6354.987);
		orders.put(new Order(84,"17-09-1999",21),23000.560);
		orders.put(new Order(54,"20-03-2997",28),25000.560);
		orders.put(new Order(10,"23-08-2019",25),8888.888);
		System.out.println(orders);
		
		

	}

}
