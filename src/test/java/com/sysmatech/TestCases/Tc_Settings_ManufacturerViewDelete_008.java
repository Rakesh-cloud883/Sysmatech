package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_ManufacturerViewDeletePage;
                                  
public class Tc_Settings_ManufacturerViewDelete_008 extends BaseClass {
	
	
//	@Test(priority = 2)
//	public void ManufactureViewDelete() throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);  
//	  		lp.SetUsername(username);	
//	  		lp.SetPassword(password);
//	  		lp.SetClickLogin();
//	  		Settings_ManufacturerViewDeletePage page= new Settings_ManufacturerViewDeletePage(driver);
//	  		page.SetSettingBtn();
//	  		page.SetManufacturerBtn();
//	  		page.setViewDelete();
//	  		page.SetSearch("AutomationManufacturer11");
//	  		page.SetDelete();
//	  		String ActualTitle="Success: The Manufacturer was deleted successfully.";
//	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
//	  		System.out.println(ExpectedTitle);
//	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
//	  		lp.SetClickLogout();
//	  	
//	  		
//	}
	@Test(priority = 1)
	public void ManufacturerViewdelete2() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		Settings_ManufacturerViewDeletePage page= new Settings_ManufacturerViewDeletePage(driver);
	  		page.SetSettingBtn();
	  		page.SetManufacturerBtn();
	  		
	  		page.setViewDelete();
	  		page.SetSearch("AutomationManufacturer111");
	  		page.SetRestore();
	  		String ActualTitle="Success: Manufacturer restored successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		lp.SetClickLogout();
	  	                                                             
	}
	
	
		
	
}
