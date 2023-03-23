package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_ManufacturerViewDeletePage {
	WebDriver ldriver;
	public Settings_ManufacturerViewDeletePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
	WebElement btnsetting;
	@FindBy(xpath = "//a[normalize-space()=\"Manufacturers\"]")
	WebElement BtnManufacturer;
	@FindBy(xpath="//a[normalize-space()=\"Show Deleted\"]")
	WebElement BtnViewDelete;
	@FindBy(xpath="(//a[@class='btn btn-danger btn-sm delete-asset'])[1]")
	WebElement btnDelete;
	@FindBy(xpath="//button[@id=\"dataConfirmOK\"]")
	WebElement BtnViewDeleteYes;
	@FindBy(xpath="(//button[@title='Restore'])[1]")
	WebElement BtnRestore;
	public void SetSettingBtn() {
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,350)", "");
		btnsetting.click();
	}
	public void SetManufacturerBtn() {
		BtnManufacturer.click();
	}
	public void setViewDelete() {
		 BtnViewDelete.click();
	}
	public void SetDelete() {
       
		btnDelete.click();
		BtnViewDeleteYes.click();
	}
	
	public void SetRestore() {
		BtnRestore.click();
	}
}
