package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_ManufacturerPage;

public class Tc_SettingManufacturer_026 extends BaseClass{
	@Test
	public void Login() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		
	    Settings_ManufacturerPage page= new Settings_ManufacturerPage(driver);
	  	page.SetSettingBtn();
	  	page.SetManufacturerBtn();
	  	page.SetCreateNewBtn();
	  	String r1=randomstring()+"RakeshManufacturer";	
	  	page.SetName(r1);
	  	page.SetSupportNo("123411");
	  	page.SetEmailSupport("ff@UYH");
	  	page.SetSaveBtn();
	  	String ActualTitle="Success: Manufacturer created successfully.";
	  	String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  	System.out.println(ExpectedTitle);
	  	Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		
	}
}
