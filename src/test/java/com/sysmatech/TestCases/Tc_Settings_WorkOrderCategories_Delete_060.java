package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_WorkOrderCategories_DeletePage;
import com.sysmatech.PageObject.Settings_WorkOrderCategories_UpdatePage;

public class Tc_Settings_WorkOrderCategories_Delete_060 extends BaseClass {
	@Test(priority = 1)
	public void WOCategoriesDelete() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_WorkOrderCategories_DeletePage page=new Settings_WorkOrderCategories_DeletePage(driver);
	  		page.SetMenuBtn();
	  		page.SetSetting();                                                                    
	  		page.SetCategoriesBtn();
	  		page.SetSearchBtn("AutomationCategory1");
	  		page.SetDeleteBtn();
	  	    page.SetDeleteYesBtn();
	  	    
	  	    
	  	    String ActualTitle="Success: Category deleted successfully.";
	  	    String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  	    System.out.println(ExpectedTitle);
	  	    Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	}
}
