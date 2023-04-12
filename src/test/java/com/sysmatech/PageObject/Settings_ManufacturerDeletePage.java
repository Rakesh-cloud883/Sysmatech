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
@FindBy(xpath = "(//input[@type='search'])[1]")
WebElement btnSearch;
//@FindBy(xpath="//body[1]/div[1]/div[1]/section[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[1]/td[11]/nobr[1]/a[2]")
@FindBy(xpath = "//a[contains(@class,'btn btn-danger btn-sm delete-asset')]")
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
public void SetSearchBtn(String search) throws InterruptedException {
	btnSearch.clear();
	Thread.sleep(3000);
	btnSearch.sendKeys(search);
}
public void SetDelete() throws InterruptedException {
   Thread.sleep(3000);
	BtnDelete.click();
    
}
public void SetYesDelete() {
	BtnDeleteYes.click();
 }
}
