package com.infy.properties;

import java.util.Iterator;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class ReadProperties {

	public static void main(String[] args) throws ConfigurationException {
		Configurations configurations = new Configurations();
		PropertiesConfiguration prop=configurations.properties("information.properties");
		Iterator<String> keys=prop.getKeys();
		while(keys.hasNext())
		{
			String key=keys.next();
			System.out.println(key+" : "+prop.getProperty(key));
		}
	}

}
