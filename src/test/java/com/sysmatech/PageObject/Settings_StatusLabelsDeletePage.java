package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_StatusLabelsDeletePage {
	WebDriver ldriver;
	
	 public Settings_StatusLabelsDeletePage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 @FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
		WebElement btnsetting;
	 @FindBy(xpath =  "(//a[normalize-space()='Status Labels'])[1]")
		WebElement btnStatusLabels;
	 @FindBy(xpath =  "(//a[@class='btn btn-danger btn-sm delete-asset'])[1]")
		WebElement btnDelete;
	 @FindBy(xpath =  "(//button[normalize-space()='Yes'])[1]")
		WebElement btnDeleteYes;
	 public void SetSetting() {
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 btnsetting.click();	 
	 }
	 public void SetStatusLabelsBtn() {
		 btnStatusLabels.click();
	 }
	 public void SetDeleteBtn() {
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(150,0)", "");
		 btnDelete.click(); 
		 btnDeleteYes.click();
	 }

}
