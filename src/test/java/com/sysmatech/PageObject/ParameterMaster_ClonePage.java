package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParameterMaster_ClonePage {
WebDriver ldriver;
	
	public ParameterMaster_ClonePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);	
		
	}
	@FindBy(xpath =  "(//a[@href='#'])[7]")
	WebElement ClickPrevM;
	@FindBy(xpath =  "(//a[normalize-space()='Parameters Master'])[1]")
	WebElement ClickPrevMBtn2;
	@FindBy(xpath="(//i[@class='fa fa-copy'])[2]")
	WebElement CloneBtn;
	@FindBy(xpath = "")
	WebElement ClickSelectAssetModel;
	@FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
	WebElement saveBtn;
	
	public void SetPrevM() throws InterruptedException
	{
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		ClickPrevM.click();
		ClickPrevMBtn2.click();		
		
	}     
	
	public void SetCloneBtn() {
		CloneBtn.click();
	}
	public void SetSaveBtn() {
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,950)", "");
		saveBtn.click();
	}
}
