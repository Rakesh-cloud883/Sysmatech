package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_Preventive_Maintenance_UpdatePage;

public class Tc_preventiveMaintenance_Update_051 extends BaseClass {


	@Test()
	public void CreatePreventive_Maintenance_Clone() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_Preventive_Maintenance_UpdatePage page=new Settings_Preventive_Maintenance_UpdatePage(driver);
	  		page.SetMenuBtn();
	  		page.SetSetting();
	  		page.SetPreventiveMaintenanceConfig();
	  		page.SetUpdateBtn();
	  		page.SetAssignmentName("AutomationAssignment00");
	  		page.SetAssignmentCategory();
	  		page.SetAssignmentModel();
	  		page.SetLocation();
	  		page.SetUserGroup();
	  		page.SetStatus();
	        page.SetSaveBtn();
	  		
	  		String ActualTitle="Success: AuditParamsMasterValues successfully Updated";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	}
}
