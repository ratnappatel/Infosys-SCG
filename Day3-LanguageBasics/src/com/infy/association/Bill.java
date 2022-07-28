package com.infy.association;

import java.time.LocalDate;

public class Bill {
	
	private int no;
	private LocalDate date;
	private String paymentMode;
	public Bill() {
		// TODO Auto-generated constructor stub
	}
	public Bill(int no, LocalDate date, String paymentMode) {
		super();
		this.no = no;
		this.date = date;
		this.paymentMode = paymentMode;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public void generateBill(Order order)
	{
		System.out.println("Bill Number : "+this.no);
		System.out.println("Date of Bill Generated : "+this.date);
		System.out.println("For Order No : "+order.getId());
		System.out.println("Payment Mode was : "+this.paymentMode);
		System.out.println("Total Payable amount was : "+order.getTotalCost());
		
	}
}
