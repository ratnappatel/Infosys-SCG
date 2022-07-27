package com.infy.arrays;

import java.util.Scanner;

public class MatrixArray {
	int metrix[][];
	Scanner sc;
	public MatrixArray() {
		metrix=new int[3][3];
		sc=new Scanner(System.in);
	}

	public void addNos()
	{
		for(int i=0;i<3;i++) // rows
		{
			for(int j=0;j<3;j++) //column
				metrix[i][j]=sc.nextInt();
		}
	}
	public void display()
	{
		for(int i=0;i<3;i++) // rows
		{
			for(int j=0;j<3;j++) //column
				System.out.print(metrix[i][j]+" ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		MatrixArray arr=new MatrixArray();
		arr.addNos();
		arr.display();

	}

}
