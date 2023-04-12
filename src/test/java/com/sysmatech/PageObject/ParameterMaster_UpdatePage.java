package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParameterMaster_UpdatePage {
WebDriver ldriver;
	
	public ParameterMaster_UpdatePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);	
		
	}
	@FindBy(xpath =  "(//a[@href='#'])[7]")
	WebElement ClickPrevM;
	@FindBy(xpath =  "(//a[normalize-space()='Parameters Master'])[1]")
	WebElement ClickPrevMBtn2;
	@FindBy(xpath = "(//a[@title='Update'])[2]")
//	@FindBy(xpath = "/html/body/div[1]/div/section[2]/div[3]/div/div/div/div[1]/div[3]/div[2]/table/tbody/tr[1]/td[6]/a[2]")
	WebElement UpdateBtn;
	@FindBy(xpath="(//input[@id='audit_params_name'])[1]")
	WebElement txtAuditCollectionName;
	@FindBy(xpath="(//button[contains(text(),'Save')])[1]")
	WebElement SaveBtn;
	
	public void SetPrevM() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,450)", "");
		ClickPrevM.click();
		ClickPrevMBtn2.click();	
	}   
	public void SetUpdateBtn() {
		UpdateBtn.click();
	}
	public void SetAuditCollectionName(String name) {
		txtAuditCollectionName.clear();
		txtAuditCollectionName.sendKeys(name);
	}
	public void SetSaveBtn() {
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,750)", "");
		SaveBtn.click();
	}
}
