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
	 @FindBy(xpath = "(//input[@type='search'])[1]")
	 WebElement BtnSearch;
//	@FindBy(xpath="(//a[@title='Update'])[2]")
//	@FindBy(xpath = "/html/body/div[1]/div/section[2]/div[2]/div/div/div/div/div/div[1]/div[3]/div[2]/table/tbody/tr[1]/td[11]/nobr/a[1]")
     @FindBy(xpath = "//a[contains(@class,'btn btn-sm btn-warning')][1]")
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
	public void SetSearchBtn(String search) throws InterruptedException {
		BtnSearch.clear();
		Thread.sleep(3000);
		BtnSearch.sendKeys(search);
	}
	public void SetUpdate() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(150,0)", "");
		Thread.sleep(3000);
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
