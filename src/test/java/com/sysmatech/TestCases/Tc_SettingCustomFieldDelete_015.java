package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Setting_CustomFieldDeletePage;

public class Tc_SettingCustomFieldDelete_015 extends BaseClass{

	@Test
	public void Login() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Setting_CustomFieldDeletePage page=new Setting_CustomFieldDeletePage(driver);
	  		page.SetSetting();
	  		page.SetCustomFields();
	  		page.SetDeleteBtn();
	  	    String Actulmsg12="Success: The fieldset was deleted successfully.";
		    String Expectedmsg12=driver.findElement(By.xpath("//div[@class=\"alert alert-success fade in\"]")).getText();
		    System.out.println(Expectedmsg12);
		    org.testng.Assert.assertTrue(Expectedmsg12.contains(Actulmsg12));
	}
}
