package com.sysmatech.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.Settings_AddCompanyPage;
import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.utilities.XLUtils;

public class Tc_Settings_AddCompanyTest_003 extends BaseClass  {
	
	
	@Test(dataProvider = "LoginData3",priority = 1)
	public void CreateCompany(String company) throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.SetUsername(username);
		lp.SetPassword(password);
		lp.SetClickLogin();

		Settings_AddCompanyPage add=new Settings_AddCompanyPage(driver);
		add.SetSetting();
		String r1=randomstring()+"rakesh";
		add.setCreateCompany(r1);
	//	add.setCreateCompany(company);
		add.SetSaveBtn();
		String Actulmsg="Success: Company created successfully.";
        String Expectedmsg=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div")).getText();
        System.out.println(Expectedmsg);
        org.testng.Assert.assertTrue(Expectedmsg.contains(Actulmsg));
        lp.SetClickLogout();
        
	}
	@Test(dataProvider = "LoginData3",priority = 2)
	public void CreateCompany1(String company) throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.SetUsername(username);
		lp.SetPassword(password);
		lp.SetClickLogin();

		Settings_AddCompanyPage add=new Settings_AddCompanyPage(driver);
		add.SetSetting();
		String r1=randomstring()+"rakesh";
		add.setCreateCompany(r1);
	//	add.setCreateCompany(company);
		add.SetCancelBtn();
        lp.SetClickLogout();
        
	}
        @DataProvider(name="LoginData3")
   	 String[][] getData1() throws IOException 
   	{
   		String path=System.getProperty("user.dir")+"/src/test/java/com/sysmatech/TestData/LoginData3.xlsx";
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
