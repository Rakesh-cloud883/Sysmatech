package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_StatusLabelsCreatePage;

public class Tc_Settings_StatusLabelsCreate_012 extends BaseClass {
	@Test(priority=1)
	public void StatusLabelsCreate1() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_StatusLabelsCreatePage page= new Settings_StatusLabelsCreatePage(driver);
	  		page.SetSetting();
	  		page.SetStatusLabelsBtn();
	  		page.SetCreateNewStatusLabels();
	  		String r1="AutomationStatus11"+randomstring();
	  		page.SetName(r1);
	  		page.SetStatusType("Deployable");
	  	//	page.SetStatusType("Archived");
	  		page.SetChartColor("11");
	  		page.SetNote(" i can help you ");
	  		page.SetSaveBtn();
	  	    String Actulmsg12="Success: Status Label created successfully.";
	  	    String Expectedmsg12=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
		    System.out.println(Expectedmsg12);
		    org.testng.Assert.assertTrue(Expectedmsg12.contains(Actulmsg12));
		    lp.SetClickLogout();
	}
	@Test(priority=2)
	public void StatusLabelsCreate2() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Settings_StatusLabelsCreatePage page= new Settings_StatusLabelsCreatePage(driver);
	  		page.SetSetting();
	  		page.SetStatusLabelsBtn();
	  		page.SetCreateNewStatusLabels();
	  		String r1="AutomationStatus11"+randomstring();
	  		page.SetName(r1);
	  		page.SetStatusType("Deployable");
	  	//	page.SetStatusType("Archived");
	  		page.SetChartColor("11");
	  		page.SetNote(" i can help you ");
	  		page.SetSaveBtn();
	  	    String Actulmsg12="Success: Status Label created successfully.";
	  	    String Expectedmsg12=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
		    System.out.println(Expectedmsg12);
		    org.testng.Assert.assertTrue(Expectedmsg12.contains(Actulmsg12)); 
		    lp.SetClickLogout();
	}
}
