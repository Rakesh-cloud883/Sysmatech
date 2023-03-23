package com.sysmatech.TestCases;

import org.testng.annotations.Test;

import com.sysmatech.PageObject.CPMParaMeterMasterAddparamsdropDownPage;
import com.sysmatech.PageObject.LoginPage;

public class Tc_CPMParaMeterMasterAddParamsDropdown_033 extends BaseClass{
	@Test
	public void BulkCheckout() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		CPMParaMeterMasterAddparamsdropDownPage page= new CPMParaMeterMasterAddparamsdropDownPage(driver);
	  		page.SetPrevM();
	  		page.SetAddparam();
	  		page.SetName("Test 1-Daily");
	 // 	page.SetNumber();
	  		page.SetDropDown();
	//  	page.SetText();
	//  	page.SetDate();
	  		Thread.sleep(3000);
	  		page.SetKey1("Yes");
	  		page.SetValue("Yes");
	  		page.SetAddOption();
	  		page.SetKey1("No");
	  		page.SetValue("No");
	  		page.SetAddOption();
	  		page.SetPhotoOptional();
//	  		page.SetPhotoRequired();
//	  		page.SetPhotoNotRequired();
	  		page.SetCommentOptional();
//	  	    page.SetCommentRequired();
//	  	    page.SetCommentNotRequired();
	//  	page.SetRemoveOption();
	  		Thread.sleep(0);
	  		page.SetRejectNo();
//	  		page.SetRejectYes();
	  		Thread.sleep(9000);
	  		page.SetAddOption1();
//	  		page.SetRemoveOption1();
//	  		page.SetAcceptNo();
	  		page.SetAcceptYes();
	  		page.SetAddOption2();
//	  		page.SetRemoveOption2();
	  		page.SetSave();
	  		
	  		
	  		
	}
}
