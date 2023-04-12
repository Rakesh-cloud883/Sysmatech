package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_CustomFieldsCreatePage;
import com.sysmatech.PageObject.Settings_WorkOrder_prioritiesCreatePage;

public class Tc_Settings_WorkOrderPriorityCreate_055 extends BaseClass {
	

	@Test(priority = 1)
	public void WOPrioritiesCreate() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_WorkOrder_prioritiesCreatePage page=new Settings_WorkOrder_prioritiesCreatePage(driver);
	  		page.SetMenuBtn();
	  		page.SetSetting(); 
	  		page.SetWorkOrderPriorityBtn();
	  		page.SetCreateBtn();
	  		String r1="AutomationPriority11"+randomstring();
	  		page.SetPriorityName(r1);
	  		page.SetNote("note");
	  		page.SetsaveBtn();
	  		
	  		String ActualTitle="Success: Priority created successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		lp.SetClickLogout();

	}
	
	@Test(priority = 2)
	public void  WOPrioritiesCreate2() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_WorkOrder_prioritiesCreatePage page=new Settings_WorkOrder_prioritiesCreatePage(driver);
	  		page.SetMenuBtn();
	  		page.SetSetting(); 
	  		page.SetWorkOrderPriorityBtn();
	  		page.SetCreateBtn();
	  		String r1="AutomationPriority1"+randomstring();
	  		page.SetPriorityName(r1);
	  		page.SetNote("note");
	  		page.SetsaveBtn();
	  		
	  		String ActualTitle="Success: Priority created successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		lp.SetClickLogout();
	}  		
}
