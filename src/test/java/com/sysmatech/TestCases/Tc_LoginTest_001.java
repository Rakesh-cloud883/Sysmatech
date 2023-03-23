package com.sysmatech.TestCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.log4testng.Logger;

import com.sysmatech.PageObject.LoginPage;
import dev.failsafe.internal.util.Assert;

public class Tc_LoginTest_001 extends BaseClass{
	LoginPage lp;
	
	@Test
	public void loginTest() throws IOException, InterruptedException {
	    lp=new LoginPage(driver);
	  
	   
	    String	ActualCurrentUrl1=driver.getCurrentUrl();
		System.out.println(ActualCurrentUrl1);
		org.testng.Assert.assertEquals(ActualCurrentUrl1, "https://uat.sysmatech.com/public/login");
		
		String ActualTitle1=driver.getTitle();
		System.out.println(ActualTitle1);
		org.testng.Assert.assertEquals(ActualTitle1, "FSE Maintenance System");
      
		
		lp.SetUsername(username);
		
		
		lp.SetPassword("password");
		lp.SetClickLogin();
		
	}

}
