package com.PageObjecModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JoinMeetingPage {
	@FindBy(css="h2.m-txt")
	public WebElement getTitleJoinMeetingPage;
	
	public String getTextJoinMeetingPage()
	{
		return getTitleJoinMeetingPage.getText();
	}

}
