package com.sysmatech.TestCases;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.ImportPage;
import com.sysmatech.PageObject.LoginPage;

public class Tc_ImportFile_006 extends BaseClass {
	
      @Test
      public void ImportFile() throws InterruptedException
      {
        LoginPage lp=new LoginPage(driver);  
  		lp.SetUsername(username);	
  		lp.SetPassword(password);
  		lp.SetClickLogin();
  		
  		ImportPage page=new ImportPage(driver);
  		page.SetImportBtn();
  		
 // 	page.SetSelectFileupload("C:/Users/rakesh more/Downloads/FSE Assets - ZRC.csv"); //html txt png csv exe docs pdf xlsx jepg
  	    page.SetSelectFileupload("C:/Users/rakesh/Documents/Asset-1111.csv");
  		
  		String Actulmsg="Success!";
        String Expectedmsg=driver.findElement(By.xpath("//div[@class=\"progress-bar progress-bar-success\"]")).getText();
        System.out.println(Expectedmsg);
        org.testng.Assert.assertTrue(Expectedmsg.contains(Actulmsg));
        lp.SetClickLogout();
 
      }
	   
}
