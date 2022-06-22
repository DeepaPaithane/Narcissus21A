package com.framework;

import java.io.IOException;

public class Environment {
	public static String getDevUrl() throws IOException
	{
		return PropertiesUtil.getEnvironment("dev.url");
	}
   
	public static String getQAUrl() throws IOException
	{
		return PropertiesUtil.getEnvironment("qa.url");
	}
	public static String getPOUrl() throws IOException
	{
		return PropertiesUtil.getEnvironment("po.url");
	}
}

