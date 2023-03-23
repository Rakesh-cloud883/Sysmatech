package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Asset_CreateAssetCopyPage {

WebDriver ldriver;
	
	public Asset_CreateAssetCopyPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath =  "/html[1]/body[1]/div[1]/aside[1]/section[1]/ul[1]/li[4]")
	WebElement btnAssert;
	@FindBy(xpath =  "(//a[normalize-space()='List All'])[1]")
	WebElement btnAssertList;
	
	@FindBy(xpath =  "//span[@class='select2-selection__rendered needsclick'][contains(@id,'actions-84-container')][contains(.,'Edit')]")
	WebElement ClickEdit1;
	@FindBy(xpath =  "//input[@role=\"searchbox\"]")
	WebElement txtEdit2;
	@FindBy(xpath =  "#select2-bulk_actions-f4-result-iodo-edit")
	WebElement ClickEdit3;
	
	@FindBy(xpath =  "//input[@placeholder=\"Search\"]")
	WebElement btnSearch;
	@FindBy(xpath =  "(//a[@title='Clone Item'])[1]")
	WebElement btnCopy;
	@FindBy(xpath =  "//button[contains(text(),\"Save\")]")
	WebElement btnSave;
	@FindBy(xpath =  "(//a[@class='btn btn-link text-left'][normalize-space()='Cancel'])[2]")
	WebElement btnCancel;
	
	
	public void SetAssetbtn() throws InterruptedException {
		
		btnAssert.click();
		btnAssertList.click();
		
	
	}

	public void SetSearchBtn() throws InterruptedException { 
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(850,0)", "");
		 Thread.sleep(3000);
		 btnCopy.click();
	}
	public void SetSave()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,850)", "");
		 btnSave.click();
	}
	public void SetCancelBtn()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,850)", "");
		 btnCancel.click();
	}
	
}
