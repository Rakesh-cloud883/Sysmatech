package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_WorkOrderPriority_DeletePage;
import com.sysmatech.PageObject.Settings_WorkOrderPriority_UpdatePage;

public class Tc_Settings_WorkOrderPriority_Delete_057 extends BaseClass {
	@Test(priority = 1)
	public void CustomField() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_WorkOrderPriority_DeletePage page=new Settings_WorkOrderPriority_DeletePage(driver);
	  		
	  		page.SetMenuBtn();
	  		page.SetSetting(); 
	  		page.SetWorkOrderPriorityBtn();
	  		page.SetSearch("AutomationPriority1");
	  		page.SetDelete();
	  		page.setDeleteYesBtn();
	  		
	  		String ActualTitle="Success: Priority deleted successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	}
}
