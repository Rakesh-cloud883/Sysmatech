package com.sysmatech.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sysmatech.PageObject.LoginPage;
import com.sysmatech.PageObject.Settings_WorkOrder_StatusesDeletePage;
import com.sysmatech.PageObject.Settings_WorkOrder_StatusesUpdatePage;

public class Tc_Settings_WorkOrder_StatusesDelete_022 extends BaseClass {
	@Test()
	public void WorkOrderStatuDelete() throws InterruptedException {
		  LoginPage lp=new LoginPage(driver);  
			lp.SetUsername(username);	
			lp.SetPassword(password);
			lp.SetClickLogin();
			Settings_WorkOrder_StatusesDeletePage page=new Settings_WorkOrder_StatusesDeletePage(driver);
			page.SetMenuBtn();
			page.SetSetting();
			page.SetWorkOrderStatus();
			page.SetSearchBtn("Automationstatus");
			page.SetDeleteBtn();
			page.SetDeleteYesBtn();
			
//			String ActualTitle="Success: Status deleted successfully.";
//			String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
//			System.out.println(ExpectedTitle);
//			Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
	}

}
