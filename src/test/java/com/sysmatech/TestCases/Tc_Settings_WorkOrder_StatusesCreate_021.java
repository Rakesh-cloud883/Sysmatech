package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_WorkOrder_StatusesCreatePage;

public class Tc_Settings_WorkOrder_StatusesCreate_021 extends BaseClass {
	@Test(priority=1)
	public void WorkOrderStatuses() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		Settings_WorkOrder_StatusesCreatePage page=new Settings_WorkOrder_StatusesCreatePage(driver);
	  		page.SetMenuBtn();
	  		page.SetSetting();
	  		page.SetWorkOrderStatus();
	  		page.SetCreateBtn();
	  	    String r1="AutomationStatus"+randomstring();	
	  		page.SetName(r1);  
	  		page.SetBaseStatus("Requested");
	  		page.SetNote("Note");
	  		page.SetIsPublished();
	  		page.SetSave();
	  		
	  		String ActualTitle="Success: Status created successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));	
	  		lp.SetClickLogout();
	  		
	}
	  		
	@Test(priority=1)
	public void WorkOrderStatuses1() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		Settings_WorkOrder_StatusesCreatePage page=new Settings_WorkOrder_StatusesCreatePage(driver);
	  		page.SetMenuBtn();
	  		page.SetSetting();
	  		page.SetWorkOrderStatus();
	  		page.SetCreateBtn();
	  	    String r1="AutomationStatus"+randomstring();	
	  		page.SetName(r1);  
	  		page.SetBaseStatus("Requested");
	  		page.SetNote("Note");
	  		page.SetIsPublished();
	  		page.SetSave();
	  		
	  		String ActualTitle="Success: Status created successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));	
	  		lp.SetClickLogout();
	  		
	}
}
