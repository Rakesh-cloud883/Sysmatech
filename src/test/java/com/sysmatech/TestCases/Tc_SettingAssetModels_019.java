package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_AssetModelsPage;

public class Tc_SettingAssetModels_019 extends BaseClass {
	@Test
	public void Login() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_AssetModelsPage page= new Settings_AssetModelsPage(driver);
	  		page.SetSetting();
	  		page.SetAssetModelsBtn();
	  		page.SetCreateNewBtn();
	  		page.SetName("Rakesh55");
	  		page.SetManufacturer("RakeshManufacture123");
	  		page.SetCategory("rakesh2222222");
	  		page.SetModel("4321");
	  		page.SetEOLMonth("12");
	  		page.SetFieldset("rakesh1ee");
	  		page.SetNote("I can help you ");
	  		page.SetSaveBtn();
	  		String ActualTitle="Success: Model created successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		
	}
}
