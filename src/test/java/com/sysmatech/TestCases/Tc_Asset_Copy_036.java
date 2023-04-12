package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.Asset_CreateAssetCopyPage;
import com.sysmatech.PageObject.LoginPage;

public class Tc_Asset_Copy_036 extends BaseClass {
	@Test(priority = 1)
	public void CreateAssetCopy() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		
	  		Asset_CreateAssetCopyPage page=new Asset_CreateAssetCopyPage(driver);
	  		page.SetAssetbtn();
	  		//page.SetEditBtn("Edit");
	  	
	  		page.SetSearchBtn("AutomationAsset");
	  		page.SetCopyAsset();
	  		page.SetSave();
	  		String Actulmsg="Success: Asset created successfully. :)";
	        String Expectedmsg=driver.findElement(By.xpath("//div[@class=\"alert alert-success fade in\"]")).getText();
	        System.out.println(Expectedmsg);
	        org.testng.Assert.assertTrue(Expectedmsg.contains(Actulmsg));
	        lp.SetClickLogout();
	}
//	@Test(priority = 2)
//	public void CreateAssetCopy2() throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);  
//	  		lp.SetUsername(username);	
//	  		lp.SetPassword(password);
//	  		lp.SetClickLogin();
//	  		
//	  		
//	  		Asset_CreateAssetCopyPage page=new Asset_CreateAssetCopyPage(driver);
//	  		page.SetAssetbtn();
//	  		//page.SetEditBtn("Edit");
//	  	
//	  		page.SetSearchBtn("AutomationAsset");
//	  		page.SetCopyAsset();
//	  		page.SetSave();
//	  		String Actulmsg="Success: Asset created successfully. :)";
//	        String Expectedmsg=driver.findElement(By.xpath("//div[@class=\"alert alert-success fade in\"]")).getText();
//	        System.out.println(Expectedmsg);
//	        org.testng.Assert.assertTrue(Expectedmsg.contains(Actulmsg));
//	        lp.SetClickLogout();
//	}
//	@Test(priority = 2)
//	public void CreateAssetCopy1() throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);  
//	  		lp.SetUsername(username);	
//	  		lp.SetPassword(password);
//	  		lp.SetClickLogin();
//	  		
//	  		
//	  		Asset_CreateAssetCopyPage page=new Asset_CreateAssetCopyPage(driver);
//	  		page.SetAssetbtn();
//	  		//page.SetEditBtn("Edit");
//	  	//	page.SetSearchBtn("Rakesh1111");
//	  		page.SetSearchBtn();
//	  		page.SetCancelBtn();
//	        lp.SetClickLogout();
//	}
}
