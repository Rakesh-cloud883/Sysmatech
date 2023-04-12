package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.PM_Scheduler_UpdatePage;

public class Tc_PM_Scheduler_Update_052 extends BaseClass{
	@Test
	public void Scheduler_Update() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		PM_Scheduler_UpdatePage page= new PM_Scheduler_UpdatePage(driver);
	  		page.SetPrevM();           
	  		page.SetSchedulerBtn();
	  		page.SetSearchBtn("AutomationTest11");
	  		page.SetUpdateBtn();
	  		page.SetName("AutomationAudit11");
	  		page.SetSaveBtn();         
	  		String ActualTitle="Success: The audit schedule was updated successfully. Your changes will come into effect in next schedule cycle.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		
	}
}
