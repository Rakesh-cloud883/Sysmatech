package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_CustomFieldDeletePage;
import com.sysmatech.PageObject.Settings_DepartmentsCreatePage;

public class Tc_Settings_DepertmentsCreate_055 extends BaseClass {

	@Test(priority=1)
	public void DepartmentCreate1() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		Settings_DepartmentsCreatePage page=new Settings_DepartmentsCreatePage(driver);
	  		page.SetSetting();
	  		page.SetDepertmentBtn();
	  		page.SetCreateBtn();
	  		//page.SetDepartmentName("Department");
	  		String r1="AutomationDepartment"+randomstring();	
	  		page.SetDepartmentName(r1);
	  		page.SetCompany("rakesh11");
	  		page.SetManager("Rakesh more");
	  		page.setLocation("parola");
	  		page.SetSave();
	  		String ActualTitle="Success: Department created successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		lp.SetClickLogout();
	  		
	  		
	}
	@Test(priority = 2)
	public void DepartmentCreate2() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		Settings_DepartmentsCreatePage page=new Settings_DepartmentsCreatePage(driver);
	  		page.SetSetting();
	  		page.SetDepertmentBtn();
	  		page.SetCreateBtn();
	  		String r1="AutomationDepartment11"+randomstring();	
	  		page.SetDepartmentName(r1);
	  	//	page.SetCompany("rakesh11");
	  		page.SetManager("Rakesh more");
	  		page.setLocation("parola");
	  		page.SetSave();
	  		String ActualTitle="Success: Department created successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		lp.SetClickLogout();
	  		
	  		
	}
}
