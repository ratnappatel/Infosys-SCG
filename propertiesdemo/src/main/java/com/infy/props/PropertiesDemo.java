package com.infy.props;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class PropertiesDemo {
	public static void main(String[] args) {
		PropertiesConfiguration config = null;
		Configurations configurations = new Configurations(); 
		try 
		{
			config = configurations.properties("configuration.properties");
			System.out.println("Name is : "+config.getProperty("name"));
			System.out.println("Email Id is : "+config.getProperty("email"));
		} 
		catch (ConfigurationException e) {
			e.printStackTrace();
		}
	}
}
