package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_AssetModelsViewDeletePage {
	WebDriver ldriver;
	
	 public Settings_AssetModelsViewDeletePage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 @FindBy(xpath = "(//a[@class='sidebar-toggle btn btn-white'])[1]")
	    WebElement BtnMenu;
	 @FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
		WebElement btnsetting;
	 @FindBy(xpath =  "(//a[normalize-space()='Asset Models'])[1]")
		WebElement btnAssetModels;
	 @FindBy(xpath =  "(//a[normalize-space()='View Deleted'])[1]")
		WebElement btnViewDelete;
	 @FindBy(xpath = "(//input[@type='search'])[1]")
	 WebElement Btnsearch;
	 @FindBy(xpath="(//button[@class='btn btn-sm btn-warning' or @title='Restore'])[1]")  //(//button[@title='Restore'])[1]
	  WebElement BtnRestore;
	 @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm delete-asset' or @data-title='Delete'])[1]")  //(//a[@class='btn btn-danger btn-sm delete-asset'])[1]
	 WebElement BtnDelete;
	 @FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	 WebElement BtnYesDelete;
	
	 public void SetMenuBtn() {
		  BtnMenu.click();                                         
	  }
	 public void SetSetting() {
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 btnsetting.click();                                                                                                	 
	 }
	 public void SetAssetModelsBtn() {
		 btnAssetModels.click();
	 }
	 public void   SetViewDelete() {
		 btnViewDelete.click();
		 
	 }
	 public void SetSearchBtn(String search) throws InterruptedException {
		Btnsearch.clear();
		 Thread.sleep(3000);
		 Btnsearch.sendKeys(search);
	 }
	 public void SetRestore() throws InterruptedException {
		 Thread.sleep(3000);
		 BtnRestore.click();
	 }
	 public void SetDeleteBtn() throws InterruptedException {
		 Thread.sleep(3000);
		 BtnDelete.click();
		 
	 }
	public void SetYesDeleteBtn() {
		BtnYesDelete.click();
	}
	 
	 
}
