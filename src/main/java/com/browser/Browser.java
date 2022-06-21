package com.browser;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.framework.Environment;
import com.framework.Keyword;

public class Browser {
	@BeforeMethod
	public static void SetupBrowser() throws IOException
	{
	  Keyword.openBrowese("chrome");
	  Keyword.openURL("https://ijmeet.com");
	 // Keyword.openURL(Environment.getQAUrl());
	}
	@AfterMethod
	public static void tearDown()
	{
		Keyword.close();
	}

}
