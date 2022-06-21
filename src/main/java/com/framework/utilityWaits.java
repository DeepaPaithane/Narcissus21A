package com.framework;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utilityWaits {
	
	
	public static void 
	Waits()
	{

		WebDriverWait wait =new WebDriverWait(Keyword.driver, Duration.ofSeconds(30));
		wait.withMessage("time out");
		wait.pollingEvery(Duration.ofMillis(500));
		//wait.until(ExpectedConditions.elementToBeClickable(Keyword.click(by)));
		//wait.until(ExpectedConditions.elementToBeClickable(Keyword.click(element)));
	}
}	
