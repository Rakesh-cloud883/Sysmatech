package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_AssetModelsBulkEditPage;

public class Tc_SettingAssetModelsBulkEdit_023 extends BaseClass {
	@Test
	public void Login() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		Settings_AssetModelsBulkEditPage page= new Settings_AssetModelsBulkEditPage(driver);
	  		page.SetSetting();
	  		page.SetAssetModelsBtn();
	  		page.SetBulkEdit("Edit");
	  		page.SetGoBtn();
	  		page.SetManufacturer("rakeshManufacture123");
	  		page.SetCategory("rakesh222");
	  		page.SetSave();
	  	String ActualTitle="Success: Models updated.";
	  	String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  	System.out.println(ExpectedTitle);
	  	Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  	
	  		
	  		
	  		
	  		
	}
}
