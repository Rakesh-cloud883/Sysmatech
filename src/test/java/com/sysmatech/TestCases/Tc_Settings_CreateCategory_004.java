package com.sysmatech.TestCases;

import java.io.IOException;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_AddCategoryPage;
import com.sysmatech.utilities.XLUtils;



public class Tc_Settings_CreateCategory_004 extends BaseClass {

	
	@org.testng.annotations.Test(dataProvider = "LoginData12")
	public void CreateCatogory(String CategoryName ) throws InterruptedException {  //, String CompanyName
		  LoginPage lp=new LoginPage(driver);
			lp.SetUsername(username);
			lp.SetPassword(password);
			lp.SetClickLogin();
			Settings_AddCategoryPage cp= new Settings_AddCategoryPage(driver);
			cp.SetSetting();
			String r2=randomstring();    //"AutomationCategory"
	//		cp.SetCategoryName(r2); //  duplicate
			cp.SetCategoryName(CategoryName+r2);
		//	cp.SetSelectCompany(CompanyName);
			
			cp.SetSelectType("Asset");
			cp.SetConfiAssetCategoryClick();
			cp.SetEamilCiCO();
			cp.SetSaveCategory();
			String Actulmsg="Success: Category created successfully.";
	        String Expectedmsg=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div")).getText();
	        System.out.println(Expectedmsg);
	        org.testng.Assert.assertTrue(Expectedmsg.contains(Actulmsg));
	        lp.SetClickLogout();
		
	}
//	@org.testng.annotations.Test(dataProvider = "LoginData5", priority = 2)
//	public void CreateCatogory1(String CategoryName , String CompanyName) throws InterruptedException {
//		  LoginPage lp=new LoginPage(driver);
//			lp.SetUsername(username);
//			lp.SetPassword(password);
//			lp.SetClickLogin();
//			Settings_AddCategoryPage cp= new Settings_AddCategoryPage(driver);
//			cp.SetSetting();
//			String r2=randomstring()+"rakesh1234";
//			cp.SetCategoryName(r2); //  duplicate
//	//		cp.SetCategoryName(CategoryName);
//			cp.SetSelectCompany(CompanyName);
//			
//			cp.SetSelectType("Asset");
//		    cp.SetCancelCategory();
//		    lp.SetClickLogout();
//	      
//		
//	}
	
	
    @DataProvider(name="LoginData12")
 	 String[][] getData1() throws IOException 
 	{
 		String path=System.getProperty("user.dir")+"/src/test/java/com/sysmatech/TestData/LoginData12.xlsx";
   	int rownum=XLUtils.getRowCount (path, "Sheet2");
 	    int colcount=XLUtils.getCellCount (path, "Sheet2",1);
 	
 	String logindata[][]=new String[rownum][colcount];
 	for(int i=1;i<=rownum;i++)
 	{
 	  for(int j=0;j<colcount;j++) {
 	  logindata[i-1][j]=XLUtils.getCellData(path, "Sheet2", i,j);//10
 	}
 	
 	}
 	return logindata;
  }


}
