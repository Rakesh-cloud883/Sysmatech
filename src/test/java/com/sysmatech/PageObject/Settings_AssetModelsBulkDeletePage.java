package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_AssetModelsBulkDeletePage {
	WebDriver ldriver;
	
	 public Settings_AssetModelsBulkDeletePage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 @FindBy(xpath = "(//a[@class='sidebar-toggle btn btn-white'])[1]")
	    WebElement BtnMenu;
	 @FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
		WebElement btnsetting;
	 @FindBy(xpath =  "(//a[normalize-space()='Asset Models'])[1]")
		WebElement btnAssetModels;
	 @FindBy(xpath = "(//input[@type='search'])[1]")
	 WebElement BtnSearch;
	 @FindBy(xpath =  "(//input[@name='btSelectItem'])[1]")
		WebElement ClickSelectItem1;
	 @FindBy(xpath =  "(//input[@name='btSelectItem'])[2]")
		WebElement ClickSelectItem2;
	 
	 @FindBy(xpath =  "(//span[@role='presentation'])[1]")
		WebElement ClickSelectBulkEdit1;
	 @FindBy(xpath =  "(//input[@role='searchbox'])[1]")
		WebElement ClickSelectBulkEdit2;
	 @FindBy(xpath =  "/html/body/span/span/span[2]/ul/li")
		WebElement ClickSelectBulkEdit3;
	 @FindBy(xpath =  "(//button[normalize-space()='Go'])[1]")
		WebElement BtnGo;
	 @FindBy(xpath =  "(//button[normalize-space()='Delete'])[1]")
		WebElement BtnDelete;
	 
	 
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
	 public void SetSearchBtn(String search) throws InterruptedException {
		 BtnSearch.clear();
		 Thread.sleep(3000);
		 BtnSearch.sendKeys(search);
	 }
	 public void SetBulkDelete(String Delete) throws InterruptedException {
		 Thread.sleep(3000);
		 ClickSelectItem1.click();
	//	 ClickSelectItem2.click();
		 ClickSelectBulkEdit1.click();
		 ClickSelectBulkEdit2.sendKeys(Delete);
		 ClickSelectBulkEdit3.click();
	 }
	 public void SetGoBtn() {
		 BtnGo.click();
	 }
	 public void SetDeleteBtn() throws InterruptedException {
		 Thread.sleep(1000);
		 BtnDelete.click();
	 }
	 
	 
}
