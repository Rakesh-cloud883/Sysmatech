package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_CustomFieldDeletePage;

public class Tc_Settings_CustomFieldDelete_026 extends BaseClass{

	@Test
	public void CustomFieldDelete() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_CustomFieldDeletePage page=new Settings_CustomFieldDeletePage(driver);
	  		page.SetSetting();
	  		page.SetCustomFields();
	    	page.SetDeleteBtn();
	  	    String Actulmsg12="Success: The fieldset was deleted successfully.";
		    String Expectedmsg12=driver.findElement(By.xpath("//div[@class=\"alert alert-success fade in\"]")).getText();
		    System.out.println(Expectedmsg12);
		    org.testng.Assert.assertTrue(Expectedmsg12.contains(Actulmsg12));
		    lp.SetClickLogout();
	}
}
