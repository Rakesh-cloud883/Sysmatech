package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_AssetModelsClonePage;

public class Tc_SettingAssetModelsClone_020 extends BaseClass {
	@Test
	public void Login() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();


	  		Settings_AssetModelsClonePage page= new Settings_AssetModelsClonePage(driver);
	  		page.SetSetting();
	  		page.SetAssetModelsBtn();
	  		page.SetCloneBtn();
	  		page.SetName("Rakesh1233333");
	  		page.SetSaveBtn();
	  		String ActualTitle="Success: Model created successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  	    Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  	    
	  		
	}
	
}
