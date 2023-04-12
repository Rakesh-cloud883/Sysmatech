package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_ManufacturerDeletePage;

public class Tc_Settings_ManufacturerDelete_006 extends BaseClass{
	@Test(priority=1)
	public void ManufacturerDelete1() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  	Settings_ManufacturerDeletePage page= new Settings_ManufacturerDeletePage(driver);
	  	page.SetSettingBtn();
	  	page.SetManufacturerBtn();
	  	page.SetSearchBtn("automation1Manufacturer11");
	  	page.SetDelete();
	  	page.SetYesDelete();
	  	String ActualTitle="Success: The Manufacturer was deleted successfully.";
	  	String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  	System.out.println(ExpectedTitle);
	  	Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  	lp.SetClickLogout();
	}
	@Test(priority = 2)
	public void ManufacturerDelete2() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  	Settings_ManufacturerDeletePage page= new Settings_ManufacturerDeletePage(driver);
	  	page.SetSettingBtn();
	  	page.SetManufacturerBtn();
	  	page.SetSearchBtn("automationManufacturer111");
	  	page.SetDelete();
	  	page.SetYesDelete();
	  	String ActualTitle="Success: The Manufacturer was deleted successfully.";
	  	String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  	System.out.println(ExpectedTitle);
	  	Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  	lp.SetClickLogout();
	}
}
