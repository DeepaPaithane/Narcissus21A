package com.framework;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObjecModel.IJMeetHomePage;
import com.PageObjecModel.JoinMeetingPage;

public class IJMeetHomePageTestCase extends IJMeetHomePage {
	
	@Test
	public void verifyClickOnJoinMeetingRedirectToJoinMeetingPage() {
		//Keyword.openBrowese("chrome");
        //Keyword.openURL("https://www.ijmeet.com");
		String expected="Quick Join a Meeting";
		
		//PageFactory factory=new PageFactory();
		IJMeetHomePage home=new IJMeetHomePage();
	   // home=PageFactory.initElements(Keyword.driver, IJMeetHomePage.class);
		home.joinMeetingLink();
		
		//PageFactory fac=new PageFactory();
		JoinMeetingPage join=new JoinMeetingPage();
		
		join=PageFactory.initElements(Keyword.driver, JoinMeetingPage.class);
		String actual=join.getTextJoinMeetingPage();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		
		
		
	}
	
	
	

}
