package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_AssetModelsClonePage {
	WebDriver ldriver;
	
	 public Settings_AssetModelsClonePage(WebDriver rdriver){
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
	 @FindBy(xpath ="(//a[@title='Clone Item'])[1]")
	 WebElement BtnClone;
	 @FindBy(xpath ="(//input[@id='name'])[1]")
	 WebElement TxtName;
	 @FindBy(xpath ="//button[contains(text(),\"Save\")]")
	 WebElement BtnSave;
	 
	
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
	 public void SetCloneBtn() throws InterruptedException {
		 Thread.sleep(4000);
		BtnClone.click(); 
	 }
	
	 public void SetName(String name) {
		 TxtName.clear();
		 TxtName.sendKeys(name);
	 }
     public void SetSaveBtn() {
    	 JavascriptExecutor js=(JavascriptExecutor)ldriver;
    	 js.executeScript("window.scrollBy(0,350)", "");
    	 BtnSave.click();
		 
	 }
}
