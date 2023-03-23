package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_ManufacturerUpdatePage;

public class Tc_SettingManufacturerUpdate_027 extends BaseClass {
	@Test
	public void Login() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		Settings_ManufacturerUpdatePage page= new Settings_ManufacturerUpdatePage(driver);
	  		page.SetSettingBtn();
	  		page.SetManufacturerBtn();
	  		page.SetUpdate();
	  		page.SetName("RakeshPatil");
	  		page.SetSaveBtn();
	  		String ActualTitle="Success: Manufacturer updated successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	}
}
