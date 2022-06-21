package com.PageObjecModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.Keyword;

public class IJMeetHomePage {
	
	public IJMeetHomePage()
	{
	PageFactory.initElements(Keyword.driver,this);
	}
	
	
	@FindBy(css="span.mvlogo-size-app1 img[alt='ijmeetimage']")
	public WebElement ijMeetLogo;   //elememt logo
	
	@FindBy(css="ul.navbar-nav>li:nth-child(1)>a")
	public WebElement joinMeetingLink;
	
	@FindBy(css="ul.navbar-nav>li:nth-child(2)>a")
	public WebElement hostMeeting;
	
	@FindBy(css="ul.navbar-nav>li:nth-child(3)>a")
	public WebElement contactSales;
	
	@FindBy(css="ul.navbar-nav>li:nth-child(4)>a")
	public WebElement signIn;
	
	@FindBy(css="ul.navbar-nav>li:nth-child(5)>a")
	public WebElement signUp;
	
	@FindBy(css="span.language-trance")
	public WebElement languageTrance;
     
	@FindBy(css="a[href='https://ijmeet.com/home?csrt=6071844525676759507'] >img[alt='ijmeetimage']")
	public WebElement androidLogoLink;
	
	@FindBy(css="img[src='https://ijmeet.com/images/profile_img/ios.png']")
	public WebElement appleLogoLink;
	
	@FindBy(css="img[src='https://ijmeet.com/images/profile_img/windows.png']")
	public WebElement microsoftLogoLink;
	
	public void clickOnijMeetLogo(){
		ijMeetLogo.click();
		System.out.println("click on logo ");
	}
	public void joinMeetingLink() {
		joinMeetingLink.click();
		System.out.println("click join Meeting");	 
	}
	public void signUp() {
		signUp.click();
		System.out.println("click sign up button");	 
	}
	
	
	public String getTextOfJoinMeeting() {
		System.out.println("get text of join meeting element");
	     return joinMeetingLink.getText();
	}
	
	public void getTitle()
	{
        Keyword.getTitle();
	}
}

