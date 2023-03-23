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
	 @FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
		WebElement btnsetting;
	 @FindBy(xpath =  "(//a[normalize-space()='Asset Models'])[1]")
		WebElement btnAssetModels;
	 @FindBy(xpath ="(//a[@title='Update'])[1]")
	 WebElement BtnUpdate;
	 @FindBy(xpath ="(//input[@id='name'])[1]")
	 WebElement BtnName;
	 @FindBy(xpath ="//button[contains(text(),\"Save\")]")
	 WebElement BtnSave;
	 public void SetSetting() {
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 btnsetting.click();                                                                                                	 
	 }
	 public void SetAssetModelsBtn() {
		 btnAssetModels.click();
	 }
	 public void SetUpdateBtn() {
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
