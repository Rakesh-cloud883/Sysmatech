package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_StatusLabelsUpdatePage {
	WebDriver ldriver;
	
	 public Settings_StatusLabelsUpdatePage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 @FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
		WebElement btnsetting;
	 @FindBy(xpath =  "(//a[normalize-space()='Status Labels'])[1]")
		WebElement btnStatusLabels;
	 @FindBy(xpath = "(//input[@type='search'])[1]")
	 WebElement BtnSearch;
	 @FindBy(xpath =  "(//a[@title='Update'])[1]")
		WebElement btnUpdate;
	 @FindBy(id =  "name") //(//input[@id='name'])[1]
		WebElement TxtName;
	 @FindBy(xpath =  "(//span[@role='presentation'])[1]")
		WebElement ClickSelectStatusType1;
	 @FindBy(xpath =  "(//input[@role='searchbox'])[1]")
		WebElement ClickSelectStatusType2;
	 @FindBy(xpath =  "/html/body/span/span/span[2]/ul/li")
		WebElement ClickSelectStatusType3;
	 
	 @FindBy(xpath =  "(//button[contains(text(),'Save')])[1]")
		WebElement btnSave;
	 
	 public void SetSetting() {
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 btnsetting.click();	 
	 }
	 public void SetStatusLabelsBtn() {
		 btnStatusLabels.click();
	 }
	 public void SetSearchBtn(String sname) throws InterruptedException {
		 Thread.sleep(3000);
		 BtnSearch.sendKeys(sname);
	 }
	 public void SetUpdateBtn() throws InterruptedException {
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(150,0)", "");
		 Thread.sleep(3000);
		 btnUpdate.click(); 
	 }
	 public void SetName(String name) {
		 TxtName.clear();
		 TxtName.sendKeys(name);
	 }
	 public void SetStatusType(String search) {
		ClickSelectStatusType1.click();
		ClickSelectStatusType2.sendKeys(search);
		ClickSelectStatusType3.click();
	 }
	 public void SetSaveBtn() {
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 btnSave.click();
	 }
}
