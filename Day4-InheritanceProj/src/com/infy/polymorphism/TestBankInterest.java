package com.infy.polymorphism;

public class TestBankInterest {

	public static void main(String[] args) {

		// R-Var pointing to an object will be choosen to call overriden method definition
		RBIBank account=new RBIBank(2500000.00);
		account.calInterestQuaterly();
		
		account=new ICICIBank(2500000.00);
		account.calInterestQuaterly();
		
		account=new BOBBank(2500000.00);
		account.calInterestQuaterly();
	}

}
