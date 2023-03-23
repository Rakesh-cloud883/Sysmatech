package com.sysmatech.PageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParameterMaster_DeletePage {
	
WebDriver ldriver;
	
	public ParameterMaster_DeletePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);	
		
	}
	@FindBy(xpath =  "(//a[@href='#'])[7]")
	WebElement ClickPrevM;
	@FindBy(xpath =  "(//a[normalize-space()='Parameters Master'])[1]")
	WebElement ClickPrevMBtn2;
	@FindBy(xpath="/html/body/div[1]/div/section[2]/div[3]/div/div/div/div[1]/div[3]/div[2]/table/tbody/tr[1]/td[6]/a[3]")
	WebElement Deletebtn;
	
	
	public void SetPrevM() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,450)", "");
		ClickPrevM.click();
		ClickPrevMBtn2.click();	
	}   
	
	public void SetDelete() {
		Deletebtn.click();
		Alert alert=ldriver.switchTo().alert();
		alert.accept();
	}

}
