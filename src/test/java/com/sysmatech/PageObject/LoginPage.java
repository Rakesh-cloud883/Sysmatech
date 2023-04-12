package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id = "username")
	WebElement txtUserName;
	@FindBy(id = "password")
	WebElement txtPassword;
	@FindBy(xpath = "//button[text()='Login']")
	WebElement btnLogin;
	@FindBy(xpath="//span[@class=\"hidden-xs\"]")  ///html/body/div[1]/header/nav/div[2]/ul/li[9]/a
	WebElement Clickbtn;

	@FindBy(partialLinkText ="Logout")  ///html/body/div[1]/header/nav/div[2]/ul/li[9]/ul/li[8]/a
	WebElement btnLogout;
	
	public void SetUsername(String uname) throws InterruptedException
	{
		txtUserName.clear();
		txtUserName.sendKeys(uname);
		Thread.sleep(1000);
		
	}
	public void SetPassword(String pwd) throws InterruptedException
	{
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
		Thread.sleep(1000);
		
	}
	public void SetClickLogin() throws InterruptedException {
		Thread.sleep(1000);
		btnLogin.click();
//		JavascriptExecutor js=(JavascriptExecutor)ldriver;
//		js.executeScript("document.body.style.zoom=0.8");
		
	}
	
	public void SetClickLogout() throws InterruptedException {
		Clickbtn.click();
		btnLogout.click();
		
	}

	

}
