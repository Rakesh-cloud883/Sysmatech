package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_Preventive_Maintenance_ConfigCreatePage;

public class Tc_Settings_PreventiveMaintenance_ConfigCreate_046 extends BaseClass{
	@Test()
	public void CreatePreventive_Maintenance_Config() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  	   Settings_Preventive_Maintenance_ConfigCreatePage page=new Settings_Preventive_Maintenance_ConfigCreatePage(driver);
	  	   page.SetMenuBtn();
	  	   page.SetSetting();
	  	   page.SetPreventiveMaintenanceConfig();
	  	   page.SetCreateBtn();
	  	   String r1="AutomationPM"+randomstring();
	  	   page.SetAssignmentName(r1);
	  //  page.SetAssignmentName("AutomationPM");
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
