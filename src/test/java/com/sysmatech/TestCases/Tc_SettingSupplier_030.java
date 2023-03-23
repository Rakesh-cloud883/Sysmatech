package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_SupplierPage;

public class Tc_SettingSupplier_030 extends BaseClass {
	@Test()
	public void Login() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		Settings_SupplierPage page= new Settings_SupplierPage(driver);
	  		page.SetSetting();
	  		page.SetSupplierBtn();
	  		page.SetCreateNew();
	  		String r1=randomstring()+"RakeshSupllier";
	  		page.SetSupplier(r1);
	  		page.SetAddress("amhedabad is good city");
	  		page.SetCity("Ahmedabad");
	  		page.SetState("Gujrat");
	  		page.SetCountry("India");
	  		page.SetZip("123456");
	  		page.SetContactName("Ajibo garibo name");
	  		page.SetPhoneNo("1234567891");
	  		page.SetFax("12345678");
	  		page.SetEmail("Rakesh123@gmail.com");
	  		page.SetNote("this asset site is good ");
	  		page.SetSaveBtn();
	  		String ActualTitle="Success: Supplier created successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("//div[@class=\"alert alert-success fade in\"]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		
	  		
	}
}
