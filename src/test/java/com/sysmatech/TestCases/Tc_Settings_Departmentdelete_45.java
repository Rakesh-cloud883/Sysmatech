package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Setting_Department_DeletePage;

public class Tc_Settings_Departmentdelete_45 extends BaseClass{
	@Test
	public void Login() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Setting_Department_DeletePage page=new Setting_Department_DeletePage(driver);
	  		page.SetSetting();
	  		page.SetDepertmentBtn();
	  		page.SetDelete();
	  		
	  		String ActualTitle="Success: The department was deleted successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  	    
	  		
	}
}
