package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sysmatech.TestCases.BaseClass;

public class Setting_CustomFieldDeletePage {
	WebDriver ldriver;
	
	 public Setting_CustomFieldDeletePage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 @FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
		WebElement btnsetting;
	 @FindBy(xpath="(//a[normalize-space()='Custom Fields'])[1]")
	 WebElement BtnCustomFields;
	 @FindBy(xpath="(//button[@type='submit'])[2]")
	 WebElement BtnDelete;
	 
	 public void SetSetting() {
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 btnsetting.click();	 
	 }
	 public void SetCustomFields() {
		 BtnCustomFields.click();
	 }
	 public void SetDeleteBtn() {
		 BtnDelete.click();
	 }
}
