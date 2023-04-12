package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_SupplierDeletePage {

	WebDriver ldriver;
	public Settings_SupplierDeletePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
	WebElement btnsetting;
	@FindBy(xpath = "(//a[normalize-space()='Suppliers'])[1]")
	WebElement btnSupplier1;
	@FindBy(xpath = "(//input[@type='search'])[1]")
	WebElement BtnSearch;
//	@FindBy(xpath="//*[@id=\"suppliersTable\"]/tbody/tr[1]/td[9]/nobr/a[2]")
	@FindBy(xpath = "//a[@class='btn btn-danger btn-sm delete-asset' or @onclick='return false']")  //(//a[@class='btn btn-danger btn-sm delete-asset'])[1]
	WebElement BtnDelete;
	@FindBy(xpath="//button[@id=\"dataConfirmOK\"]")
	WebElement BtnDeleteYes;
	
	public void SetSetting() {
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 btnsetting.click();	 
		
		
	}
	public void SetSupplier() {
		btnSupplier1.click();
	}
	public void SetSearchBtn(String search) throws InterruptedException {
		BtnSearch.clear();
		Thread.sleep(3000);
		BtnSearch.sendKeys(search);
	}
	public void SetDeleteBtn() throws InterruptedException {
		Thread.sleep(3000);
		BtnDelete.click();
	}
	public void SetYesDelete() {
		BtnDeleteYes.click();
	}
	
}
