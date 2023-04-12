package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_Custome_FeildCreateNewPage {

	WebDriver ldriver;
	
	 public Settings_Custome_FeildCreateNewPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 @FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
		WebElement btnsetting;
	 @FindBy(xpath="(//a[normalize-space()='Custom Fields'])[1]")
	 WebElement BtnCustomFields;
	 @FindBy(xpath = "(//a[normalize-space()='New Custom Field'])[1]")  // (//a[normalize-space()='New Custom Field'])[1]
	 WebElement BtnNewCustomField;
	 @FindBy(name  = "name") //(//input[@name='name'])[1]
	 WebElement TxtName;
	 
	 @FindBy(xpath = "//span[@class='select2-selection__arrow needsclick' or @role=\"presentation\"][1]")   //(//span[@role='presentation'])[2]
	 WebElement ClickSelectFromElement1;
	 @FindBy(xpath = "//input[@class='select2-search__field' and (@type='search' or @aria-controls='select2-element-5o-results') ]")  //(//input[@role='searchbox'])[1]
     WebElement TxtFromElement2;
	 @FindBy(xpath = "//ul[@class='select2-results__options' and (@id='select2-element-5o-results' or @role='listbox')]")   ///html/body/span/span/span[2]/ul
	 WebElement ClickSelectFromElement3;
	 
	 @FindBy(xpath = "(//span[@class='select2-selection__arrow needsclick' or @role='presentation'])[2]")  //(//span[@role='presentation'])[3]
	 WebElement ClickSelectFormate1;
	 @FindBy(xpath = "//input[@class='select2-search__field' and (@aria-controls='select2-format-05-results'  or @role='searchbox')]")  //(//input[@role='searchbox'])[1]
     WebElement TxtFormate2;
	 @FindBy(xpath = "//input[@class='select2-search__field' and (@aria-controls='select2-format-05-results'  or @role='searchbox')]")  ///html/body/span/span/span[2]/ul
	 WebElement ClickSelectFormate3;
	 
	 @FindBy(name= "help_text")   //(//input[@name='help_text'])[1]
	 WebElement TxtHelpText;
	 @FindBy(xpath = "(//ins[@class='iCheck-helper'])[1]")
	 WebElement ClickCheckOutEmailSent;
	 @FindBy(xpath = "(//ins[@class='iCheck-helper'])[2]")
	 WebElement ClickEncryptValue;
	 
	 @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	 WebElement BTnSave;
	 
	 
	 public void SetSetting() throws InterruptedException
		{
			
			JavascriptExecutor js = (JavascriptExecutor)ldriver;
			 js.executeScript("window.scrollBy(0,750)", "");
			btnsetting.click();	
		}
	 public void SetCustomFieldBtn() {
		 BtnCustomFields.click();
	 }
	 public void SetNewCustomField() {
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,950)", "");
		 BtnNewCustomField.click();
	 }
	 public void SetNameCustomField(String name) {
		 TxtName.clear();
		 TxtName.sendKeys(name);
	 }
	 public void SetFromElement(String Felement)
	 {
		 ClickSelectFromElement1.click();
		 TxtFromElement2.sendKeys(Felement);
		 ClickSelectFromElement3.click();
	 }
	 public void SetFormat(String formate) {
		 ClickSelectFormate1.click();
		 TxtFormate2.sendKeys(formate);
		 ClickSelectFormate3.click();
		 
	 }
	 public void SetHelpText(String text) {
		 TxtHelpText.clear();
		 TxtHelpText.sendKeys(text);
		 
	 }
	 
	 public void SetClickCheckOutEmail() {
		 ClickCheckOutEmailSent.click();
	 }
	 public void SetClickEncryptValue() {
		 ClickEncryptValue.click();
	 }
	 
	 public void SetSaveBtn() {
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 BTnSave.click();
		 
	 }
	 
	   
}
