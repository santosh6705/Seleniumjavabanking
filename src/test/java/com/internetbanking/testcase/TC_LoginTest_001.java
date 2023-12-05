package com.internetbanking.testcase;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.internetbanking.pageobject.Loginpage;

public class TC_LoginTest_001 extends Baseclass{
	@Test
	public void loginTest()
	{
		
		driver.get(baseurl);
		logger.info("url is open");
		Loginpage lp=new Loginpage(driver);
		lp.setusername(username);
		logger.info("Username is entered");
		lp.setpassword(password);
		logger.info("Password is entered");
		lp.Clicksubmit();
		
		
		if(driver.getTitle().equals("Guru99 Bank Manager Homepage"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test passed");
		}
		else
		{
			Assert.assertFalse(false);
			logger.info("Login Test failed");
		}
		
				
	}
	

}
