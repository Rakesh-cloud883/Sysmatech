package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_AssetModelsUpdatePage {
	WebDriver ldriver;
	
	 public Settings_AssetModelsUpdatePage(WebDriver rdriver){
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
	 WebElement btnSearch;
	 @FindBy(xpath ="(//a[@class='btn btn-sm btn-warning' or @title='Update'])[1]")   //(//a[@title='Update'])[1]
	 WebElement BtnUpdate;
	 @FindBy(id ="name")     //(//input[@id='name'])[1]
	 WebElement BtnName;
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
	 public void SetSearch(String search) throws InterruptedException {
		 btnSearch.clear();
		 Thread.sleep(2000);
		 btnSearch.sendKeys(search);
	 }
	 public void SetUpdateBtn() throws InterruptedException {
		 Thread.sleep(3000);
		BtnUpdate.click(); 
	 }
	 public void SetName(String name) {
		 BtnName.clear();
		 BtnName.sendKeys(name);
	 }
	 public void SetSaveBtn() {
		 JavascriptExecutor js=(JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		BtnSave.click(); 
	 }
	 
}
