package com.framework;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword {
	public static WebDriver driver;
   
	public static void openBrowese(String browserName) {     //open browser

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		} else if (browserName.equals("internet explorer")) {
			WebDriverManager.iedriver();
			driver = new InternetExplorerDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver();
			driver = new FirefoxDriver();
			
		}
		else {
			System.out.println("Invalid Browser"+browserName);
		}
	}
	
 public static void openURL(String url) {
		driver.get(url);
	}
public static void maximizeWindow()
   {
   	driver.manage().window().maximize();
   }
 public static void minimizeWindow() {
	  driver.manage().window().minimize();
	  }
	 
public static String getTitle() { 
	return driver.getTitle();
	}
	 
public static void enterText(String locator, String text) {
	   
	   WebElement element = getWebElement(locator); 
	   element.sendKeys(text);
	}
public static void enterText(WebElement el, String text) {
	el.sendKeys(text);
	
    }
public static void enterText(By by,String text)
{
	driver.findElement(by).sendKeys(text);
}
public static void enterSearch(String string) {
	  
	driver.findElement(By.cssSelector(string));
}
public static void clickOn(WebElement element)
    {
    	element.click();
    }
public static void clickOn(By by)
    {
    	driver.findElement(by).click();
    }
  public static void clickOn(String locator) {
	  WebElement element = getWebElement(locator);
		element.click();
      }

	
	/*public static void clear(String locator) {
		WebElement element = getWebElement(locator);
		element.clear();
	}

	public static void getText(String locator) {
		WebElement element = getWebElement(locator);
		element.getText();
	}

	public static void submit(String locator) {
		WebElement element = getWebElement(locator);
		element.submit();
	}

	public static boolean isDisplayed(String locator) {
		WebElement element = getWebElement(locator);
		return element.isDisplayed();
	}

	public static boolean isEnable(String locator) {
		WebElement element = getWebElement(locator);
		return element.isEnabled();
	}

	public static Dimension getSize(String locator) {
		WebElement element = getWebElement(locator);
		return element.getSize();
	}

	public static String getAttribute(String locator) {
		WebElement element = getWebElement(locator);
		return element.getAttribute(locator);
	}

	public static boolean isSelected(String locator) {
		WebElement element = getWebElement(locator);
		return element.isSelected();
	}

	public static String getCSSValue(String locator) {
		WebElement element = getWebElement(locator);
		return element.getCssValue(locator);
	}

	public static String getTagName(String locator) {
		WebElement element = getWebElement(locator);
		return element.getTagName();
	}

	public static Point getLocation(String locator) {
		WebElement element = getWebElement(locator);
		return element.getLocation();
	}*/
	 
private static WebElement getWebElement(String locator) {
	  WebElement element=null;
	  String locatorType=locator.split("##")[0];
	  String locatorValue=locator.split("##")[1];
	 
	  if(locatorType.equalsIgnoreCase("xpath"))
	      element=  driver.findElement(By.xpath(locatorValue));
	  
	  else if (locatorType.equalsIgnoreCase("css"))
	       element=  driver.findElement(By.cssSelector(locatorValue));
	  
	  else if(locatorType.equalsIgnoreCase("id"))
	        element=driver.findElement(By.id(locatorValue));
	  
	  else if(locatorType.equalsIgnoreCase("className"))
	       element=  driver.findElement(By.className(locatorValue));
	  
	  else if(locatorType.equalsIgnoreCase("name"))
	      element=  driver.findElement(By.name(locatorValue));
	  
	  else if(locatorType.equalsIgnoreCase("tagName"))
	       element=  driver.findElement(By.tagName(locatorValue));
	  
	  else if(locatorType.equalsIgnoreCase("partialText"))
	        element= driver.findElement(By.partialLinkText(locatorValue));
	  
	  else if(locatorType.equalsIgnoreCase("linkText"))
	        element= driver.findElement(By.linkText(locatorValue));
	         return element;
}

private static List<WebElement> getWebElements(String locator) {
	List   <WebElement>elements=new ArrayList<WebElement>();
	  String locatorType=locator.split("##")[0];
	  String locaatorValue=locator.split("##")[1];
	 
	  if(locatorType.equalsIgnoreCase("xpath"))
	      elements=  driver.findElements(By.xpath(locaatorValue));
	  
	  else if (locatorType.equalsIgnoreCase("css"))
	       elements=  driver.findElements(By.cssSelector(locaatorValue));
	  else if(locatorType.equalsIgnoreCase("id"))
	        elements=driver.findElements(By.id(locaatorValue));
	  
	  else if(locatorType.equalsIgnoreCase("className"))
	       elements=  driver.findElements(By.className(locaatorValue));
	  
	  else if(locatorType.equalsIgnoreCase("name"))
	      elements=  driver.findElements(By.name(locaatorValue));
	  
	  else if(locatorType.equalsIgnoreCase("tagName"))
	       elements=  driver.findElements(By.tagName(locaatorValue));
	  
	  else if(locatorType.equalsIgnoreCase("partialText"))
	        elements= driver.findElements(By.partialLinkText(locaatorValue));
	  
	  else if(locatorType.equalsIgnoreCase("linkText"))
	        elements= driver.findElements(By.linkText(locaatorValue));
	         return elements;
}

    
  public static void closeWindow(String title)
    {
           String currentwindow= driver.getWindowHandle();
           Set<String>allwindows=driver.getWindowHandles();
           for(String windows:allwindows)
              {
                   driver.switchTo().window(windows);
           if(driver.getTitle().equals(title)) {
    	           driver.close();
               }
              }
    }
    public static List<String> getTextOfElement(By Selector) {
		List<String> productTexts=new ArrayList<String>();
		List<WebElement> productTitles=driver.findElements(Selector);
		for(WebElement products:productTitles) {
			productTexts.add(products.getText());
		}
		return productTexts;
	}
   public static List<String> getTextOfElements(String locator) {
		List<WebElement> elements=getWebElements(locator);
	     List<String> elementTexts=new ArrayList<String>();
	
		for(WebElement element:elements) {
			elementTexts.add(element.getText());
		}
		return elementTexts;
   }
  
  public static void quitAll()
	    {
	    	driver.quit();
		}
  public static void close() {
		driver.close();
		
	}




}
