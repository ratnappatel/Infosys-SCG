package com.infy.exceptions;

public class ERetail {

	public static void checkStock(int quantityInStock, int quantityRequired)throws Exception
	{
			if(quantityInStock<quantityRequired)
				throw new Exception("There is not enough stock available.");
			System.out.println("Please proceed to the check-out");
	}
	public static void main(String[] args) {
		
		try {
			checkStock(20,25);
			checkStock(20,12);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
