package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.Settings_EscalationMatrixPage;
import com.sysmatech.PageObject.LoginPage;

public class Tc_EscalationMatrix_036 extends BaseClass{
	
	@Test
	public void Login() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_EscalationMatrixPage page=new Settings_EscalationMatrixPage(driver);
	  		page.SetSetting();
	  		page.SetEscalationMatrixBtn();
	  		page.SetSearchBtn("rakesh11");
	  		page.SetUpdateBtn();
	  		page.SetActiveClick();
	  		
	  		page.SetLevel1Day("0");
	  		page.SetLevel1Hours("0");
	  		page.SetLevel1Minutes("1");
//	  		page.SetEscalationTo("rakesh more");
//	  		page.SetEmail();
//	  		page.SetNotification();
//	  		page.SetStatusClick();
	  		//------/////------------////------------------
	  		page.SetLevel2Day("0");
	  		page.SetLevel2Hours("8");
	  		page.SetLevel2Minutes("0");
//	    	page.SetEscalationToL2("rakesh more");
//	  		page.SetNotificationL2();
	  		///-----------------------///-------
	  		page.SetLevel3Day("0");
	  		page.SetLevel3Hours("12");
	  		page.SetLevel3Minutes("0");
//	    	page.SetEscalationToL3("rakesh more");
//	  		page.SetNotificationL3();
	  	///-----------------------///-------
	  		page.SetLevel4Day("0");
	  		page.SetLevel4Hours("18");
	  		page.SetLevel4Minutes("0");
//	     	page.SetEscalationToL4("rakesh more");
//	  		page.SetNotificationL4();
	  	///-----------------------///-------
	  		page.SetLevel5Day("0");
	  		page.SetLevel5Hours("20");
	  		page.SetLevel5Minutes("0");
//	    	page.SetEscalationToL5("rakesh more");
//	  		page.SetNotificationL5();
	  		page.SetSave();
	  		
	  		String ActualTitle="Success: Escalation matrix configuration updated successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	}
}
