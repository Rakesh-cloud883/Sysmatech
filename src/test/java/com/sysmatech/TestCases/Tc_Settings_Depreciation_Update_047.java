package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_Department_UpdatePage;
import com.sysmatech.PageObject.Settings_Depreciation_UpdatePage;

public class Tc_Settings_Depreciation_Update_047 extends BaseClass {
	@Test
	public void Login() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_Depreciation_UpdatePage page= new Settings_Depreciation_UpdatePage(driver);
	  		page.SetMenuBtn();
	  		page.SetSetting();
	  		page.SetDepreciationBtn();
	  		page.SetUpdateBtn();
	  		page.SetDepreciationName("Depreciation00");
	  		page.SetNumberOfMonth("3");
	  		page.SetMinimumValueafterDepreciation("1");
	  		page.SetSaveBtn();
	  		String ActualTitle="Success: Depreciation class updated successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	}
}
