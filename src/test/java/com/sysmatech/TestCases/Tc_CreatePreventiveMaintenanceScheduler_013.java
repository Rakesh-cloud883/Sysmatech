package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.Asset_CreateAssetGenerateLabelsPage;
import com.sysmatech.PageObject.CreatePreventiveMaintenanceSchedulerPage;
import com.sysmatech.PageObject.LoginPage;

public class Tc_CreatePreventiveMaintenanceScheduler_013 extends BaseClass {

	
	@Test(priority = 1)
	public void CreateScheduler() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		
	  		CreatePreventiveMaintenanceSchedulerPage page=new CreatePreventiveMaintenanceSchedulerPage(driver);
	  		page.SetPrevM();
	  		page.SetauditName("Test 1 Daily");
	  		page.SetAssetModel();
     		page.SetAssignparameter();
	  //	page.SetSelectCompany();
     		page.SetLocation();
   //  		page.SetAuditFequency();
     //		page.SetAuditFequencyBiAnnually();
     		page.SetAuditFequencyDaily();
     	//	page.SetAuditFequencyHoursly();
     //		page.SetAuditFequencyMonthly();
    // 		page.SetAuditFequencyQuaterly();
     //		page.SetAuditFequencyWeekly();
     		
	  		page.SetauditEvery("1");
	  		Thread.sleep(3000);
	  		
	  	//	page.SetAuditStartDate("09252013", "0345PM");   //   02/09/2023 01:33 AM
	  		
	  		page.SetAuditStartDate("03102023", "1200AM");	//Daily StartDate  	   10/03/23     12.00AM
	  		page.SetAuditEndDate("03102023", "1159PM");     //Daily EndDate        10/03/23     11.59PM
	  		page.SetWithinOrder("0", "14", "0");   //Daily Complete
	  		page.SetExpireOrder("0", "23", "59");  //Daily Expire
	  		
//	  		page.SetAuditStartDate("03102023", "1200AM");	//Weekly StartDate   	10/03/23	12.00AM
//	  		page.SetAuditEndDate("03172023", "1159PM");     //Weekly  EndDate       17/03/23    11.59PM
//	  		page.SetWithinOrder("3", "14", "0");   //Weekly Complete
//	  		page.SetExpireOrder("6", "23", "59");  //Weekly Complete
	  		
//	  		page.SetAuditStartDate("03102023", "1200AM");	//Monthly StartDate  	10/03/23	12.00AM	
//	  		page.SetAuditEndDate("04102023", "1159PM");     //Monthly EndDate       10/04/23    11.59PM    
//	  		page.SetWithinOrder("15", "14", "0");   //Monthly Complete
//	  		page.SetExpireOrder("27", "23", "59");  //Monthly Expire
	  		
	//  		page.SetClickSaveBtn();
	  		
	  		String Actulmsg="Success: AuditScheduleMaster successfully Save";
	        String Expectedmsg=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div")).getText();
	        System.out.println(Expectedmsg);
	        org.testng.Assert.assertTrue(Expectedmsg.contains(Actulmsg));	
	        lp.SetClickLogout();
	  		
	}  		
//	@Test(priority= 2)
//	public void CreateScheduler1() throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);  
//	  		lp.SetUsername(username);	
//	  		lp.SetPassword(password);
//	  		lp.SetClickLogin();
//	  		
//	  		
//	  		CreatePreventiveMaintenanceSchedulerPage page=new CreatePreventiveMaintenanceSchedulerPage(driver);
//	  		page.SetPrevM();
//	  		page.SetauditName("Test 1-Daily");
//	  		page.SetAssetModel();
//     		page.SetAssignparameter();
//	  //	page.SetSelectCompany();
//	  		page.SetauditEvery("3");
//	  		Thread.sleep(3000);
//	  		
//	  		page.SetAuditStartDate("09252013", "0345PM");    //   02/09/2023 01:33 AM
//	  		  
//	  		page.SetAuditEndDate("09252023", "0345AM");
//	  		page.SetWithinOrder("1", "1", "45");
//	  		page.SetExpireOrder("1", "1", "54");
//	  		page.SetClickCancelBtn();
//	  		lp.SetClickLogout();
//	 
//
//
//	  		
//	  		
//	  		
//	}  		

}
