package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_DepreciationCreatePage;

public class Tc_Settings_DepreciationCreate_046 extends BaseClass{

	@Test
	public void Login() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		Settings_DepreciationCreatePage page= new Settings_DepreciationCreatePage(driver);
	  		page.SetMenuBtn();
	  		page.SetSetting();
	  		page.SetDepreciationBtn();
	  		page.SetCreateBtn();
	  		page.SetDepreciationName("Depreciation99");
	  		page.SetNumberOfMonth("2");
	  		page.SetMinimumValueafterDepreciation("1");
	  		page.SetSave();
	  		String ActualTitle="Success: Depreciation class created successfully. :)";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		
	  				
	}
	
}
