package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_AssetModelsUpdatePage;


public class Tc_Settings_AssetModelsUpdate_029 extends BaseClass {
	@Test
	public void AssetModelsUpdate() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		Settings_AssetModelsUpdatePage page= new Settings_AssetModelsUpdatePage(driver);
	  		page.SetMenuBtn();
	  		page.SetSetting();
	  		page.SetAssetModelsBtn();
	  		page.SetSearch("AutomationModel");
	  		page.SetUpdateBtn();
	  		page.SetName("AutomationModel");
	  		page.SetSaveBtn();
	  		
	  		String ActualTitle="Success: Model updated successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		lp.SetClickLogout();
	 
	  		
	  		
	}	
	
}
