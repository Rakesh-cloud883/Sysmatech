package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.Asset_CreateAssetUpdatePage;
import com.sysmatech.PageObject.LoginPage;

public class Tc_Asset_Edit_035 extends BaseClass{
	
	@Test(priority = 1)
	public void Edit() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		Asset_CreateAssetUpdatePage page=new Asset_CreateAssetUpdatePage(driver);
	  		page.SetAssetbtn();
	  		//page.SetEditBtn("Edit");
	  		//page.SetSearchBtn("Assset11111");
	  		page.SetSearchBtn("AutomationAsset");	
	  		page.SetUpdateBtn();
	  		page.SetPurchaseCost("76561");
	  		page.SetSaveButton();
	  		
	  		String Actulmsg="Success: Asset updated successfully.";
	        String Expectedmsg=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div")).getText();
	        System.out.println(Expectedmsg);
	        org.testng.Assert.assertTrue(Expectedmsg.contains(Actulmsg));
	        lp.SetClickLogout();
	  		
	}
//	@Test(priority = 2)
//	public void Edit1() throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);  
//	  		lp.SetUsername(username);	
//	  		lp.SetPassword(password);
//	  		lp.SetClickLogin();
//	  		
//	  		Asset_CreateAssetEditPage page=new Asset_CreateAssetEditPage(driver);
//	  		page.SetAssetbtn();
//	  		//page.SetEditBtn("Edit");
//	  		//page.SetSearchBtn("Assset11111");
//	  		page.SetSearchBtn();	  		
//	  		page.SetPurchaseCost("76561");
//	  		page.SetCancelButton();
//	        lp.SetClickLogout();
//	  		
//	}

}
