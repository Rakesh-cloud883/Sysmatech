package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_AssetModelsBulkDeletePage;
import com.sysmatech.PageObject.Settings_AssetModelsBulkEditPage;

public class Tc_Settings_AssetModelsBulkDelete_032 extends BaseClass{
	@Test
	public void AssetModelBulkDelete() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		Settings_AssetModelsBulkDeletePage page= new Settings_AssetModelsBulkDeletePage(driver);
	  		page.SetMenuBtn();
	  		page.SetSetting();
	  		page.SetAssetModelsBtn();
	  		page.SetSearchBtn("automationModel111");
	  		page.SetBulkDelete("Delete");
	  		page.SetGoBtn();
	  		page.SetDeleteBtn();
	  		String ActualTitle="1 model(s) deleted!";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		
	}
}
