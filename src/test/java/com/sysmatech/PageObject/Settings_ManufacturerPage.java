package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_ManufacturerPage {

	WebDriver ldriver;
	
	 public Settings_ManufacturerPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 @FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
		WebElement btnsetting;
	 @FindBy(xpath = "//a[normalize-space()=\"Manufacturers\"]")
	 WebElement BtnManufacturer;
	 @FindBy(xpath = "(//a[@class='btn btn-primary pull-right'])[1]") 
	 WebElement BtnCreateNew;
	 @FindBy(xpath = "(//input[@id='name'])[1]")
	 WebElement TxtName;
	 @FindBy(xpath="(//input[@id='support_phone'])[1]")
	 WebElement TxtNoSupport;
	 @FindBy(xpath="(//input[@id='support_email'])[1]")
	 WebElement TxtEmailSupport;
	 @FindBy(xpath="(//button[contains(text(),'Save')])[1]")
	 WebElement btnSave;
	
	 
	 public void SetSettingBtn() {
		 JavascriptExecutor js=(JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 btnsetting.click();
	 }
	 public void SetManufacturerBtn() {
		 BtnManufacturer.click();
	 }
	 public void SetCreateNewBtn() {
		 BtnCreateNew.click();
	 }
	public void SetName(String name) {
		TxtName.sendKeys(name);
	}
	public void SetSupportNo(String NSupp) {
		TxtNoSupport.sendKeys(NSupp);
	}
	public void SetEmailSupport(String ESupp) {
		TxtEmailSupport.sendKeys(ESupp);
	}
	public void SetSaveBtn(){
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,350)", "");
		btnSave.click();
	}
}
