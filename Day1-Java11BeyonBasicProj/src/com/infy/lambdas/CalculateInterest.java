package com.infy.lambdas;

//must be implemented by every  type of Loan class
//User-defined[custom] functional interface
@FunctionalInterface
public interface CalculateInterest {

	public double calcInterest(double amount,int noOfYears);

}
