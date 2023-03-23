package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_StatusLabelsUpdatePage;

public class Tc_Setting_StatusLabelsUpdate_017 extends BaseClass{
	@Test
	public void Login() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		Settings_StatusLabelsUpdatePage page= new Settings_StatusLabelsUpdatePage(driver);
	  		page.SetSetting();
	  		page.SetStatusLabelsBtn();
	  		page.SetUpdateBtn();
	  		page.SetName("Rakesh");
	  		page.SetStatusType("pending");
	  		page.SetSaveBtn();
	  	    String ActualTitle="Success: Status Label updated successfully.";
		    String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
			System.out.println(ExpectedTitle);
			org.testng.Assert.assertTrue(ExpectedTitle.contains(ActualTitle));  
			
	  		
	}
}
