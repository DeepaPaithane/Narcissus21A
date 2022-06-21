package com.framework;

import org.testng.annotations.Test;

import com.PageObjecModel.IJMeetHomePage;
import com.PageObjecModel.SignUpPage;
import com.browser.Browser;

public class SignUpPageTest  extends Browser{

	
@Test	
public void verifyMobileNumberInPlaceOfFullName()
	{
	
	IJMeetHomePage home=new IJMeetHomePage();
	home.signUp();
	SignUpPage sign=new SignUpPage();
	sign.enterFullName("8847757638");
	}

}
