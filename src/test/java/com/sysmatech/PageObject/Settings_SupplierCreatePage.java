package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_SupplierCreatePage {
	WebDriver ldriver;
	
	public Settings_SupplierCreatePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
	WebElement btnsetting;
	@FindBy(xpath = "(//a[normalize-space()='Suppliers'])[1]")
	WebElement btnSupplier1;
	@FindBy(xpath = "//a[contains(@href,'https://qa.sysmatech.com/public/suppliers/create')]")
	WebElement BtnCreateNew;
	
	@FindBy(id = "name")
	WebElement TxtSupplierName;
	@FindBy(id = "address")
	WebElement TxtAddress1;
	@FindBy(id = "city")
	WebElement TxtCity;
	@FindBy(id = "state")
	WebElement TxtState;
	
	@FindBy(xpath = "(//span[@role='presentation'])[1]")
	WebElement ClickSelectCountry1;
	@FindBy(xpath = "(//input[@role='searchbox'])[1]")
	WebElement ClickSelectCountry2;
	@FindBy(xpath = "/html/body/span/span/span[2]/ul")
	WebElement ClickSelectCountry3;
	
	@FindBy(id = "zip")
	WebElement TxtZipCode;
	@FindBy(id = "contact")
	WebElement TxtContactName;
	@FindBy(id = "phone")
	WebElement TxtPhoneNo;
	@FindBy(id = "fax")
	WebElement TxtFax;
	@FindBy(id = "email")
	WebElement TxtEmail;
	@FindBy(id = "notes")
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
		TxtSupplierName.clear();
		TxtSupplierName.sendKeys(name);
	}
	public void SetAddress(String Add) {
		TxtAddress1.clear();
		TxtAddress1.sendKeys(Add);
	}
	public void SetCity(String city) {
		TxtCity.clear();
		TxtCity.sendKeys(city);
	}
	public void SetState(String state) {
		TxtState.clear();
		TxtState.sendKeys(state);
	}
	public void SetCountry(String Csearch) {
		ClickSelectCountry1.click();
		ClickSelectCountry2.sendKeys(Csearch);
		ClickSelectCountry3.click();
	}
	public void SetZip(String zip) {
		TxtZipCode.clear();
		TxtZipCode.sendKeys(zip);
	}
	public void SetContactName(String Cname) {
		TxtContactName.clear();
		TxtContactName.sendKeys(Cname);
	}
	public void SetPhoneNo(String No) {
		TxtPhoneNo.clear();
		TxtPhoneNo.sendKeys(No);
	}
	public void SetFax(String fax) {
		TxtFax.clear();
		TxtFax.sendKeys(fax);
	}
	public void SetEmail(String email) {
		TxtEmail.clear();
		TxtEmail.sendKeys(email);
	}
	public void SetNote(String note) {
		TxtNote.clear();
		TxtNote.sendKeys(note);
	}
	public void SetSaveBtn() {
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,750)", "");
		BtnSave.click();
		
	}

	}
	
	
	
	