package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_Preventive_Maintenance_ConfigPage;

public class Tc_Settings_PreventiveMaintenance_Config_049 extends BaseClass{
	@Test()
	public void CreatePreventive_Maintenance_Config() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  	   Settings_Preventive_Maintenance_ConfigPage page=new Settings_Preventive_Maintenance_ConfigPage(driver);
	  	   page.SetMenuBtn();
	  	   page.SetSetting();
	  	   page.SetPreventiveMaintenanceConfig();
	  	   page.SetCreateBtn();
	  	   page.SetAssignmentName("AutomationTesting");
	  	   page.SetSelectassignmentCategory(); 
	  	   page.SetAssignmentModel();                  
	  	   page.SetAssignmentLocation();
	  	   page.SetSelectUserGroup();
	  	   page.SetStatus();
	  	   page.SetSaveBtn();
	  	   String Actualtitle="Success: Preventive Maintenance successfully Save";
	  	   String  ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  	   System.out.println(ExpectedTitle);
	  	   Assert.assertTrue(ExpectedTitle.contains(Actualtitle));
	  	   
	  
	  		
	  		
	}
}
