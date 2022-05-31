package com.infy.abstraction;

public class BankApp implements CustomerAccess 
{
	
	private int accountNo;
	private String mobileNo;
	private String address;
	public BankApp() {
		// TODO Auto-generated constructor stub
	}
	
	public BankApp(int accountNo, String mobileNo, String address) {
		super();
		this.accountNo = accountNo;
		this.mobileNo = mobileNo;
		this.address = address;
	}

	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "BankApp [accountNo=" + accountNo + ", mobileNo=" + mobileNo + ", address=" + address + "]";
	}
}
