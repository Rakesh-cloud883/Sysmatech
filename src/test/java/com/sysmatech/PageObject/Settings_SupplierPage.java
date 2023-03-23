package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_SupplierPage {
	WebDriver ldriver;
	
	public Settings_SupplierPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
	WebElement btnsetting;
	@FindBy(xpath = "(//a[normalize-space()='Suppliers'])[1]")
	WebElement btnSupplier1;
	@FindBy(xpath = "(//a[@class='btn btn-primary pull-right'])[1]")
	WebElement BtnCreateNew;
	
	@FindBy(xpath = "//input[@id=\"name\"]")
	WebElement TxtSupplierName;
	@FindBy(xpath = "//input[@id=\"address\"]")
	WebElement TxtAddress1;
	@FindBy(xpath = "//input[@id=\"city\"]")
	WebElement TxtCity;
	@FindBy(xpath = "//input[@id=\"state\"]")
	WebElement TxtState;
	
	@FindBy(xpath = "(//span[@role='presentation'])[1]")
	WebElement ClickSelectCountry1;
	@FindBy(xpath = "(//input[@role='searchbox'])[1]")
	WebElement ClickSelectCountry2;
	@FindBy(xpath = "/html/body/span/span/span[2]/ul/li[1]")
	WebElement ClickSelectCountry3;
	
	@FindBy(xpath = "//input[@id=\"zip\"]")
	WebElement TxtZipCode;
	@FindBy(xpath = "//input[@id=\"contact\"]")
	WebElement TxtContactName;
	@FindBy(xpath = "//input[@id=\"phone\"]")
	WebElement TxtPhoneNo;
	@FindBy(xpath = "//input[@id=\"fax\"]")
	WebElement TxtFax;
	@FindBy(xpath = "//input[@id=\"email\"]")
	WebElement TxtEmail;
	@FindBy(xpath = "(//textarea[@id='notes'])[1]")
	WebElement TxtNote;
	@FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
	WebElement BtnSave;
	
	public void SetSetting() {
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,350)", "");
		btnsetting.click();
	}
	public void SetSupplierBtn() 
	{
	btnSupplier1.click();
	}
	public void SetCreateNew() {
		BtnCreateNew.click();
		
	}
	public void SetSupplier(String name) {
		TxtSupplierName.sendKeys(name);
	}
	public void SetAddress(String Add) {
		TxtAddress1.sendKeys(Add);
	}
	public void SetCity(String city) {
		TxtCity.sendKeys(city);
	}
	public void SetState(String state) {
		TxtState.sendKeys(state);
	}
	public void SetCountry(String Csearch) {
		ClickSelectCountry1.click();
		ClickSelectCountry2.sendKeys(Csearch);
		ClickSelectCountry3.click();
	}
	public void SetZip(String zip) {
		TxtZipCode.sendKeys(zip);
	}
	public void SetContactName(String Cname) {
		TxtContactName.sendKeys(Cname);
	}
	public void SetPhoneNo(String No) {
		TxtPhoneNo.sendKeys(No);
	}
	public void SetFax(String fax) {
		TxtFax.sendKeys(fax);
	}
	public void SetEmail(String email) {
		TxtEmail.sendKeys(email);
	}
	public void SetNote(String note) {
		TxtNote.sendKeys(note);
	}
	public void SetSaveBtn() {
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,350)", "");
		BtnSave.click();
		
	}

	}
	
	
	
	