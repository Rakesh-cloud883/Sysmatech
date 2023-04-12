package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


import com.sysmatech.PageObject.Asset_CreateAssetDeletePage;
import com.sysmatech.PageObject.LoginPage;

public class Tc_Asset_Delete_037 extends BaseClass {
	@Test(priority = 1)
	public void AssetDelete() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		
	  		Asset_CreateAssetDeletePage page=new Asset_CreateAssetDeletePage(driver);
	  		page.SetAssetbtn();
	  		page.SetSearchBtn("AutomationAsset");
	  		page.SetDeleteBtn();
	  	    page.SetConfDeleteBtn();
	  		
	  		
	  		String Actulmsg="Success: The asset was deleted successfully.";
	        String Expectedmsg=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	        System.out.println(Expectedmsg);
	        org.testng.Assert.assertTrue(Expectedmsg.contains(Actulmsg));
	        lp.SetClickLogout();
	}
//	@Test(priority = 2)
//	public void AssetDelete1() throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);  
//	  		lp.SetUsername(username);	
//	  		lp.SetPassword(password);
//	  		lp.SetClickLogin();
//	  		
//	  		
//	  		Asset_CreateAssetDeletePage page=new Asset_CreateAssetDeletePage(driver);
//	  		page.SetAssetbtn();
//	//      page.SetSearchBtn("Rakesh1111");
//	  		page.SetSearchBtn("AutomationAsset");
//	  	    page.SetConfCancelBtn();
//	        lp.SetClickLogout();
//	}

}
