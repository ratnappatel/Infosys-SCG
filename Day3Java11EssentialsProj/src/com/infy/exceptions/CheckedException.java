package com.infy.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public void readFromFile() throws FileNotFoundException 
	{
		// there is a possibility of abc.txt not present in the given location 
		FileInputStream fis=new FileInputStream("abc.txt");
	}
	public static void main(String[] args) {
		CheckedException ce=new CheckedException();
		try 
		{
			ce.readFromFile();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("The is not available to read ");
		}
	}

}
