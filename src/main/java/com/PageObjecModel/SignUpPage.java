package com.PageObjecModel;

import org.openqa.selenium.By;

import com.framework.Keyword;

public class SignUpPage {
	
	public By fullName=By.cssSelector("input#name");
	public By companyName=By.cssSelector("input#company_name");
	public By emailId=By.cssSelector("input#email");
	public By mobileNumber=By.cssSelector("input#contact");
	public By password=By.cssSelector("input#password");
	
	public void enterFullName(String fullName)
	//public void enterFullName(String Name)
	{
		//Keyword.enterText(fullName, Name);
		Keyword.enterText(this.fullName, fullName);
	}
	public void enterCompanyName(String cmp)
	{
		Keyword.enterText(companyName, cmp);
	}
	public void enterEmailId(String email)
	{
		Keyword.enterText(emailId, email);
	}
	public void enterMobileNumber(String mobile)
	{
		Keyword.enterText(mobileNumber, mobile);
	}
	public void enterPassword(String pass)
	{
		Keyword.enterText(password, pass);
	}
	

}
