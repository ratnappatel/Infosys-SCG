package com.infy.dates;

import java.time.LocalDate;

public class LocalDateMethods {

	public static void main(String[] args) {
		LocalDate purchaseDate=LocalDate.of(2019, 02, 12);
		
		
		LocalDate expiryDate=purchaseDate.plusDays(90);
		System.out.println("Expiry Date of your Service Persion : "+expiryDate);
		
		LocalDate expiryYear=purchaseDate.plusYears(1);
		System.out.println("One Year Expiry Date would be : "+expiryYear);

	}

}
