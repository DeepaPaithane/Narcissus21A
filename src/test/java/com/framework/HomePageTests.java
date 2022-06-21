package com.framework;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageTests {
	/**
	 * This method is used to verify home page title of the application
	 * @author Lenovo
	 */
	@Test(description = "without framework")
	public static void VerifyHomePageTitles()
	{
       WebDriverManager.chromedriver().setup();	
       ChromeDriver chrome=new ChromeDriver();
       chrome.get("https://www.testingshastra.com");
       String actualTitle=chrome.getTitle();
       System.out.println(actualTitle);
       String expectedTitle="Testing Shastra | Training | Placement";
       Assert.assertEquals(actualTitle, expectedTitle);
        
          /* if(actualTitle.equals(expectedTitle))
           {
        	   System.out.println(true);
           }
           else
        	   System.out.println(false);*/
	} 
	@Test(description = "with framework")
	public static void VerifyHomePageTitle()
	{
		
		 Keyword.openBrowese("chrome");
	     Keyword.openURL("https://www.testingshastra.com");
	     Keyword.maximizeWindow();
		 String expected="Testing Shastra | Training | Placement";
         Keyword.getTitle();
	     String actual=Keyword.getTitle();
		 Assert.assertEquals(actual, expected);
		 System.out.println("Test case pass");
        // Keyword.close();
		 Keyword.closeWindow("Testing Shastra ");
	}
	@Test
	public static void verifySearchResult() throws IOException, InterruptedException
	{
		Keyword.openBrowese("chrome");
		//Keyword.maximizeWindow();
		Keyword.openURL("https://www.myntra.com");
		Keyword.enterText(Locator.searchForProducts,"Shoes");
		Keyword.clickOn(Locator.magnifier);
		
		List<String>  titles=Keyword.getTextOfElements(Locator.productTitles);
		
		System.out.println("There are"+titles.size()+"products");
	    SoftAssert soft=new SoftAssert();
	     for(String title:titles)
	      {
		    soft.assertTrue(title.contains("Shoes") || title
		    .contains("Sneakers") || title
		    .contains("Running") || title
		    .contains("Trainer"), "Title doesn't contains shoes,sneakers,running and trainer");
	       }
	soft.assertAll();
   }
}