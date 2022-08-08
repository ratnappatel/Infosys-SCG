package com.infy.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.infy.voters.Voter;

public class TestAge {
	
	// are we testing for valid input ? yes
	@Test
	public void validateVoterAgeValidTest()throws Exception
	{
		int age=22;
		Voter v1=new Voter();
		boolean actual=v1.validateVoterAge(age);
		boolean expected=true;	
		Assertions.assertEquals(expected,actual);
		
	}
	@Test
	public void validateVoterAgeInvalidTest()throws Exception
	{
		int age=12;
		Voter v1=new Voter();
		boolean actual=v1.validateVoterAge(age);
		boolean expected=false;	
		Assertions.assertEquals(expected,actual);
		
	}
	
	@Test 
	public void validateVoterAgeException()throws Exception
	{
		Integer age=-10;
		Voter v1=new Voter();
		Exception e=Assertions
			.assertThrows(Exception.class, ()-> v1.validateVoterAge(age));
		Assertions.assertEquals("Age cannot be < 0",e.getMessage());
	}
	
	@Test 
	public void validateVoterAgeExceptionZero()throws Exception
	{
		Integer age=0;
		Voter v1=new Voter();
		Exception e=Assertions
			.assertThrows(Exception.class, ()-> v1.validateVoterAge(age));
		Assertions.assertEquals("Age can  be zero",e.getMessage());
	}
	
	@BeforeAll
	public static void beforeMethod() {
		System.out.println("Before test cases");
	}
	@AfterAll
	public static void afterMethod() {
		System.out.println("After test cases");
	}

}
