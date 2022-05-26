package com.infy.statics;
class Customer {
	private String customerId;
	private String customerName;
	private long contactNumber;
	private String address;
	private static int distance=15; // 1st ever
	private static float deliveryCharge;
	
	public Customer(String customerId, String customerName, long contactNumber,
			String address) {
		System.out.println("Constructor of Customer");
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
		//deliveryCharge = 1.5f;
	}
	// 2.nd to static-var /static block = executed prior to main function
	static {
		System.out.println("static block will be called even before main method");
		if(distance>5)
			deliveryCharge=1.5f;
		else if(distance>10)
			deliveryCharge=2.0f;
		else
			deliveryCharge=2.5f;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***********");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
		System.out.println();
	}
	public double payBill(double totalPrice) {
		double discountPercentage = 5;
		System.out.println("Calculating final amount to be paid.....");
		double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
        double finalBillAmount=priceAfterDiscount + deliveryCharge;
		return finalBillAmount;
	}
	public static int getDistance() {
		return distance;
	}
	public static void setDistance(int distance) {
		Customer.distance = distance;
	}
	public static float getDeliveryCharge() {
		return deliveryCharge;
	}
	public static void setDeliveryCharge(float deliveryCharge) {
		Customer.deliveryCharge = deliveryCharge;
	}

}
public class Tester {
	
	public static void main(String[] args) {
		System.out.println("Main Function Called...");
		//Customer customer1 = new Customer("C1001", "Sam", 9945000009L,"Carolina Street, Springfield, 62702");
		//System.out.println("Final amount to be paid: $" +customer1.payBill(20));
				System.out.println("delivery charges for "+Customer.getDistance()+"KM is : "+Customer.getDeliveryCharge());
	}
}
