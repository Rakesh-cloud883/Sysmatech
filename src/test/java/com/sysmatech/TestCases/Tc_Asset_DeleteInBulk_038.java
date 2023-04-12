package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.Asset_CreateAssetDeleteInBulkPage;
import com.sysmatech.PageObject.LoginPage;

public class Tc_Asset_DeleteInBulk_038 extends BaseClass{
	@Test
	public void AssetBulkDelete() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		
	  		Asset_CreateAssetDeleteInBulkPage page=new Asset_CreateAssetDeleteInBulkPage(driver);
	  		page.SetAssetbtn();
	  		
	  		page.setDeleteBtn("Delete");
	        page.SetSearchBtn("AutomationAsset");
	  		page.SetclickDelete();
	  		page.SetConfDelete();
	  		
	  		String Actulmsg="Success: The asset was deleted successfully.";
	        String Expectedmsg=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	        System.out.println(Expectedmsg);
	        org.testng.Assert.assertTrue(Expectedmsg.contains(Actulmsg));
	        lp.SetClickLogout();
	  		
	}
//	@Test
//	public void AssetBulkDelete1() throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);  
//	  		lp.SetUsername(username);	
//	  		lp.SetPassword(password);
//	  		lp.SetClickLogin();
//	  		
//	  		
//	  		Asset_CreateAssetDeleteInBulkPage page=new Asset_CreateAssetDeleteInBulkPage(driver);
//	  		page.SetAssetbtn();
//	  		
//	  		page.setDeleteBtn("Delete");
//	 //     page.setSearchBtn("Rakesh1111");
//	  		page.SetclickDelete();
//	  		page.SetCancelBtn();
//	        lp.SetClickLogout();
//	  		
//	}
}
