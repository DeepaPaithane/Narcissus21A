package com.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
	/**
	 * this method return value of specified locator from object properties file.
	 * @param locator
	 * @return String
	 * @throws IOException
	 */
	public static String getLocator(String locator) throws IOException
	{
		String fileName="/src/test/resources/objectRepositaty.properties";
		return getProperty(fileName,locator);
	}
	public static  String getProperty(String fileName, String key) throws IOException
	{
		String directory=System.getProperty("user.dir");
		FileInputStream file=new FileInputStream(directory+fileName);
		Properties pro=new Properties();
		pro.load(file);
		return pro.getProperty(key);
	}
	public static String getEnvironment(String key) throws IOException
	{
		String fileName="/src/main/resources/Environment.properties";
		return getProperty(fileName, key);
	}
}
	


