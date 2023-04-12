package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.sysmatech.PageObject.CreatePMAuditParameterPage;
import com.sysmatech.PageObject.LoginPage;

public class Tc_CreatePMAuditParameter_041 extends BaseClass{
	@Test(priority = 1)
	public void Auditparams1() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  	
	  		CreatePMAuditParameterPage page= new CreatePMAuditParameterPage(driver);
	  		page.SetPrevM();
	  		page.SetCreateBtn();
	  		String r1="Automation_test"+randomNum();
	  		page.SetCollectionName(r1);
	  		page.SetSelectModel();
	  		page.SetStatus();                                                   
	  		page.SetPhotoNotRequired();
	  		page.SetCommentNotRequired();
	  		page.SetPhotoNone();
	  		page.SetcommentNone();
	  		page.SetSave();
	  		String ActualTitle="Success: AuditParamsMaster successfully Save";
	  		String ExpectedTitle=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		lp.SetClickLogout();
	  	
	  		
   }
	
	@Test(priority = 2)
	public void Auditparams2() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  	
	  		CreatePMAuditParameterPage page= new CreatePMAuditParameterPage(driver);
	  		page.SetPrevM();
	  		page.SetCreateBtn();
	  		String r1="Automation_test"+randomNum();
	  		page.SetCollectionName(r1);
	  		page.SetSelectModel();
	  		page.SetStatus();                                                   
	  		page.SetPhotoNotRequired();
	  		page.SetCommentNotRequired();
	  		page.SetPhotoNone();
	  		page.SetcommentNone();
	  		page.SetSave();
	  		String ActualTitle="Success: AuditParamsMaster successfully Save";
	  		String ExpectedTitle=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div")).getText();
	  		System.out.println(ExpectedTitle);
	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  		lp.SetClickLogout();
	  	
	  		
   }
