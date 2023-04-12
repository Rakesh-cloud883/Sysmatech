

	package com.sysmatech.TestCases;

	import org.openqa.selenium.By;
	import org.testng.Assert;
	import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_Depreciation_DeletePage;



	public class Tc_Settings_Depreciation_Delete_019 extends BaseClass  {
		@Test
		public void DepreciationDelete() throws InterruptedException {
			  LoginPage lp=new LoginPage(driver);  
		  		lp.SetUsername(username);	
		  		lp.SetPassword(password);
		  		lp.SetClickLogin();
		  		
		  		Settings_Depreciation_DeletePage page= new Settings_Depreciation_DeletePage(driver);
		  		page.SetMenuBtn();
		  		page.SetSetting();
		  		page.SetDepreciationBtn();
		  		page.SetSearchBtn("automation");
		  		page.SetDeleteBtn();
		  		page.SetDeleteYesBtn();
		  		
		  		String ActualTitle="Success: The depreciation class was deleted successfully.";
		  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
		  		System.out.println(ExpectedTitle);
		  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
		  			
		}
	}


