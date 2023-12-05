package com.internetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver Idriver;
	
	public Loginpage(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup	
	WebElement btnLogin;
	
	public void setusername(String username)
	{
		
		txtUsername.sendKeys(username);
	}
	public void setpassword(String password)
	{
		
		txtPassword.sendKeys(password);
	}
	
	public void Clicksubmit( )
	{
		
		btnLogin.click();
	}
}
