package com.infy.voters;

public class Voter {

	public boolean validateVoterAge(int age)throws Exception
	{
		System.out.println("Testing age limit of Voter");
		boolean flag=false;
		if(age<0)
			throw new Exception("Age cannot be < 0");
		else if(age == 0)
			throw new Exception("Age can not be zero");
		else if(age<18)
			flag=false;
		else if(age>18 && age <=100)
			flag=true;
		return flag;
	}
	public static void main(String[] args) {

	}

}
