package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_AssetModelsClonePage;

public class Tc_Settings_AssetModelsClone_028 extends BaseClass {
	@Test(priority = 1)
	public void AssetModelsClone() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();


	  		Settings_AssetModelsClonePage page= new Settings_AssetModelsClonePage(driver);
	  		page.SetMenuBtn();
	  		page.SetSetting();
	  		page.SetAssetModelsBtn();
	  		page.SetSearchBtn("automationmodel");
	  		page.SetCloneBtn();
	  		page.SetName("AutomationAssetModel");
	  		page.SetSaveBtn();
	  		String ActualTitle="Success: Model created successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  	    Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  	    lp.SetClickLogout();
	  	    
	  		
	}
//	@Test(priority=2)
//	public void AssetModelClone1() throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);  
//	  		lp.SetUsername(username);	
//	  		lp.SetPassword(password);
//	  		lp.SetClickLogin();
//
//
//	  		Settings_AssetModelsClonePage page= new Settings_AssetModelsClonePage(driver);
//	  		page.SetSetting();
//	  		page.SetAssetModelsBtn();
//	  		page.SetSearchBtn("automationmodel");
//	  		page.SetCloneBtn();
//	  		page.SetName("AutomationAssetModel");
//	  		page.SetSaveBtn();
//	  		String ActualTitle="Success: Model created successfully.";
//	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
//	  		System.out.println(ExpectedTitle);
//	  	    Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
//	  	    lp.SetClickLogout();
//	  	    
//	  		
//	}
}
