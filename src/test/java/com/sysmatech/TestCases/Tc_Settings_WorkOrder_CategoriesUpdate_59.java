package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_WorkOrderCategories_UpdatePage;
import com.sysmatech.PageObject.Settings_WorkOrder_Categories_CreatePage;

public class Tc_Settings_WorkOrder_CategoriesUpdate_59 extends BaseClass {

	
	@Test(priority = 1)
	public void WOCategoriesUpdate() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_WorkOrderCategories_UpdatePage page=new Settings_WorkOrderCategories_UpdatePage(driver);
	  		                       
	  		page.SetMenuBtn();
	  		page.SetSetting();                                                                    
	  		page.SetCategoriesBtn();
	  		page.SetSearchBtn("AutomationCategory");
	  		page.SetUpdateBtn();
	  		String r1="AutomationCategory"+randomstring();
	  		page.SetCategoryName(r1);
	  		page.SetNotes("note");
	  		page.SetSaveBtn();   
	  		
	  		String ActualTitle="Success: Category updated successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	}
}
