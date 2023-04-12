package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_DepartmentsCreatePage {

	
		WebDriver ldriver;
			
		 public Settings_DepartmentsCreatePage(WebDriver rdriver){
				ldriver=rdriver;
				PageFactory.initElements(rdriver, this);	
				
			}
		 @FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
		 WebElement btnsetting;
		 @FindBy(xpath="(//a[normalize-space()='Departments'])[1]")
		 WebElement BtnDepertment;
		 @FindBy(xpath = "//a[contains(@href,'https://qa.sysmatech.com/public/departments/create')]") //(//a[@class='btn btn-primary pull-right'])[1]
		 WebElement BtnCreate;
		 @FindBy(id = "name") //(//input[@id='name'])[1]
		 WebElement TxtDepartmentName;
		 
		 @FindBy(xpath = "(//span[@role='presentation'])[1]")
		 WebElement SelectCompany;
		 @FindBy(xpath = "(//input[@role='searchbox'])[1]")
		 WebElement TxtCompany;
		 @FindBy(xpath = "(//div[@class='clearfix'])[1]") ///html/body/span/span/span[2]/ul/li/div/div[2]
		 WebElement ClickCompany;
		 
		 @FindBy(xpath = "(//span[@role='presentation'])[2]")
		 WebElement SelectManager;
		 @FindBy(xpath="(//input[@role='searchbox'])[1]")
		 WebElement TxtManager;
		 @FindBy(xpath="(//div[@class='clearfix'])[1]")
		 WebElement ClickManager;
		 
		 @FindBy(xpath = "(//span[@role='presentation'])[3]")
		 WebElement SelectLocation;
		 @FindBy(xpath="(//input[@role='searchbox'])[1]")
		 WebElement TxtLocation;
		 @FindBy(xpath="(//div[@class='clearfix'])[1]")
		 WebElement ClickLocation;
		 
		 @FindBy(xpath ="(//button[contains(text(),'Save')])[1]")
		 WebElement BtnSave;
		 
		 
		 public void SetSetting() throws InterruptedException
			{
				
				JavascriptExecutor js = (JavascriptExecutor)ldriver;
				 js.executeScript("window.scrollBy(0,350)", "");
				btnsetting.click();
			}
		 public void SetDepertmentBtn() {
			 BtnDepertment.click();
		 }
		 public void SetCreateBtn() {
			 BtnCreate.click();
		 }
		 public void SetDepartmentName(String name) {
			TxtDepartmentName.sendKeys(name); 
		 }
		 public void SetCompany(String company) {
			 SelectCompany.click();
			 TxtCompany.sendKeys(company);
			 ClickCompany.click();
		 }
		 public void SetManager(String manager) {
			 SelectManager.click();
			 TxtManager.sendKeys(manager);
			 ClickManager.click();
		 }
		 public void setLocation(String location) {
			 SelectLocation.click();
			 
			 TxtLocation.sendKeys(location);
			 ClickLocation.click();
		 }
		 
		 public void SetSave() {
			 JavascriptExecutor js=(JavascriptExecutor)ldriver;
			 js.executeScript("window.scrollBy(0,750)", "");
			 BtnSave.click();
		 }
		 
}
