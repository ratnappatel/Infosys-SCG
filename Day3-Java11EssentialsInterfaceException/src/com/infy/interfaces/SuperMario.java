package com.infy.interfaces;

public class SuperMario {

	private int speed;
	public SuperMario(int speed) {
		this.speed=speed;
		
	}
	public int getSpeed()
	{
		return this.speed;
	}

	public static void main(String[] args) {
		SuperMario sm=new SuperMario(50);
		// anonymous syntax for overriding abstract method of an interface.
		Mario m1=new Mario() {
			public void run()
			{
				System.out.println("Speed of Super Mario "+sm.getSpeed());
			}
		};
		
		// Lambda Syntax for Overriding abstract method of an FunctionalInterface.
		Mario m2=()->{System.out.println("Speed of Super Mario [lambda exp] :"+sm.getSpeed());};
	}
}
