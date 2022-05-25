package com.infy.arrays;

public class PrimitiveArrayDemo {

	int arr[];
	public PrimitiveArrayDemo() {
		arr=new int[10];
	}
	public void addElements(int index,int value)
	{
		if(index>=0 && index<10)
			arr[index]=value;
		else
			System.out.println("Index is invalid try between 0 to 9");
	}
	public void printAllElements()
	{
		for(int i=0;i<arr.length;i++)
			System.out.println("arr [ "+i+" ] = "+arr[i]);
	}
	public void printAnElementAtIndex(int index)
	{
		if(index>=0 && index<10)
			System.out.println("arr ["+index+"] = "+arr[index]);
		else
			System.out.println("Index does not exists..");
	}
	
	
	public static void main(String[] args) {
		// To test the class
		PrimitiveArrayDemo p=new PrimitiveArrayDemo();
		p.addElements(2, 367);
		p.addElements(5, 176);
		p.addElements(7, 162);
		p.addElements(9, 857);
		
		p.printAllElements();
		System.out.println("=======================================");
		p.printAnElementAtIndex(5);
	}

}
