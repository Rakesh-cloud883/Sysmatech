package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PM_Scheduler_ClonePage {
WebDriver ldriver;
	
	public PM_Scheduler_ClonePage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);	
		
	}
	@FindBy(xpath =  "(//a[@href='#'])[7]")
	WebElement ClickPrevM;
	@FindBy(xpath="//a[normalize-space()=\"Scheduler\"]")
	WebElement ClickScheduler;
	@FindBy(xpath = "(//a[@title='Clone Item'])[2]")
	WebElement CloneBtn;
//	@FindBy(xpath = "(//option[@value='507'])[1]")
//	WebElement ClickSelectAssetModel;
	@FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
	WebElement SaveBtn;
	
	public void SetPrevM() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		ClickPrevM.click();
			
	}
	public void SetSchedulerBtn()
	{
		ClickScheduler.click();
	}   
//	public void SetAssetModel() {
//		ClickSelectAssetModel.click();
//	}
	public void SetCloneBtn() {
		
		CloneBtn.click();
	}
	public void SetSaveBtn() {
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,950)", "");
		SaveBtn.click();
		
	}
}
