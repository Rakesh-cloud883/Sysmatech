package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_Department_UpdatePage {
	WebDriver ldriver;
	
	 public Settings_Department_UpdatePage(WebDriver rdriver){
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);	
			
		}
	 @FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
	 WebElement btnsetting;
	 @FindBy(xpath="(//a[normalize-space()='Departments'])[1]")
	 WebElement BtnDepertment;
	 @FindBy(xpath="(//a[@title='Update'])[2]")
	 WebElement UpdateBtn;
	 @FindBy(xpath="(//input[@id='name'])[1]")
	 WebElement TxtDepartmentName;
	 
	 @FindBy(xpath="(//span[@role='presentation'])[1]")
	 WebElement ClickSelectCompany;
	 @FindBy(xpath="(//input[@role='searchbox'])[1]")
	 WebElement TxtCompany;
	 @FindBy(xpath="(//div[@class='clearfix'])[1]")
	 WebElement ClickCompany;
	 
	 @FindBy(xpath = "(//span[@role='presentation'])[2]")
	 WebElement ClickSelectManager;
	 @FindBy(xpath="(//input[@role='searchbox'])[1]")
	 WebElement TxtManager;
	 @FindBy(xpath = "(//div[@class='clearfix'])[1]")
	 WebElement ClickManager;
	 
	 @FindBy(xpath="(//span[@role='presentation'])[3]")
	 WebElement ClickSelectLocation;
	 @FindBy(xpath="(//input[@role='searchbox'])[1]")
	 WebElement TxtLocation;
	 @FindBy(xpath = "(//div[contains(text(),'Parola')])[1]")
	 WebElement ClickLocation;
	 
	 @FindBy(xpath="(//button[contains(text(),'Save')])[1]")
	 WebElement saveBtn;
	 
	 
	
	 
	 
	 
	 public void SetSetting() throws InterruptedException
		{
			
			JavascriptExecutor js = (JavascriptExecutor)ldriver;
			 js.executeScript("window.scrollBy(0,350)", "");
			btnsetting.click();
		}
	 public void SetDepertmentBtn() {
		 BtnDepertment.click();
	 }
	 public void SetUpdateBtn() {
		 UpdateBtn.click();
	 }
	 public void SetDepartmentName(String Dname) {
		 TxtDepartmentName.clear();
		 TxtDepartmentName.sendKeys(Dname);
	 }
	 
	 public void SetCompany(String company) {
		 ClickSelectCompany.click();
		 TxtCompany.sendKeys(company);
		 ClickCompany.click();
	 }
	 public void SetManager(String manager) {
		ClickSelectManager.click();
		TxtManager.sendKeys(manager);
		ClickManager.click();
		 
	 }
	 public void SetLocation(String location) {
		 ClickSelectLocation.click();
		 TxtLocation.sendKeys(location);  
		 ClickLocation.click();
	 }
	 public void SetSaveBtn() {
		 JavascriptExecutor js=(JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 saveBtn.click();
	 }
	 

}
