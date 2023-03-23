package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_SupplierUpdatePage {
	
	WebDriver ldriver;
	
	public Settings_SupplierUpdatePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
	WebElement btnsetting;
	@FindBy(xpath = "(//a[normalize-space()='Suppliers'])[1]")
	WebElement btnSupplier1;
	@FindBy(xpath="(//a[@title='Update'])[1]")
	WebElement btnUpdate;
	@FindBy(xpath="(//input[@id='name'])[1]")
	WebElement TxtName;
	@FindBy(xpath="//input[@id=\"address\"]")
	WebElement txtAddress;
	@FindBy(xpath="(//input[@id='city'])[1]")
	WebElement txtCity;
	@FindBy(xpath="//input[@id=\"state\"]")
	WebElement TxtState;
	
	@FindBy(xpath="(//span[@role='presentation'])[1]")
	WebElement ClickSelectCountry1;
	@FindBy(xpath="(//input[@role='searchbox'])[1]")
	WebElement ClickSelectCountry2;
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li[1]")
	WebElement ClickSelectCountry3;
	
	@FindBy(xpath="(//input[@id='zip'])[1]")
	WebElement Txtzip;
	@FindBy(xpath="(//input[@id='contact'])[1]")
	WebElement TxtContactName;
	@FindBy(xpath="(//input[@id='phone'])[1]")
	WebElement txtPhoneNo;
	@FindBy(xpath="(//input[@id='fax'])[1]")
	WebElement txtFax;
	@FindBy(xpath= "(//input[@id='email'])[1]")
	WebElement TxtEmail;
	@FindBy(xpath="(//textarea[@id='notes'])[1]")
	WebElement TxtNote;
	
	@FindBy(xpath="//button[contains(text(),\"Save\")]")
	WebElement btnSave;
	
	
	
	public void SetSetting() {
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 btnsetting.click();
	}
	public void SetSupplier() {
		btnSupplier1.click();
	}
	public void SetUpdate() {
		btnUpdate.click();
	}
	public void SetName(String name) {
		TxtName.clear();
		TxtName.sendKeys(name);
	}
	public void SetAddress(String add) {
		txtAddress.sendKeys(add);
	}
	public void SetCity(String city) {
		txtCity.clear();
		txtCity.sendKeys(city);
	}
	public void SetState(String state)
	{
		TxtState.clear();
		TxtState.sendKeys(state);
	}
	public void SetCountry(String country) {
		ClickSelectCountry1.click();
		ClickSelectCountry2.sendKeys(country);
		ClickSelectCountry3.click();
	}
	public void SetZip(String zip) {
		Txtzip.clear();
		Txtzip.sendKeys("12345678");
	}
	public void SetContactName(String name) {
		TxtContactName.clear();
		TxtContactName.sendKeys(name);
	}
	public void SetPhoneNo(String No) {
		txtPhoneNo.clear();
		txtPhoneNo.sendKeys(No);
	}
	public void SetFax(String fax) {
		txtFax.clear();
		txtFax.sendKeys(fax);
	}
	public void SetEmail(String email) {
		TxtEmail.clear();
		TxtEmail.sendKeys(email);
	}
	public void SetNote(String note) {
		TxtNote.sendKeys(note);
	}
	public void SetSaveBtn() {
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,850)","");
		btnSave.click();
	}

}
