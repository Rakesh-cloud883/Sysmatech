

	package com.sysmatech.TestCases;

	import org.openqa.selenium.By;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	import com.sysmatech.PageObject.LoginPage;
	import com.sysmatech.PageObject.ParameterMaster_DeletePage;
	import com.sysmatech.PageObject.ParameterMaster_UpdatePage;

	public class Tc_ParameterMaster_Delete_044 extends BaseClass {
		@Test()
		public void PMDelete() throws InterruptedException {
			  LoginPage lp=new LoginPage(driver);  
		  		lp.SetUsername(username);	
		  		lp.SetPassword(password);
		  		lp.SetClickLogin();
		  		
		 ParameterMaster_DeletePage page= new ParameterMaster_DeletePage(driver);
		 page.SetPrevM();
		 page.SetDelete();
		 String ActualTitle="Success: AuditParamsMaster successfully Delete";
		 String ExpectedTitle=driver.findElement(By.xpath("(//div[@class='alert alert-success fade in'])[1]")).getText();
		 System.out.println(ExpectedTitle);
		 Assert.assertTrue(ExpectedTitle.contains(ActualTitle));
		}
}
