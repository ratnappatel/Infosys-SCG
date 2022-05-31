package com.infy.abstractdemos;

public class ICICIBankApp extends BankingApp{

	@Override
	public void withdraw(double amount) {
		System.out.println(amount+ " has been Withdraw from ICICI Bank");
		
	}
}
