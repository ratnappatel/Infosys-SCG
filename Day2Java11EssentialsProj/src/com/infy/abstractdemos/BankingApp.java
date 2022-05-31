package com.infy.abstractdemos;

// cannot create an instance of abstract class
// abstract == incomplete // generic 
public abstract class BankingApp {
	private double avlBalance;
	
	// a method declared without its definition
	public abstract void withdraw(double amount);
	
	public void createAccount(Account account)
	{
		if(account instanceof SavingAccount)
			System.out.println("Saving Account created.");
		else if(account instanceof CurrentAccount)
			System.out.println("Current Account Created.");
		else
			System.out.println("Demat Account Created.");
	}	
	
	// method with definition is called a CONCRETE METHOD
	public void deposit(double amount)
	{
		if(amount>50000.00)
		{
			System.out.println("show your Identity depositing "+amount);
			avlBalance=avlBalance+amount;
		}
	}
}
