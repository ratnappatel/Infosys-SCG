package com.infy.jdbcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DBConnectDemo1 {

	Connection con;
	Application app;
	public  Optional<Application> getAppDetailsById(int id)throws Exception
	{
		
		try 
		{
			// It will load Driver class in JRE 
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/aadharcard_db","root","Minions@123");
			System.out.println("Connected To AadharCard Database Successfully..");
			Statement stat=con.createStatement();
			Statement stat1=con.createStatement();
			ResultSet res2=stat1.executeQuery("select * from tbl_application where id="+id);		
			
			while(res2.next())
			{
			
				app=new Application();
				app.setId(res2.getInt(1));
				app.setCitizenId(res2.getInt(2));
				app.setDateOfApplication(res2.getDate(3).toLocalDate());
				app.setStatus(res2.getString(4));
				app.setTypeOfApplication(res2.getString(5));
			}
		} catch (Exception e) {	e.printStackTrace();}
		finally {con.close();}
		return Optional.ofNullable(app);
	}
	
	public static void main(String[] args) throws Exception{
		DBConnectDemo1 d=new DBConnectDemo1();		
		Optional<Application> appOptional=d.getAppDetailsById(2098);
		//Main moto of Optional class is to avoid nullpointer exception during runtime
		if(appOptional.isPresent())
			System.out.println("Citizen Id of Applicant is : "+appOptional.get().getCitizenId());
		else
			System.out.println("Application details are not available for ID : "+2098);
		
		System.out.println("Throw error if Object is missing");
		
		Application app=appOptional
				.orElseThrow(()->new Exception("Application details are not available for ID : "+2098));
	}

}
