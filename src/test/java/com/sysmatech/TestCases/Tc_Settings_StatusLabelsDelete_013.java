package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_StatusLabelsDeletePage;


public class Tc_Settings_StatusLabelsDelete_013 extends BaseClass{
	@Test
	public void StatusLabelsDelete() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_StatusLabelsDeletePage page= new Settings_StatusLabelsDeletePage(driver);
	  		page.SetSetting();
	  		page.SetStatusLabelsBtn();
	  		page.SetSearchBtn("AutomationStatus11");
	  		page.SetDeleteBtn();
	    	page.SetDeleteYesBtn();
	  		String ActualTitle="Success: The Status Label was deleted successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("//div[@class=\"alert alert-success fade in\"]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	}
}
