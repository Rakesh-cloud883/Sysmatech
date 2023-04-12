package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_AddCompanyPage {

WebDriver ldriver;
	
	public Settings_AddCompanyPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath =  "//i[contains(@class,'fa fa-gear')]") //span[contains(text(),'Settings')]
	WebElement btnsetting;
	@FindBy(xpath = "//a[contains(.,'Companies')]")
	WebElement btncompany;
	@FindBy(xpath="(//a[contains(.,'Create New')])[2]")
	WebElement btncreatenew;
	@FindBy(id = "name")
	WebElement txtcompany;
	@FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
	WebElement btnsave;
	@FindBy(xpath = "(//a[@class='btn btn-link text-left'][normalize-space()='Cancel'])[2]")
	WebElement btnCancel;
	
	public void SetSetting() throws InterruptedException
	{
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");   //350
		btnsetting.click();
		btncompany.click();
	
		
	}
	public void setCreateCompany(String cname)
	{
		btncreatenew.click();
		txtcompany.sendKeys(cname);
		
		
	}
	public void SetSaveBtn() {
		btnsave.click();
	}
	public void SetCancelBtn() {
		btnCancel.click();
	}
	
	
	
	
	
	
	
}
