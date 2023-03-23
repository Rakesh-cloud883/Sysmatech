package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_ManufacturerDeletePage {
WebDriver ldriver;
public Settings_ManufacturerDeletePage(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}
@FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
WebElement btnsetting;
@FindBy(xpath = "//a[normalize-space()=\"Manufacturers\"]")
WebElement BtnManufacturer;
@FindBy(xpath="(//a[@class='btn btn-danger btn-sm delete-asset'])[1]")
WebElement BtnDelete;
@FindBy(xpath="(//button[normalize-space()='Yes'])[1]")
WebElement BtnDeleteYes;


public void SetSettingBtn() {
	JavascriptExecutor js=(JavascriptExecutor)ldriver;
	js.executeScript("window.scrollBy(0,350)", "");
	btnsetting.click();
}
public void SetManufacturerBtn() {
	BtnManufacturer.click();
}
public void SetDelete() {

	BtnDelete.click();
    BtnDeleteYes.click();
}
}
