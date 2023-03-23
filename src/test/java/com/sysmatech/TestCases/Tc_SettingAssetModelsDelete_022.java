package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_AssetModelsDeletePage;
import com.sysmatech.PageObject.Settings_AssetModelsUpdatePage;

public class Tc_SettingAssetModelsDelete_022 extends BaseClass {
	@Test
	public void Login() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		Settings_AssetModelsDeletePage page=new Settings_AssetModelsDeletePage(driver);
	  		page.SetSetting();
	  		page.SetAssetModelsBtn();
	  		page.SetDeleteBtn();
	  		
	  		String ActualTitle="Success: The model was deleted successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		
	  		
	  		
	}
	  		
}
