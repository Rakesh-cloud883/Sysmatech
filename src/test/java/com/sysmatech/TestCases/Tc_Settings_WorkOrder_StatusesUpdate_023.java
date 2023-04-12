package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_WorkOrder_StatusesCreatePage;
import com.sysmatech.PageObject.Settings_WorkOrder_StatusesUpdatePage;

public class Tc_Settings_WorkOrder_StatusesUpdate_023 extends BaseClass {
	
	@Test()
public void WorkOrderStatusesUpdate() throws InterruptedException {
	  LoginPage lp=new LoginPage(driver);  
		lp.SetUsername(username);	
		lp.SetPassword(password);
		lp.SetClickLogin();
		Settings_WorkOrder_StatusesUpdatePage page=new Settings_WorkOrder_StatusesUpdatePage(driver);
		page.SetMenuBtn();
		page.SetSetting();
		page.SetWorkOrderStatus();
		page.SetSearchBtn("Automationstatus");
		page.SetUpdateBtn();
		String r1="AutomationStatus"+randomstring();	
		page.SetName(r1);
	//	page.SetName("AutomationStatus");
		page.SetBaseStatus("Completed");
		page.SetNote("Note1");
		page.SetIsPublished();
		page.SetSaveBtn();
		
		String ActualTitle="Success: Status updated successfully.";
		String ExpectedTitle=driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[1]/div/div")).getText();
		System.out.println(ExpectedTitle);
		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	}
}
