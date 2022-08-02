package com.infy.interfaces;

public class BasicMario implements Mario{

	private int speed;
	public BasicMario(int speed) {
		this.speed=speed;
	}
	@Override
	public void run() {
		System.out.println("Basic Mario Speed is : "+this.speed+" km/hr");
	}
	// using Lambda Expression : good for reducing code length which makes my code 
	//easier to maintain/debug 
	// to implement SAM[Single-Abstract Method] interface logic (arguments)->{logic}

	public static void main(String[] args) {
		Mario m=new BasicMario(25);
		m.run();
	}
}
