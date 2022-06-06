package com.infy.testing;

public class VotingSystem {

	public boolean validateVoterAge(int age)throws Exception
	{
		if(age<0)
			throw new Exception("Invalid Age");
		if(age >= 18) 
			return true;
		else
			return false;
	}
	
}
