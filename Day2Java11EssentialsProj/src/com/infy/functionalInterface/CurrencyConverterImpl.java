package com.infy.functionalInterface;

public class CurrencyConverterImpl {

	public static void main(String[] args) {
		CurrencyConverterInterface cc= (d) -> d*77.67; 
		
		double rupee=cc.dollarToRupee(200);
		System.out.println(200+" dollar = "+rupee+" Rs.");

	}

}
