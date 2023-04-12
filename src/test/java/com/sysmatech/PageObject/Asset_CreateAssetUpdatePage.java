package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Asset_CreateAssetUpdatePage {
	
WebDriver ldriver;
	
	public Asset_CreateAssetUpdatePage(WebDriver rdriver){
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
	@FindBy(xpath =  "(//a[@class='btn btn-sm btn-warning' or @title='Update'])[1]")  //(//a[@title='Update'])[1]
	WebElement btnUpdate;
	@FindBy(id =  "purchase_cost") ////input[@id=\"purchase_cost\"]
	WebElement txtPurchaseCostUpdate;
	@FindBy(xpath = "(//button[@class='btn btn-primary' or @fdprocessedid=\"894l0t\"])[1]")  //(//i[@class='fa fa-check icon-white'])[2]
	WebElement BtnSave;
	@FindBy(xpath =  "//div[@class=\"col-md-3 text-right\"]//a[@class=\"btn btn-link text-left\"][normalize-space()=\"Cancel\"]")
	WebElement BtnCancel;


	
	public void SetAssetbtn() throws InterruptedException {
		btnAssert.click();
		btnAssertList.click();
	}

	public void SetSearchBtn(String sname) throws InterruptedException { 
	    
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(150,0)", "");
		 btnSearch.clear();
		 Thread.sleep(2000);
		 btnSearch.sendKeys(sname);
		 
		
		
	}
	public void SetUpdateBtn() throws InterruptedException {
		Thread.sleep(4000);
		btnUpdate.click();
	}
	public void SetPurchaseCost(String Pvalue) {
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,450)", "");
		 txtPurchaseCostUpdate.clear();
		 txtPurchaseCostUpdate.sendKeys(Pvalue);
	}
	public void SetSaveButton() throws InterruptedException{
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,850)", "");
		BtnSave.click();
		
	}
	public void SetCancelButton(){
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,850)", "");
		 BtnCancel.click();
		
	}
	
	


}
