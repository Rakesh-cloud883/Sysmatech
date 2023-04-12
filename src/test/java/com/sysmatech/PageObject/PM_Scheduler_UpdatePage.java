package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PM_Scheduler_UpdatePage {
WebDriver ldriver;
	
	public PM_Scheduler_UpdatePage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);	
		
	}
	@FindBy(xpath =  "(//a[@href='#'])[7]")
	WebElement ClickPrevM;
	@FindBy(xpath="//a[normalize-space()=\"Scheduler\"]")
	WebElement ClickScheduler;
	@FindBy(xpath = "(//input[@type='search'])[1]")
	WebElement BtnSearch;
	@FindBy(xpath = "(//a[@title='Update'])[1]")
	WebElement UpdateBtn;
	@FindBy(xpath = "(//input[@id='name'])[1]")
	WebElement TxtName;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
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
	public void SetSearchBtn(String search) {
	BtnSearch.sendKeys(search);
	}
	public void SetUpdateBtn() throws InterruptedException {
		Thread.sleep(2000);
		UpdateBtn.click();
	}
	public void SetName(String name) {
		TxtName.clear();
		TxtName.sendKeys(name);
	}
	public void SetSaveBtn() {
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,950)", "");
		SaveBtn.click();
	}
}
