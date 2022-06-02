package com.infy.exceptions;

public class ERetailCustomException {
	
	public static void checkStock(int availableStock,int quantityRequired) throws StockNotAvailableException
	{
		if(availableStock<quantityRequired)
			throw new StockNotAvailableException("Required Quantity is not in Stock");
		System.out.println("Proceed to Checkout");
	}
	public void placeAnOrder()
	{
		
	}

	public static void main(String[] args) {
		try {
			checkStock(56, 45);
			checkStock(56, 60);
			
		} catch (StockNotAvailableException e) {
			System.out.println(e);
		}
	}

}
