package com.sysmatech.PageObject;

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
	@FindBy(xpath="/html/body/div[1]/header/nav/div[2]/ul/li[9]/a")
	WebElement Clickbtn;

	@FindBy(xpath="/html/body/div[1]/header/nav/div[2]/ul/li[9]/ul/li[8]/a")
	WebElement btnLogout;
	
	public void SetUsername(String uname) throws InterruptedException
	{
		txtUserName.sendKeys(uname);
		Thread.sleep(1000);
		
	}
	public void SetPassword(String pwd) throws InterruptedException
	{
		txtPassword.sendKeys(pwd);
		Thread.sleep(1000);
		
	}
	public void SetClickLogin() throws InterruptedException {
	
		btnLogin.click();
		Thread.sleep(1000);
	}
	
	public void SetClickLogout() throws InterruptedException {
		Clickbtn.click();
		btnLogout.click();
		
	}

	

}
