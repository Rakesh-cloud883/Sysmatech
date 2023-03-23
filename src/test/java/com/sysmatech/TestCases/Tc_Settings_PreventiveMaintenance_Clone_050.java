package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_Preventive_Maintenance_ClonePage;

public class Tc_Settings_PreventiveMaintenance_Clone_050 extends BaseClass{

	@Test()
	public void CreatePreventive_Maintenance_Clone() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		Settings_Preventive_Maintenance_ClonePage page= new Settings_Preventive_Maintenance_ClonePage(driver);
	  		page.SetMenuBtn();
	  		page.SetSetting();
	  		page.SetPreventiveMaintenanceConfig();
	  		page.SetCloneBtn();
	  		page.SetSave();
	  		String ActualTitle="Success: AuditParamsMasterValues successfully Updated";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		
	
	  		
	}
}
