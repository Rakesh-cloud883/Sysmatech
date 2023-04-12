package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_SupplierUpdatePage;

public class Tc_Settings_SupplierUpdate_011 extends BaseClass {
	@Test()
	public void SupplierUpdate() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_SupplierUpdatePage page=new Settings_SupplierUpdatePage(driver);
	  		page.SetSetting();
	  		page.SetSupplier();
	  		page.SetSearch("automation");
	  		page.SetUpdate();
	  		page.SetName("AutomationSupplier1");
	  		page.SetAddress("Ahmedabad add");
	  		page.SetCity("thaltej");
	  		page.SetState("Thaltej Chaoukadi");
	  	//	page.SetCountry("India");
	  		page.SetZip("12345678");
	  		page.SetContactName("RakeshPatil12344");
	  		page.SetPhoneNo("1234567898");
	  		page.SetFax("1234567897");
	  		page.SetEmail("Rakesh@Gmail.com");
	  		page.SetNote("i will go to home ");		
	  		page.SetSaveBtn();
	  		String ActualTitle="Success: Supplier updated successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		
	}
}
