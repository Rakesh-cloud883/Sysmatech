package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_StatusLabelsCreatePage {
	WebDriver ldriver;
	
	 public Settings_StatusLabelsCreatePage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 @FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
		WebElement btnsetting;
	 @FindBy(xpath =  "(//a[normalize-space()='Status Labels'])[1]")
		WebElement btnStatusLabels;
	 @FindBy(xpath =  "//a[contains(@href,'https://qa.sysmatech.com/public/statuslabels/create')] ")  //(//a[@class='btn btn-primary pull-right'])[1]
		WebElement btnStatusLabelsCreateNew;
	 @FindBy(id =  "name")  ////input[@id=\"name\"]
		WebElement TxtName;
	 @FindBy(xpath =  "(//span[@role='presentation'])[1]")
		WebElement ClickSelectStatusType1;
	 @FindBy(xpath =  "(//input[@role='searchbox'])[1]")
		WebElement ClickSelectStatusType2;
	 @FindBy(xpath =  "/html/body/span/span/span[2]/ul/li")
		WebElement ClickSelectStatusType3;
	 @FindBy(id =  "color")  //(//input[@id='color'])[1]
		WebElement TxtChartColor;
	 @FindBy(id =  "notes")  //(//textarea[@id='notes'])[1]
		WebElement TxtNote;
	 @FindBy(xpath =  "(//ins[@class='iCheck-helper'])[1]")
		WebElement TxtShow;
	 @FindBy(xpath =  "(//ins[@class='iCheck-helper'])[2]")
		WebElement TxtDefaultLabels;
	 @FindBy(xpath =  "//button[contains(text(),\"Save\")]//i[@class=\"fa fa-check icon-white\"]")
		WebElement ClickSave;
	 public void SetSetting() {
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 btnsetting.click();	 
	 }
	 public void SetStatusLabelsBtn() {
		 btnStatusLabels.click();
	 }
	 public void SetCreateNewStatusLabels() {
		 btnStatusLabelsCreateNew.click();
	 }
	 public void SetName(String R) {
		 TxtName.clear();
		 TxtName.sendKeys(R);
	 }
	 public void SetStatusType(String type) {
		 ClickSelectStatusType1.click();
		 ClickSelectStatusType2.sendKeys(type);
		 ClickSelectStatusType3.click();
	 }
	 public void SetChartColor(String r1)
	 {
		 TxtChartColor.sendKeys(r1);
	 }
	 public void SetNote(String note) throws InterruptedException {
		 Thread.sleep(3000);
		TxtNote.sendKeys(note);
		TxtShow.click();
		TxtDefaultLabels.click();
		
	 }
	 public void SetSaveBtn() {
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 ClickSave.click();
	 }
	 
}
