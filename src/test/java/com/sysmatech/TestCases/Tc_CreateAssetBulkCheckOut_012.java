package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.Asset_CreateAssetBulkCheckOutPage;
import com.sysmatech.PageObject.LoginPage;

public class Tc_CreateAssetBulkCheckOut_012  extends BaseClass{
	
	@Test
	public void BulkCheckout() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		
	  		Asset_CreateAssetBulkCheckOutPage page=new Asset_CreateAssetBulkCheckOutPage(driver);
	  		
            page.SetAssetbtn();
	  		page.setBulkCheckOutBtn("Bulk CheckOut");
	  	//	page.setSearchBtn("Rakesh1111");
	  		page.SetClickBulkCheckOut();
	  	//	page.SetAssetSelect("Rakesh");
	  		page.SetUserClick("kamlesh.vyas@tasolglobal.com");    
	  		page.SetCheckOutDate("2023-01-01");
	  		page.SetCheckOutEDate("2023-02-11");
	  		page.SetCheckoutSubmitBtn();
	  		
	  		String Actulmsg="Success: Asset checked out successfully.";
	        String Expectedmsg=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	        System.out.println(Expectedmsg);
	        org.testng.Assert.assertTrue(Expectedmsg.contains(Actulmsg));
	        lp.SetClickLogout();
	        
	  		
	}
	@Test
	public void BulkCheckout2() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		
	  		Asset_CreateAssetBulkCheckOutPage page=new Asset_CreateAssetBulkCheckOutPage(driver);
	  		
            page.SetAssetbtn();
	  		page.setBulkCheckOutBtn("Bulk CheckOut");
	  	//	page.setSearchBtn("Rakesh1111");
	  		page.SetClickBulkCheckOut();
	  	//	page.SetAssetSelect("Rakesh");
	  		page.SetUserClick("kamlesh.vyas@tasolglobal.com");    
	  		page.SetCheckOutDate("2023-01-01");
	  		page.SetCheckOutEDate("2023-02-11");
	  		page.SetcancelBtn();
	        lp.SetClickLogout();
	        
	  		
	}


}
