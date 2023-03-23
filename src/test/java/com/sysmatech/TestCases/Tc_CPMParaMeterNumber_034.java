package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.CPMParaMeterMasterNumberPage;
import com.sysmatech.PageObject.LoginPage;

public class Tc_CPMParaMeterNumber_034 extends BaseClass{

	@Test(priority =1)
	public void paraM1() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		CPMParaMeterMasterNumberPage page= new CPMParaMeterMasterNumberPage(driver);
	  		page.SetPrevM();
	  		page.SetSearchBtn("Test 2-Daily");
	  		page.SetAddparam();
	  		page.SetName("Test 2-Daily");
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
	  		page.SetSearchBtn("Test 3-Weekly");
	  		page.SetAddparam();
	  		page.SetName("Test 3-Weekly- Date Picker");
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
	  		page.SetSearchBtn("Test 4-Weekly");
	  		page.SetAddparam();
	  		page.SetName("Test 4-Weekly- Text ");
	  		page.SetText();
	  		page.SetSave();
	  		String ActualTitle="Success: AuditParamsMasterValues successfully Save";
	    	String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	    	System.out.println(ExpectedTitle);
	    	Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	    	lp.SetClickLogout();
	}
	@Test(priority =4)
	public void paraMNumber2() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		CPMParaMeterMasterNumberPage page= new CPMParaMeterMasterNumberPage(driver);
	  		page.SetPrevM();
	  		page.SetSearchBtn("Test 6-Monthly");
	  		Thread.sleep(3000);
	  		page.SetAddparam();
	  		page.SetName("Test 6-Monthly ");
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
	@Test(priority=5)
	public void paraMasterDate2() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		CPMParaMeterMasterNumberPage page= new CPMParaMeterMasterNumberPage(driver);
	  		page.SetPrevM();
	  		page.SetSearchBtn("Test 7-Quaterly");
	  		page.SetAddparam();
	  		page.SetName("Test 7-Quaterly- Date Picker");
	  		page.SetDate();
	  		page.SetSave();
	  		String ActualTitle="Success: AuditParamsMasterValues successfully Save";
	    	String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	    	System.out.println(ExpectedTitle);
	    	Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	    	lp.SetClickLogout();
	}
	@Test(priority=6)
	public void paraMasterText2() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		CPMParaMeterMasterNumberPage page= new CPMParaMeterMasterNumberPage(driver);
	  		page.SetPrevM();
	  		page.SetSearchBtn("Test 8-Quaterly	");
	  		page.SetAddparam();
	  		page.SetName("Test 8-Quaterly-Text");
	  		page.SetText();
	  		page.SetSave();
	  		String ActualTitle="Success: AuditParamsMasterValues successfully Save";
	    	String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	    	System.out.println(ExpectedTitle);
	    	Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	    	lp.SetClickLogout();
	}
	
	
	
	
}

