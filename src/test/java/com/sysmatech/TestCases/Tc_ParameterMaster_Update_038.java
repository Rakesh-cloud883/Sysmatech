package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.ParameterMaster_ClonePage;
import com.sysmatech.PageObject.ParameterMaster_UpdatePage;

public class Tc_ParameterMaster_Update_038 extends BaseClass{

	@Test()
	public void paraM1() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	 ParameterMaster_UpdatePage page= new ParameterMaster_UpdatePage(driver);
	 page.SetPrevM();
	 page.SetUpdateBtn();
	 page.SetAuditCollectionName("Test 1-Daily11");
	 page.SetSaveBtn();
	 String ActualTitle="Success: AuditParamsMaster successfully Updated";
	 String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	 System.out.println(ExpectedTitle);
	 Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	}
}
