package com.infy.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class validateVoterAgeTest {
	
//	@Test
	
public void validateVoterAgeValidTest()throws Exception
	{
		VotingSystem sys=new VotingSystem();
//assertion functions helps to compare/check expected vs actual result of method execution
		int age=28;
		Assertions.assertTrue(sys.validateVoterAge(age));
	}

	//@Test
	public void validateVoterAgeInvalidTest()throws Exception
	{
		VotingSystem sys=new VotingSystem();
		//assertion functions helps to compare/check expected vs actual result of method execution
				int age=8;
				Assertions.assertFalse(sys.validateVoterAge(age));
	}
	
	//@Test
	public void validateVoterAgeExceptionTest()throws Exception
	{
		VotingSystem sys=new VotingSystem();
		int age=-10;
		
		Exception e=Assertions.assertThrows(Exception.class, ()->sys.validateVoterAge(age));
		Assertions.assertEquals("Invalid Age", e.getMessage());
	}
	
	
	@ParameterizedTest
	@CsvSource(value= {"19, true","20,true","17,false","16,false"})
	public void validateVoterAgeTestParameter(int age,boolean expected)throws Exception
	{
		VotingSystem sys=new VotingSystem();
		Assertions.assertEquals(expected, sys.validateVoterAge(age));
	}
}