//	@Test(priority = 2)
//	public void paraMasterText2() throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);  
//	  		lp.SetUsername(username);	
//	  		lp.SetPassword(password);
//	  		lp.SetClickLogin();
//	  		
//	  		CreatePMAuditParameterPage page= new CreatePMAuditParameterPage(driver);
//	  		page.SetPrevM();
//	  		page.SetCreateBtn();
//	  		page.SetCollectionName("Test 2-Daily");
//	  		page.SetSelectModel();
//	  		page.SetStatus();
//	  		page.SetPhotoNotRequired();
//	  		page.SetCommentNotRequired();
//	  		page.SetPhotoNone();
//	  		page.SetcommentNone();
//	  		page.SetSave();
//	  		String ActualTitle="Success: AuditParamsMaster successfully Save";
//	  		String ExpectedTitle=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div")).getText();
//	  		System.out.println(ExpectedTitle);
//	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
//	  		lp.SetClickLogout();
//	  	
//	  		
//   }
//	@Test(priority = 3)
//	public void paraMasterText3() throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);  
//	  		lp.SetUsername(username);	
//	  		lp.SetPassword(password);
//	  		lp.SetClickLogin();
//	  		
//	  		CreatePMAuditParameterPage page= new CreatePMAuditParameterPage(driver);
//	  		page.SetPrevM();
//	  		page.SetCreateBtn();
//	  		page.SetCollectionName("Test 3-Weekly");
//	  		page.SetSelectModel();
//	  		page.SetStatus();
//	  		page.SetPhotoNotRequired();
//	  		page.SetCommentNotRequired();
//	  		page.SetPhotoNone();
//	  		page.SetcommentNone();
//	  		page.SetSave();
//	  		String ActualTitle="Success: AuditParamsMaster successfully Save";
//	  		String ExpectedTitle=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div")).getText();
//	  		System.out.println(ExpectedTitle);
//	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
//	  		lp.SetClickLogout();
//	  	
//	  		
//   }
//	@Test(priority = 4)
//	public void paraMasterText4() throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);  
//	  		lp.SetUsername(username);	
//	  		lp.SetPassword(password);
//	  		lp.SetClickLogin();
//	  		
//	  		CreatePMAuditParameterPage page= new CreatePMAuditParameterPage(driver);
//	  		page.SetPrevM();
//	  		page.SetCreateBtn();
//	  		page.SetCollectionName("Test 4-Weekly");
//	  		page.SetSelectModel();
//	  		page.SetStatus();
//	  		page.SetPhotoNotRequired();
//	  		page.SetCommentNotRequired();
//	  		page.SetPhotoNone();
//	  		page.SetcommentNone();
//	  		page.SetSave();
//	  		String ActualTitle="Success: AuditParamsMaster successfully Save";
//	  		String ExpectedTitle=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div")).getText();
//	  		System.out.println(ExpectedTitle);
//	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
//	  		lp.SetClickLogout();
//	  	
//	  		
//   }
//	@Test(priority = 5)
//	public void paraMasterText5() throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);  
//	  		lp.SetUsername(username);	
//	  		lp.SetPassword(password);
//	  		lp.SetClickLogin();
//	  		
//	  		CreatePMAuditParameterPage page= new CreatePMAuditParameterPage(driver);
//	  		page.SetPrevM();
//	  		page.SetCreateBtn();
//	  		page.SetCollectionName("Test 5-Monthly");
//	  		page.SetSelectModel();
//	  		page.SetStatus();
//	  		page.SetPhotoNotRequired();
//	  		page.SetCommentNotRequired();
//	  		page.SetPhotoNone();
//	  		page.SetcommentNone();
//	  		page.SetSave();
//	  		String ActualTitle="Success: AuditParamsMaster successfully Save";
//	  		String ExpectedTitle=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div")).getText();
//	  		System.out.println(ExpectedTitle);
//	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle)); 
//	  		lp.SetClickLogout();
//	  	
//	  		
//   }
//	@Test(priority = 6)
//	public void paraMasterText6() throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);  
//	  		lp.SetUsername(username);	
//	  		lp.SetPassword(password);
//	  		lp.SetClickLogin();
//	  		
//	  		CreatePMAuditParameterPage page= new CreatePMAuditParameterPage(driver);
//	  		page.SetPrevM();
//	  		page.SetCreateBtn();
//	  		page.SetCollectionName("Test 6-Monthly");
//	  		page.SetSelectModel();
//	  		page.SetStatus();
//	  		page.SetPhotoNotRequired();
//	  		page.SetCommentNotRequired();
//	  		page.SetPhotoNone();
//	  		page.SetcommentNone();
//	  		page.SetSave();
//	  		String ActualTitle="Success: AuditParamsMaster successfully Save";
//	  		String ExpectedTitle=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div")).getText();
//	  		System.out.println(ExpectedTitle);
//	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle)); 
//	  		lp.SetClickLogout();
//	  	
//	  		
//   }
//	@Test(priority = 7)
//	public void paraMasterText7() throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);  
//	  		lp.SetUsername(username);	
//	  		lp.SetPassword(password);
//	  		lp.SetClickLogin();
//	  		
//	  		CreatePMAuditParameterPage page= new CreatePMAuditParameterPage(driver);
//	  		page.SetPrevM();
//	  		page.SetCreateBtn();
//	  		page.SetCollectionName("Test 7-Quaterly");
//	  		page.SetSelectModel();
//	  		page.SetStatus();
//	  		page.SetPhotoNotRequired();
//	  		page.SetCommentNotRequired();
//	  		page.SetPhotoNone();
//	  		page.SetcommentNone();
//	  		page.SetSave();
//	  		String ActualTitle="Success: AuditParamsMaster successfully Save";
//	  		String ExpectedTitle=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div")).getText();
//	  		System.out.println(ExpectedTitle);
//	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
//	  		lp.SetClickLogout();
//	  	
//	  		
//   }
//	@Test(priority = 8)
//	public void paraMasterText8() throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);  
//	  		lp.SetUsername(username);	
//	  		lp.SetPassword(password);
//	  		lp.SetClickLogin();
//	  		
//	  		CreatePMAuditParameterPage page= new CreatePMAuditParameterPage(driver);
//	  		page.SetPrevM();
//	  		page.SetCreateBtn();
//	  		page.SetCollectionName("Test 8-Quaterly");
//	  		page.SetSelectModel();
//	  		page.SetStatus();
//	  		page.SetPhotoNotRequired();
//	  		page.SetCommentNotRequired();
//	  		page.SetPhotoNone();
//	  		page.SetcommentNone();
//	  		page.SetSave();
//	  		Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
//	  		lp.SetClickLogout();
//	  		
//	  	
//	  		
//	  		String ActualTitle="Success: AuditParamsMaster successfully Save";
//	  		String ExpectedTitle=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div")).getText();
//	  		System.out.println(ExpectedTitle);
//   }
}
