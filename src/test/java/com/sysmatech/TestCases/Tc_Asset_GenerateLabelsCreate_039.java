package com.sysmatech.TestCases;

import org.testng.annotations.Test;

import com.sysmatech.PageObject.Asset_CreateAssetDeletePage;
import com.sysmatech.PageObject.Asset_CreateAssetGenerateLabelsPage;
import com.sysmatech.PageObject.LoginPage;

public class Tc_Asset_GenerateLabelsCreate_039 extends BaseClass {

	@Test
	public void GeneratedAsset() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		
	  		Asset_CreateAssetGenerateLabelsPage page=new Asset_CreateAssetGenerateLabelsPage(driver);
	  		
            page.SetAssetbtn();
	  		page.setGenLablesBtn("Generate Labels");
            
	  		page.SetSearchBtn("AutomationAsset");
	  //		page.SetClickGenerateLables();
	  		page.SetGoBtn();
	  		
	  		
	}
}
