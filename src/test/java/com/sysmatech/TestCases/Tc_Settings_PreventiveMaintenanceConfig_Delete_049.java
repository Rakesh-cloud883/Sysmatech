package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_preventive_Maintenance_Config_DeletePage;

public class Tc_Settings_PreventiveMaintenanceConfig_Delete_049 extends BaseClass {

	@Test()
	public void PreventiveMaintenanceConfig_Delete() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		Settings_preventive_Maintenance_Config_DeletePage page=new Settings_preventive_Maintenance_Config_DeletePage(driver);
	  		page.SetMenuBtn();
	  		page.SetSetting();
	  		page.SetPreventiveMaintenanceConfig();
	  		page.SetDeleteBtn();
	  		String ActualTitle="Success: Preventive Maintenance successfully Delete";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		
	  		
	}
	  		
}
