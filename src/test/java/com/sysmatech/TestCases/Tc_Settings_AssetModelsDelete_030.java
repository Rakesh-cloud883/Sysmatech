package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_AssetModelsDeletePage;
import com.sysmatech.PageObject.Settings_AssetModelsUpdatePage;

public class Tc_Settings_AssetModelsDelete_030 extends BaseClass {
	@Test(priority = 1)
	public void AssetModelDelete() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		Settings_AssetModelsDeletePage page=new Settings_AssetModelsDeletePage(driver);
	  		page.SetMenuBtn();
	  		page.SetSetting();
	  		page.SetAssetModelsBtn();
	  		page.SetSearchBtn("Automationmodel11");
	  		page.SetDeleteBtn();
	  		page.SetDeleteYesBtn();
	  		
	  		String ActualTitle="Success: The model was deleted successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		lp.SetClickLogout();
	  		
	  		
	  		
	}
//	@Test(priority = 2)
//	public void AssetModelDelete2() throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);  
//	  		lp.SetUsername(username);	
//	  		lp.SetPassword(password);
//	  		lp.SetClickLogin();
//	  		Settings_AssetModelsDeletePage page=new Settings_AssetModelsDeletePage(driver);
//	  		page.SetSetting();
//	  		page.SetAssetModelsBtn();
//	  		page.SetSearchBtn("Automationmodel111");
//	  		page.SetDeleteBtn();
//	  		page.SetDeleteYesBtn();
//	  		
//	  		String ActualTitle="Success: The model was deleted successfully.";
//	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
//	  		System.out.println(ExpectedTitle);
//	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
//	  		lp.SetClickLogout();
//	  		
//	  		
//	  		
//	}
	  		
}
