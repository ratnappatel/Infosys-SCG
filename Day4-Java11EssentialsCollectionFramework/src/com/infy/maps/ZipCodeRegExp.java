package com.infy.maps;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ZipCodeRegExp {

	public static void main(String[] args) {
		String regex="[0-9]{6}";
		String landLine="([0-9]{3})-[0-9]{6}";
		
		Scanner sc=new Scanner(System.in);
		/*
		 * System.out.println("Enter Your City Zip Code"); String zipcode=sc.next();
		 * 
		 * if(Pattern.matches(regex,zipcode)) System.out.println("Valid Zipcode"); else
		 * System.out.println("Invalid Zipcode");
		 */
		
		System.out.println("Enter Your Phone No with Area code");
		String phone=sc.next();
		
		if(Pattern.matches(landLine, phone))
			System.out.println("Valid Phone No");
		else
			System.out.println("Invalid Phone No");
			
		
	}

}
