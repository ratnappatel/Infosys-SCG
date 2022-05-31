package com.infy.abstractdemos;

public class BankAppTester {

public static void main(String[] args) {
		
		BankingApp app; // a reference variable of base class
		
		app=new ICICIBankApp();// pointing to child instance/object
		app.deposit(10000);
		app.withdraw(25000);
		
		app=new HDFCBankApp(); // pointing to another child instance/object
		app.deposit(20000);
		app.withdraw(30000);
		
		
		SavingAccount sa=new SavingAccount();
		CurrentAccount ca=new CurrentAccount();
		DematAccount da=new DematAccount();
		
		app.createAccount(ca);
		app.createAccount(sa);
		app.createAccount(da);
	}
}
