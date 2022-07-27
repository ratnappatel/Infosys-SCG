package com.infy.oops;

public class Product {
	public int id;
	public String title;
	public float regularPrice;
	public float discountedPrice;
	public String productType;
	
	
	
	public Product(int id, String title, float regularPrice,  String productType) {
		
		this.id = id;
		this.title = title;
		this.regularPrice = regularPrice;
		
		this.productType = productType;
	}



	public void calculateDiscountedPrice()
	{
		switch(productType)
		{
			case "Electronics":{
								this.discountedPrice=this.regularPrice-(this.regularPrice*0.05f);
								break;
								}
			case "Books":{
				this.discountedPrice=this.regularPrice-(this.regularPrice*0.15f);
				break;
				}
			case "Mobile":{
				this.discountedPrice=this.regularPrice-(this.regularPrice*0.08f);
				break;
				}
			default:
					System.out.println("This type of Product are not on any discount.");
		}
	}
	

}
