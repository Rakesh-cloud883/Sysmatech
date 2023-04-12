package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_AssetModelsViewDeletePage;

public class Tc_Settings_AssetModelsViewDelete_033 extends BaseClass{
	@Test(priority = 1)
	public void AssetModelRestore() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		Settings_AssetModelsViewDeletePage page= new Settings_AssetModelsViewDeletePage(driver);
	  		page.SetMenuBtn();
	  		page.SetSetting();
	  		page.SetAssetModelsBtn();
	  		page.SetViewDelete();
	  		page.SetSearchBtn("AutomationModel11");   //   11
	  		page.SetRestore();
	  		String ActualTitle="Success: Model restored successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		lp.SetClickLogout();
	}
//	@Test(priority = 2)
//	public void delete() throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);  
//	  		lp.SetUsername(username);	
//	  		lp.SetPassword(password);
//	  		lp.SetClickLogin();
//	  		Settings_AssetModelsViewDeletePage page= new Settings_AssetModelsViewDeletePage(driver);
//	  		page.SetSetting();
//	  		page.SetAssetModelsBtn();
//	  		page.SetViewDelete();
//	  		page.SetSearchBtn("AutomationModel111");
//	  		page.SetDeleteBtn();
//	  		page.SetYesDeleteBtn();
//	  		String ActualTitle="Success: Model restored successfully.";
//	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
//	  		System.out.println(ExpectedTitle);
//	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
//	  		lp.SetClickLogout();
//	}
}
