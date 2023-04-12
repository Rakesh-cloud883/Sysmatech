package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.CPMParaMeterMasterNumberPage;
import com.sysmatech.PageObject.LoginPage;

public class Tc_CPMParaMeterNumber_042 extends BaseClass{

	@Test(priority =1)
	public void paraM1() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		CPMParaMeterMasterNumberPage page= new CPMParaMeterMasterNumberPage(driver);
	  		page.SetPrevM();
	  		page.SetSearchBtn("Automation");
	  		page.SetAddparam();
	  		String r1="Automation Number"+randomstring();
	  		page.SetName(r1);
	    	page.SetNumber();
	    	page.SetBenchMarklow("8");
	    	page.SetBenchMarkHigh("12");
	    	page.SetPhotoRequiredFailNum();
	    	page.SetCommentRequireFailNum();
	    	page.SetSave();
	    	String ActualTitle="Success: AuditParamsMasterValues successfully Save";
	    	String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	    	System.out.println(ExpectedTitle);
	    	Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	    	lp.SetClickLogout();

	}

	
	@Test(priority=2)
	public void paraMasterDate() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		CPMParaMeterMasterNumberPage page= new CPMParaMeterMasterNumberPage(driver);
	  		page.SetPrevM();
	  		page.SetSearchBtn("Automation ");
	  		page.SetAddparam();
	  		String r1="Automation Date"+randomstring();
	  		page.SetName(r1);
	  		page.SetDate();
	  		page.SetSave();
	  		String ActualTitle="Success: AuditParamsMasterValues successfully Save";
	    	String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	    	System.out.println(ExpectedTitle);
	    	Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	    	lp.SetClickLogout();
	}
	@Test(priority=3)
	public void paraMasterText() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		CPMParaMeterMasterNumberPage page= new CPMParaMeterMasterNumberPage(driver);
	  		page.SetPrevM();
	  	
	  		page.SetSearchBtn("Automation ");
	  		page.SetAddparam();
	  		String r1="Automation Text"+randomstring();
	  		page.SetName(r1);
	  		page.SetText();
	  		page.SetSave();
	  		String ActualTitle="Success: AuditParamsMasterValues successfully Save";
	    	String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	    	System.out.println(ExpectedTitle);
	    	Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	    	lp.SetClickLogout();
	}
//	@Test(priority =4)
//	public void paraMNumber2() throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);   
//	  		lp.SetUsername(username);	
//	  		lp.SetPassword(password);
//	  		lp.SetClickLogin();
//	  		
//	  		CPMParaMeterMasterNumberPage page= new CPMParaMeterMasterNumberPage(driver);
//	  		page.SetPrevM();
//	  		page.SetSearchBtn("Automation 6-Monthly");
//	  		Thread.sleep(3000);
//	  		page.SetAddparam();
//	  		page.SetName("Automation 6-Monthly ");
//	    	page.SetNumber();
//	    	page.SetBenchMarklow("8");
//	    	page.SetBenchMarkHigh("12");
//	    	page.SetPhotoRequiredFailNum();
//	    	page.SetCommentRequireFailNum();
//	    	page.SetSave();
//	    	String ActualTitle="Success: AuditParamsMasterValues successfully Save";
//	    	String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
//	    	System.out.println(ExpectedTitle);
//	    	Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
//	    	lp.SetClickLogout();
//
//	}
//	@Test(priority=5)
//	public void paraMasterDate2() throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);  
//	  		lp.SetUsername(username);	
//	  		lp.SetPassword(password);
//	  		lp.SetClickLogin();
//	  		
//	  		CPMParaMeterMasterNumberPage page= new CPMParaMeterMasterNumberPage(driver);
//	  		page.SetPrevM();
//	  		page.SetSearchBtn("Automation 7-Quaterly");
//	  		page.SetAddparam();
//	  		page.SetName("Automation 7-Quaterly- Date Picker");
//	  		page.SetDate();
//	  		page.SetSave();
//	  		String ActualTitle="Success: AuditParamsMasterValues successfully Save";
//	    	String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
//	    	System.out.println(ExpectedTitle);
//	    	Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
//	    	lp.SetClickLogout();
//	}
//	@Test(priority=6)
//	public void paraMasterText2() throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);  
//	  		lp.SetUsername(username);	
//	  		lp.SetPassword(password);
//	  		lp.SetClickLogin();
//	  		
//	  		CPMParaMeterMasterNumberPage page= new CPMParaMeterMasterNumberPage(driver);
//	  		page.SetPrevM();
//	  		page.SetSearchBtn("Automation 8-Quaterly	");
//	  		page.SetAddparam();
//	  		page.SetName("Automation 8-Quaterly-Text");
//	  		page.SetText();
//	  		page.SetSave();
//	  		String ActualTitle="Success: AuditParamsMasterValues successfully Save";
//	    	String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
//	    	System.out.println(ExpectedTitle);
//	    	Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
//	    	lp.SetClickLogout();
//	}
//	
//	
	
	
}

