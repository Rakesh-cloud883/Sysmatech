package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_ManufacturerUpdatePage {

	WebDriver ldriver;
	
	public Settings_ManufacturerUpdatePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 @FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
		WebElement btnsetting;
	 @FindBy(xpath = "//a[normalize-space()=\"Manufacturers\"]")
	 WebElement BtnManufacturer;
	@FindBy(xpath="(//a[@title='Update'])[1]")
	WebElement BtnUpdate;
	@FindBy(xpath="(//input[@id='name'])[1]")
	WebElement TxtName;
	@FindBy(xpath="//button[contains(text(),\"Save\")]")
	WebElement btnSave;
	public void SetSettingBtn() {
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,350)", "");
		btnsetting.click();
	}
	public void SetManufacturerBtn() {
		BtnManufacturer.click();
	}
	public void SetUpdate() {
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(150,0)", "");
		BtnUpdate.click();
	}
	public void SetName(String name) {
		TxtName.clear();
		TxtName.sendKeys(name);
	}
	public void SetSaveBtn() {
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,350)", "");
		btnSave.click();
	}
}
