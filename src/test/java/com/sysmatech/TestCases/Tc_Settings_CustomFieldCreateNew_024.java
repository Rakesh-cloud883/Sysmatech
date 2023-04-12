package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_CustomFieldsCreatePage;
import com.sysmatech.PageObject.Settings_Custome_FeildCreateNewPage;

public class Tc_Settings_CustomFieldCreateNew_024 extends BaseClass{

	@Test
	public void CustomField() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_Custome_FeildCreateNewPage page=new Settings_Custome_FeildCreateNewPage(driver);
	  		page.SetSetting();
	  		page.SetCustomFieldBtn();
	  		page.SetNewCustomField();
	  		String r1="AutomationCustomField11"+randomstring();
	  		page.SetNameCustomField(r1);
	  		page.SetFromElement("text Box");  //Text Box
	  		page.SetFormat("Any");
	  		page.SetHelpText("text");
	  		page.SetClickCheckOutEmail();
	  	//	page.SetClickEncryptValue();
	  		page.SetSaveBtn();
	  		
//
//	        String Actulmsg12="Success: Field created successfully.";
//	        String Expectedmsg12=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
//	        System.out.println(Expectedmsg12);
//	        org.testng.Assert.assertTrue(Expectedmsg12.contains(Actulmsg12));
	        lp.SetClickLogout();
	  		
	}
}
