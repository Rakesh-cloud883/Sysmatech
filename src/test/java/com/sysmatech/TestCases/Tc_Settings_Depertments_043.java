package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Setting_CustomFieldDeletePage;
import com.sysmatech.PageObject.Settings_DepartmentsCreatePage;

public class Tc_Settings_Depertments_043 extends BaseClass {

	@Test
	public void Login() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		Settings_DepartmentsCreatePage page=new Settings_DepartmentsCreatePage(driver);
	  		page.SetSetting();
	  		page.SetDepertmentBtn();
	  		page.SetCreateBtn();
	  		page.SetDepartmentName("Department");
	  		page.SetCompany("rakesh11");
	  		page.SetManager("Rakesh more");
	  		page.setLocation("parola");
	  		page.SetSave();
	  		String ActualTitle="Success: Department created successfully.";
	  		String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		
	  		
	}
}
