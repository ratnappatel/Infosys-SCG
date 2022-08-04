package com.infy.streams;

public class AnonymousDemo {
	private int id;
	public AnonymousDemo(int id) {
		this.id=id;
	}
	public void print()
	{
		System.out.println("Id : "+this.id);
	}
	public void verify()
	{
		if(id%10==0)
			System.out.println("Valid");
		else
			System.out.println("Not Valid");
	}

	public static void main(String[] args) {
	new AnonymousDemo(10).print(); //in-memory execution of object cannot be reexecuted.

	}

}
