package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Asset_CreateAssetDeletePage {
	
WebDriver ldriver;
	
	public Asset_CreateAssetDeletePage(WebDriver rdriver){
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
	@FindBy(xpath =  "(//a[@class='btn btn-danger btn-sm delete-asset' or @onclick=\"return false\"])[1]")   // (//a[@class='btn btn-danger btn-sm delete-asset'])[1]
	WebElement btnDelete;
	@FindBy(id =  "dataConfirmOK")    ////*[@id=\"dataConfirmOK\"]
	WebElement ClickDeleteYesBtn;
	@FindBy(xpath =  "//*[@id=\"dataConfirmOK\"]")
	WebElement ClickDeleteCancelBtn;
	
	
	
	public void SetAssetbtn() throws InterruptedException {

		
		btnAssert.click();
		btnAssertList.click();
		
	
	}

	public void SetSearchBtn(String sname) throws InterruptedException { 
	
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(150,0)", "");
	    btnSearch.clear();
		 Thread.sleep(3000);
		btnSearch.sendKeys(sname);
		 
	}
	public void SetDeleteBtn() throws InterruptedException {
		Thread.sleep(4000);
		 btnDelete.click();
	}
	public void SetConfDeleteBtn() {
		ClickDeleteYesBtn.click();
	}
	public void SetConfCancelBtn() {
		ClickDeleteCancelBtn.click();
	}



}
