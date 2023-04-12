package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_WorkOrderPriority_UpdatePage;
import com.sysmatech.PageObject.Settings_WorkOrder_prioritiesCreatePage;

public class Tc_Settings_WorkOrderPriority_Update_056 extends BaseClass {

	@Test(priority = 1)
	public void CustomField() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_WorkOrderPriority_UpdatePage page=new Settings_WorkOrderPriority_UpdatePage(driver);
	  		
	  		page.SetMenuBtn();
	  		page.SetSetting(); 
	  		page.SetWorkOrderPriorityBtn();
	  		page.SetSearch("AutomationPriority");
	  		page.SetUpdateBtn();
	  		String r1="AutomationPriority"+randomstring();
	  		page.SetPriorityName(r1);
	  		page.SetNote("note");
	  		page.SetSaveBtn();
	  		
	  		String ActualTitle="Success: Priority updated successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		
	  		
	  		
	}

}
