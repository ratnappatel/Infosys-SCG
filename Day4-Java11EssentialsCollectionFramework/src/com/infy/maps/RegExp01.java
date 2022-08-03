package com.infy.maps;

import java.util.regex.Pattern;

public class RegExp01 {

	public static void main(String[] args) {
		String expected=" Hello";
		String input=" Hello ";
		
		System.out.println(input.matches(expected));
		
		System.out.println(Pattern.matches(expected, input));
		
		String sentence="Today-is-finally-a-friday.";
		String []words=sentence.split("finally");
		
		for(String s:words)
			System.out.print(s+", ");
		
		String str1="aroundrend"; // s1.toCharArray(); ==> char array[]
		System.out.println("");
		String []strs=str1.split("r");// hint how i divide your one-whole-string into multiple words 
		for(String s:strs)
			System.out.println(s);
	}

}
