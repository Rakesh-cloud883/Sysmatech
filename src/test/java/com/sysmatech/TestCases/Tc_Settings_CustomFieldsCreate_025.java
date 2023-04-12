package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.CreatePreventiveMaintenanceSchedulerPage;
import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_CustomFieldsCreatePage;

public class Tc_Settings_CustomFieldsCreate_025 extends BaseClass {

	@Test(priority = 1)
	public void CustomField() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_CustomFieldsCreatePage page=new Settings_CustomFieldsCreatePage(driver);
	  		page.SetSetting();
	  		page.SetCustomFieldsBtn();
	  		page.SetCreateNewFieldset();
	  	    String r1="AutomationFieldSet"+randomstring();
	  		page.SetFieldSetName(r1);
	  		page.SetClickSave();
	  		String Actulmsg="Success: Fieldset created successfully.";
	        String Expectedmsg=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	        System.out.println(Expectedmsg);
	        org.testng.Assert.assertTrue(Expectedmsg.contains(Actulmsg));
	        page.SetSelectAddNewFields("AutomationCustomField");
	        page.SetRequest();
	        page.SetOrder("33");
	    	String Actulmsg1="Success: Field successfully added to fieldset.";
	        String Expectedmsg1=driver.findElement(By.xpath("//div[@class=\"alert alert-success fade in\"]")).getText();
	        System.out.println(Expectedmsg1);
	        org.testng.Assert.assertTrue(Expectedmsg1.contains(Actulmsg1));
	        page.SetRemove();
	      
	        String Actulmsg12="Success: The field was deleted successfully.";
	        String Expectedmsg12=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	        System.out.println(Expectedmsg12);
	        org.testng.Assert.assertTrue(Expectedmsg12.contains(Actulmsg12));
	        lp.SetClickLogout();
	        	        
	}  	
	
	@Test(priority = 2)
	public void CustomField2() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_CustomFieldsCreatePage page=new Settings_CustomFieldsCreatePage(driver);
	  		page.SetSetting();
	  		page.SetCustomFieldsBtn();
	  		page.SetCreateNewFieldset();
	  	    String r1="AutomationFieldSet"+randomstring();
	  		page.SetFieldSetName(r1);
	  		page.SetClickSave();
	  		String Actulmsg="Success: Fieldset created successfully.";
	        String Expectedmsg=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	        System.out.println(Expectedmsg);
	        org.testng.Assert.assertTrue(Expectedmsg.contains(Actulmsg));
	        page.SetSelectAddNewFields("AutomationCustomField");
	        page.SetRequest();
	        page.SetOrder("31");
	    	String Actulmsg1="Success: Field successfully added to fieldset.";
	        String Expectedmsg1=driver.findElement(By.xpath("//div[@class=\"alert alert-success fade in\"]")).getText();
	        System.out.println(Expectedmsg1);
	        org.testng.Assert.assertTrue(Expectedmsg1.contains(Actulmsg1));
	        page.SetRemove();
	      
	        String Actulmsg12="Success: The field was deleted successfully.";
	        String Expectedmsg12=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	        System.out.println(Expectedmsg12);
	        org.testng.Assert.assertTrue(Expectedmsg12.contains(Actulmsg12));
	        lp.SetClickLogout();
	        	        
	}  	
	
}
