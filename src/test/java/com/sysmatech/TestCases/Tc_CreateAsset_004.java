package com.sysmatech.TestCases;

import java.io.IOException;
import java.util.List;
import java.util.logging.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.Settings_AddCompanyPage;
import com.sysmatech.PageObject.Asset_CreateAssetPage;
import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.utilities.XLUtils;

public class Tc_CreateAsset_004 extends BaseClass {
	
   @Test(dataProvider ="DemoFor",priority = 1 )
     public void CreateAssert(String SelectCompany, String AddTag,String Serial,String Model,String Status,String AssetName,String CelenderDate,String Supplier,String OrderNo,String PurchaseCost ,String Warranty,String Note,String DefaultLocation ) throws InterruptedException {
   
	   LoginPage lp=new LoginPage(driver);
	  
		lp.SetUsername(username);
		
		lp.SetPassword(password);
		lp.SetClickLogin();
		Asset_CreateAssetPage page=new Asset_CreateAssetPage(driver);
		page.SetAssets();
		page.Setselectcompany(SelectCompany);
		String r1=randomstring()+"Us-0987";
		page.setAssetTag(r1);
		page.setSeries(Serial);
		page.setSelectModel(Model);
		page.setselectStatus(Status); //"Ready to Deploy"
     //   page.setCheckoutUser("aman@tasolglobal.com");
    //   page.setCheckoutAsset("AssetName");
   //    page.setCheckOutLocation();
      
		page.setAssetName(AssetName);
		page.setCelenderDate(CelenderDate);
		page.setSelectSupplier(Supplier);
		page.setOrderNo(OrderNo);
		page.setPurchaseCost(PurchaseCost);
		page.setWarranty(Warranty);
		page.setNote(Note);
		page.setSelectLocation(DefaultLocation);
		//page.setClickRequestBtn();
		page.setClickSubmit();
		
		String Actulmsg="Success: Asset created successfully. :)";
        String Expectedmsg=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div")).getText();
        System.out.println(Expectedmsg);
        org.testng.Assert.assertTrue(Expectedmsg.contains(Actulmsg));
	
        lp.SetClickLogout();
        
        
            
    	}
   @Test(dataProvider ="DemoFor",priority = 2 )
   public void CreateAssert1(String SelectCompany, String AddTag,String Serial,String Model,String Status,String AssetName,String CelenderDate,String Supplier,String OrderNo,String PurchaseCost ,String Warranty,String Note,String DefaultLocation ) throws InterruptedException {
 
	   LoginPage lp=new LoginPage(driver);
	  
		lp.SetUsername(username);
		
		lp.SetPassword(password);
		lp.SetClickLogin();
		Asset_CreateAssetPage page=new Asset_CreateAssetPage(driver);
		page.SetAssets();
		page.Setselectcompany(SelectCompany);
		String r1=randomstring()+"Us-0987";
		page.setAssetTag(r1);
		page.setSeries(Serial);
		page.setSelectModel(Model);
		page.setselectStatus(Status); //"Ready to Deploy"
   //   page.setCheckoutUser("aman@tasolglobal.com");
  //   page.setCheckoutAsset("AssetName");
 //    page.setCheckOutLocation();
    
		page.setAssetName(AssetName);
		page.setCelenderDate(CelenderDate);
		page.setSelectSupplier(Supplier);
		page.setOrderNo(OrderNo);
		page.setPurchaseCost(PurchaseCost);
		page.setWarranty(Warranty);
		page.setNote(Note);
		page.setSelectLocation(DefaultLocation);
		//page.setClickRequestBtn();
	    page.SetCancelBtn();
        lp.SetClickLogout();
      
      
          
  	}
            @DataProvider(name="DemoFor")
       	 String[][] getData1() throws IOException 
       	{
       		String path=System.getProperty("user.dir")+"/src/test/java/com/sysmatech/TestData/DemoFor.xlsx";
         	int rownum=XLUtils.getRowCount (path, "Sheet1");
       	    int colcount=XLUtils.getCellCount (path, "Sheet1",1);
       	
       	String logindata[][]=new String[rownum][colcount];
       	for(int i=1;i<=rownum;i++)
       	{
       	  for(int j=0;j<colcount;j++) {
       	  logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i,j);//10
       	}
       	
       	}
       	return logindata;
        }

		
	   
	   
	
  
}
