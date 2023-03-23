package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_Department_UpdatePage;

public class Tc_Settings_DepartMentsUpdate_44 extends BaseClass{

	
	@Test
	public void Login() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_Department_UpdatePage page=new Settings_Department_UpdatePage(driver);
	  		page.SetSetting();
	  		page.SetDepertmentBtn();
	  		page.SetUpdateBtn();
	  		page.SetDepartmentName("RakeshDepartment");
	  		page.SetCompany("Rakesh11");
	  		page.SetManager("rakesh more");
	  		page.SetLocation("parola");
	  		page.SetSaveBtn();
	  		
	  		String ActualTitle="Success: Department updated successfully.";
	  		String ExpectedTitle= driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	}
}
