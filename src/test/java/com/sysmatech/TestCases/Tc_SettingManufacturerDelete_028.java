package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_ManufacturerDeletePage;

public class Tc_SettingManufacturerDelete_028 extends BaseClass{
	@Test
	public void Login() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  	Settings_ManufacturerDeletePage page= new Settings_ManufacturerDeletePage(driver);
	  	page.SetSettingBtn();
	  	page.SetManufacturerBtn();
	  	page.SetDelete();
	  	String ActualTitle="Success: The Manufacturer was deleted successfully.";
	  	String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  	System.out.println(ExpectedTitle);
	  	Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	}
}
