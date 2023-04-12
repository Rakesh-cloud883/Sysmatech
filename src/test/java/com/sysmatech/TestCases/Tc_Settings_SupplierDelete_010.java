package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_SupplierDeletePage;


public class Tc_Settings_SupplierDelete_010 extends BaseClass {
	@Test()
	public void SupplierDelete() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  	
	  Settings_SupplierDeletePage page= new Settings_SupplierDeletePage(driver);
	  page.SetSetting();
	
	  page.SetSupplier();
	  page.SetSearchBtn("automationSupplier11");
	  page.SetDeleteBtn();
	  page.SetYesDelete();
	 
	  String ActualTitle="Success: Supplier was deleted successfully.";
	  String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  System.out.println(ExpectedTitle);
	  Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	 
	  		
	}
}
