package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.PM_Scheduler_DeletePage;

public class Tc_PM_Scheduler_Delete_042 extends BaseClass{
	
	@Test
	public void Scheduler_Delete() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		PM_Scheduler_DeletePage page=new PM_Scheduler_DeletePage(driver);
	  		page.SetPrevM();
	  		page.SetSchedulerBtn();
	  		page.SetDeleteBtn();
	  		
	  		
	  		String ActualTitle="Success: AuditScheduleMaster successfully Delete";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		
	  		
	}

}
