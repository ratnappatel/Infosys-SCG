package com.infy.intro;


public class ControlStructureDemo {

	
	public void sequential()
	{
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
	}
	public void selection(int no)
	{
		int i=no;
		if(i%2==0)
		{
			System.out.println("Hey !! you have got an even no..");
			System.out.println(i);
		}
		else
		{
			System.out.println("Ups... not an even no....");
			System.out.println("Not a No to be printed");
		}
		
	}
	public void iterational()
	{
		for (int i=0;i<5;i++)
		{
			System.out.println("i = "+i);
		}
		System.out.println("I will be printed after looping is over");
	}
	public static void main(String[] args) {
		
		ControlStructureDemo d1=new ControlStructureDemo();
		System.out.println("Output for Selective\n===================");
		d1.selection(36);
		System.out.println("Output for Sequential\n===================");
		d1.sequential();
		System.out.println("Output for Iterative\n===================");
		d1.iterational();
	
	}

}
