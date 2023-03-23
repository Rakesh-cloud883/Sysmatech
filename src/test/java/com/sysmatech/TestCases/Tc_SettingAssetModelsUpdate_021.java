package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_AssetModelsUpdatePage;


public class Tc_SettingAssetModelsUpdate_021 extends BaseClass {
	@Test
	public void Login() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		Settings_AssetModelsUpdatePage page= new Settings_AssetModelsUpdatePage(driver);
	  		page.SetSetting();
	  		page.SetAssetModelsBtn();
	  		page.SetUpdateBtn();
	  		page.SetName("Rakesh444");
	  		page.SetSaveBtn();
	  		
	  		String ActualTitle="Success: Model updated successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	 
	  		
	  		
	}	
	
}
