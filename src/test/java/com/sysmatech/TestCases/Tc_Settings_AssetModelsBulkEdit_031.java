package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_AssetModelsBulkEditPage;

public class Tc_Settings_AssetModelsBulkEdit_031 extends BaseClass {
	@Test
	public void AssetModelBulkEdit() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		Settings_AssetModelsBulkEditPage page= new Settings_AssetModelsBulkEditPage(driver);
	  		page.SetMenuBtn();
	  		page.SetSetting();
	  		page.SetAssetModelsBtn();
	  		page.SetSearchBtn("AutomationModel");
	  		page.SetBulkEdit("Edit");
	  		page.SetGoBtn();
	  		page.SetManufacturer("AutomationManufacturer");
	  		page.SetCategory("AutomationCategory");
	  		page.SetFieldSet("Automation");
	  		page.SetDepreciation("AutomationDeprec");
	  		page.SetSave();
	  	String ActualTitle="Success: Models updated.";
	  	String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  	System.out.println(ExpectedTitle);
	  	Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  	lp.SetClickLogout();
	  	
	  		
	  		
	  		
	  		
	}
}
