package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_WorkOrder_Categories_CreatePage;

public class Tc_Settings_WorkOrder_CategoriesCreate_058 extends BaseClass {

	@Test(priority = 1)
	public void WOCategories1() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_WorkOrder_Categories_CreatePage page=new Settings_WorkOrder_Categories_CreatePage(driver);
	  		page.SetMenuBtn();
	  		page.SetSetting();
	  		page.SetCategoriesBtn();
	  		page.SetCreateBtn();
	  		String r1="AutomationCategory11"+randomstring();
	  		page.SetName(r1);
	  		page.SetNote("note");
	  		page.SetIsPublishBtn();
	  		page.SetSaveBtn();
	  		
	  		String ActualTitle="Success: Category created successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		lp.SetClickLogout();
	  		
	} 
	@Test(priority = 2)
	public void WOCategories2() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_WorkOrder_Categories_CreatePage page=new Settings_WorkOrder_Categories_CreatePage(driver);
	  		page.SetMenuBtn();
	  		page.SetSetting();
	  		page.SetCategoriesBtn();
	  		page.SetCreateBtn();
	  		String r1="AutomationCategory1"+randomstring();
	  		page.SetName(r1);
	  		page.SetNote("note");
	  		page.SetIsPublishBtn();
	  		page.SetSaveBtn();
	

	  		String ActualTitle="Success: Category created successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		lp.SetClickLogout();
	  		
	}
	
}
