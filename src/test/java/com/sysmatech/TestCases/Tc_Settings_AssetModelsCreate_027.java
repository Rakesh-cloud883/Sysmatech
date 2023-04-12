package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_AssetModelsCreatePage;

public class Tc_Settings_AssetModelsCreate_027 extends BaseClass {
	@Test(priority = 1)
	public void AssetModels() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_AssetModelsCreatePage page= new Settings_AssetModelsCreatePage(driver);
	  		page.SetMenuBtn();
	  		page.SetSetting();
	  		page.SetAssetModelsBtn();
	  		page.SetCreateNewBtn();
	  	//	page.SetName("AutomationModel");
	  		String r1="AutomationModel11"+randomstring();	
	  		page.SetName(r1);
	  		page.SetManufacturer("AutomationManufacturer");
	  		page.SetCategory("AutomationCategory");
	  		page.SetModel("4321");
	  		page.SetDepreciation("AutomationDepre");
	  		page.SetEOLMonth("12");
	  		page.SetFieldset("AutomationField");     
	  		page.SetNote("I can help you");
	 		page.SetSaveBtn();   
	  		String ActualTitle="Success: Model created successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		lp.SetClickLogout();
	  		
	}
	@Test(priority=2)
	public void AssetModels2() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_AssetModelsCreatePage page= new Settings_AssetModelsCreatePage(driver);
	  		page.SetSetting();
	  		page.SetAssetModelsBtn();
	  		page.SetCreateNewBtn();
	  		String r1="AutomationModel111"+randomstring();	
	  		page.SetName(r1);
	  		page.SetManufacturer("AutomationManufacturer");
	  		page.SetCategory("AutomationCategory");
	  		page.SetModel("4321");
	  		page.SetDepreciation("Depreciation1");
	  		page.SetEOLMonth("12");
	  		page.SetFieldset("AutomationField");     
	  		page.SetNote("I can help you");
	 		page.SetSaveBtn();   
	  		String ActualTitle="Success: Model created successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		lp.SetClickLogout();
	  		
	}
	@Test(priority=3)
	public void AssetModels3() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_AssetModelsCreatePage page= new Settings_AssetModelsCreatePage(driver);
	  		
	  		page.SetSetting();
	  		page.SetAssetModelsBtn();
	  		page.SetCreateNewBtn();
	  		String r1="AutomationModel1"+randomstring();	
	  		page.SetName(r1);
	  		page.SetManufacturer("AutomationManufacturer");
	  		page.SetCategory("AutomationCategory");
	  		page.SetModel("4321");
	  		page.SetDepreciation("AutomationDepre");
	  		page.SetEOLMonth("12");
	  		page.SetFieldset("AutomationField");     
	  		page.SetNote("I can help you");
	 		page.SetSaveBtn();   
//	  		String ActualTitle="Success: Model created successfully.";
//	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
//	  		System.out.println(ExpectedTitle);
//	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
//	  		lp.SetClickLogout();
//	  		
	}
}
