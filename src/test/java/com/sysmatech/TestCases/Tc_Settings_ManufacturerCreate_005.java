package com.sysmatech.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_ManufacturerCreatePage;
import com.sysmatech.utilities.XLUtils;

public class Tc_Settings_ManufacturerCreate_005 extends BaseClass{
	
	@Test(dataProvider = "LoginData12" )
	public void Manufacture1(String name, String SupportNo, String EmailSupport) throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
	  		lp.SetUsername(username);	
	  		lp.SetPassword(password);
	  		lp.SetClickLogin();
	  		
	  		
	    Settings_ManufacturerCreatePage page= new Settings_ManufacturerCreatePage(driver);
	  	page.SetSettingBtn();
	  	page.SetManufacturerBtn();
	  	page.SetCreateNewBtn();
	//     String  r1="AutomationManufacture11"+randomstring();	
	    	String r1=randomstring();
	  	page.SetName(name+r1);
	  	page.SetSupportNo(SupportNo);
	  	page.SetEmailSupport(EmailSupport);
     	page.SetSaveBtn();
     	
     	
	  	String ActualTitle="Success: Manufacturer created successfully.";
	  	String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
	  	System.out.println(ExpectedTitle);
	  	Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	  	lp.SetClickLogout();	
	}
	
//	@Test(priority = 2)
//	public void Manufacture2() throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);  
//	  		lp.SetUsername(username);	
//	  		lp.SetPassword(password);
//	  		lp.SetClickLogin();
//	  		
//	  		
//	    Settings_ManufacturerCreatePage page= new Settings_ManufacturerCreatePage(driver);
//	  	page.SetSettingBtn();
//	  	page.SetManufacturerBtn();
//	  	page.SetCreateNewBtn();
//	  	String r1="AutomationManufacturer"+randomstring();	
//	  	page.SetName(r1);
//	  	page.SetSupportNo("123411");
//	  	page.SetEmailSupport("ff@UYH");
//     	page.SetSaveBtn();
//	  	String ActualTitle="Success: Manufacturer created successfully.";
//	  	String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
//	  	System.out.println(ExpectedTitle);
//	  	Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
//	  	lp.SetClickLogout();
//	  		
//	}
//	@Test(priority = 3)
//	public void Manufacturer3() throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);  
//	  		lp.SetUsername(username);	
//	  		lp.SetPassword(password);
//	  		lp.SetClickLogin();
//	  		
//	  		
//	    Settings_ManufacturerCreatePage page= new Settings_ManufacturerCreatePage(driver);
//	  	page.SetSettingBtn();
//	  	page.SetManufacturerBtn();
//	  	page.SetCreateNewBtn();
//	  	String r1="AutomationManufacturer"+randomstring();	
//	  	page.SetName(r1);
//	  	page.SetSupportNo("123411");
//	  	page.SetEmailSupport("ff@UYH");
//     	page.SetSaveBtn();
//	  	String ActualTitle="Success: Manufacturer created successfully.";
//	  	String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
//	  	System.out.println(ExpectedTitle);
//	  	Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
//	  	lp.SetClickLogout();	
//	}
//	
	 @DataProvider(name="LoginData12")
 	 String[][] getData1() throws IOException 
 	{
 		String path=System.getProperty("user.dir")+"/src/test/java/com/sysmatech/TestData/LoginData12.xlsx";
   	int rownum=XLUtils.getRowCount (path, "Sheet4");
 	    int colcount=XLUtils.getCellCount (path, "Sheet4",1);
 	
 	String logindata[][]=new String[rownum][colcount];
 	for(int i=1;i<=rownum;i++)
 	{
 	  for(int j=0;j<colcount;j++) {
 	  logindata[i-1][j]=XLUtils.getCellData(path, "Sheet4", i,j);//10
 	}
 	
 	}
 	return logindata;
  }

}
