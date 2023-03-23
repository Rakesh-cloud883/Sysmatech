package com.sysmatech.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.utilities.XLUtils;

public class Tc_LoginDDT_002 extends BaseClass {

	@Test(dataProvider = "LoginData2")
	public void loginDDT(String user,String pwd) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.SetUsername(user);
		lp.SetPassword(pwd);
		lp.SetClickLogin();
		lp.SetClickLogout();
	}
	@DataProvider(name="LoginData2")
	 String[][] getData() throws IOException 
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/sysmatech/TestData/LoginData2.xlsx";
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
