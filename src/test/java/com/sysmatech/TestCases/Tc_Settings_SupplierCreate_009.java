package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_SupplierCreatePage;

public class Tc_Settings_SupplierCreate_009 extends BaseClass {
	@Test(priority =1)  
	public void Supplier1() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		Settings_SupplierCreatePage page= new Settings_SupplierCreatePage(driver);
	  		page.SetSetting();
	  		page.SetSupplierBtn();
	  		page.SetCreateNew();
	  		String r1="AutomationSupplier1"+randomstring();
	  		page.SetSupplier(r1);
	  		page.SetAddress("amhedabad is good city");
	  		page.SetCity("Ahmedabad");
	  		page.SetState("Gujrat");
	  		page.SetCountry("India");
	  		page.SetZip("123456");
	  		page.SetContactName("Ajibo garibo name");
	  		page.SetPhoneNo("1234567891");
	  		page.SetFax("12345678");
	  		page.SetEmail("Automation23@gmail.com");
	  		page.SetNote("....");
	  		page.SetSaveBtn();
	  		String ActualTitle="Success: Supplier created successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("//div[@class=\"alert alert-success fade in\"]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		lp.SetClickLogout();
	  		
	  		
	}
	@Test(priority = 2)
	public void Supplier2() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		Settings_SupplierCreatePage page= new Settings_SupplierCreatePage(driver);
	  		page.SetSetting();
	  		page.SetSupplierBtn();
	  		page.SetCreateNew();
	  		String r1="AutomationSupplier11"+randomstring();
	  		page.SetSupplier(r1);
	  		page.SetAddress("amhedabad is good city");
	  		page.SetCity("Ahmedabad");
	  		page.SetState("Gujrat");
	  		page.SetCountry("India");
	  		page.SetZip("123456");
	  		page.SetContactName("Ajibo garibo name");
	  		page.SetPhoneNo("1234567891");
	  		page.SetFax("12345678");
	  		page.SetEmail("Automation23@gmail.com");
	  		page.SetNote("....");
	  		page.SetSaveBtn();
	  		String ActualTitle="Success: Supplier created successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("//div[@class=\"alert alert-success fade in\"]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		lp.SetClickLogout();
	  		
	}
}
