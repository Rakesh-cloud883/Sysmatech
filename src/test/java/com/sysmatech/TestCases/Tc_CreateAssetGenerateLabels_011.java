package com.sysmatech.TestCases;

import org.testng.annotations.Test;

import com.sysmatech.PageObject.Asset_CreateAssetDeletePage;
import com.sysmatech.PageObject.Asset_CreateAssetGenerateLabelsPage;
import com.sysmatech.PageObject.LoginPage;

public class Tc_CreateAssetGenerateLabels_011 extends BaseClass {

	@Test
	public void Edit() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		
	  		Asset_CreateAssetGenerateLabelsPage page=new Asset_CreateAssetGenerateLabelsPage(driver);
	  		
            page.SetAssetbtn();
	  		page.setGenLablesBtn("Generate Labels");
            
	  	//	page.setSearchBtn("Rakesh1111");
	  		page.SetClickGenerateLables();
	  		
	  		
	}
}
