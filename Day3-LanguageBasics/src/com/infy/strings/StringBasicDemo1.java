package com.infy.strings;

public class StringBasicDemo1 {

	public static void main(String[] args) {

		String s1="Hello";
		String s2="Hello"; // pass s2 as value 
		
		String s3=new String("Hello"); // new reference for s3 object [i will never create new object]
		
		/*
		 * System.out.println("s1 = "+s1); System.out.println("s2 = "+s2);
		 * System.out.println("s3 = "+s3);
		 */
		
		
		  System.out.println("s1 hashcode = "+s1.hashCode());
		  System.out.println("s2 hashcode = "+s2.hashCode());
		  System.out.println("s3 hashcode = "+s3.hashCode());
		 
		
			
			  if(s1==s2) System.out.println("s1 == s2"); else
			  System.out.println("s1 != s2");
			  
			  if(s1==s3) System.out.println("s1 == s3"); else
			  System.out.println("s1 != s3");
			  
			  // String objects are immutable objects in java
			  // for every modification jvm creates new string object
			  s1=s1+" world ..";
			  

			  System.out.println("s1 hashcode = "+s1.hashCode());
			  System.out.println("s2 hashcode = "+s2.hashCode());
			  System.out.println("s3 hashcode = "+s3.hashCode());
			 
			/*
			 * if(s1.equals(s2)) System.out.println("s1 equals to  s2"); else
			 * System.out.println("s1 not equals to s2");
			 * 
			 * if(s1.equals(s3)) System.out.println("s1 equals to  s3"); else
			 * System.out.println("s1 not equals to s3");
			 */
			 
	}

}
