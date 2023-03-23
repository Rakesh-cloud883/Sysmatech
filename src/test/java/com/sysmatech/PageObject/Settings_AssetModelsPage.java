package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_AssetModelsPage {
	WebDriver ldriver;
	
	 public Settings_AssetModelsPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 @FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
		WebElement btnsetting;
	 @FindBy(xpath =  "(//a[normalize-space()='Asset Models'])[1]")
		WebElement btnAssetModels;
	 @FindBy(xpath =  "(//a[@class='btn btn-primary pull-right'])[1]")
		WebElement btnCreateNew;
	 @FindBy(xpath =  "(//input[@id='name'])[1]")
		WebElement TxtName;
	 
	 @FindBy(xpath =  "(//span[@role='presentation'])[1]")
		WebElement ClickSelectManufacturer1;
	 @FindBy(xpath =  "(//input[@role='searchbox'])[1]")
		WebElement ClickSelectManufacturer2;
	 @FindBy(xpath =  "(//div[contains(text(),'RakeshManufacture123')])[1]")
		WebElement ClickSelectManufacturer3;
	 
	 @FindBy(xpath =  "(//span[@role='presentation'])[2]")
		WebElement ClickSelectCategory1;
	 @FindBy(xpath =  "(//input[@role='searchbox'])[1]")
		WebElement ClickSelectCategoryr2;
	 @FindBy(xpath =  "(//div[contains(text(),'rakesh22222222')])[1]")
		WebElement ClickSelectselectCategory3;
	 
	 @FindBy(xpath =  "(//input[@id='model_number'])[1]")
		WebElement TxtModel;

	 @FindBy(xpath =  "(//input[@id='eol'])[1]")
		WebElement TxtEOLMonth;

	 @FindBy(xpath =  "(//span[@role='presentation'])[4]")
		WebElement ClickselectFieldSet1;
	 @FindBy(xpath =  "(//input[@role='searchbox'])[1]")
		WebElement ClickselectFieldSet2;
	 @FindBy(xpath =  "/html/body/span/span/span[2]/ul/li")
		WebElement ClickselectFieldSet3;
	 
	 @FindBy(xpath =  "(//textarea[@id='notes'])[1]")
		WebElement Txtnote;
	 @FindBy(xpath =  "(//button[contains(text(),'Save')])[1]")
		WebElement btnSave;
	 
	 
	 
	 public void SetSetting() {
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 btnsetting.click();	 
	 }
	 public void SetAssetModelsBtn() {
		 btnAssetModels.click();
	 }
	 public void SetCreateNewBtn() {
		 btnCreateNew.click();
	 }
	 
	 public void SetName(String name) {
		 TxtName.sendKeys(name);
		 
	 }
	 public void SetManufacturer(String SManu)
	 {
		 ClickSelectManufacturer1.click();
		 ClickSelectManufacturer2.sendKeys(SManu);
		 ClickSelectManufacturer3.click();
	 }
	 public void SetCategory(String SCat) {
		 ClickSelectCategory1.click();
		 ClickSelectCategoryr2.sendKeys(SCat);
		 ClickSelectselectCategory3.click();
	 }
	 public void SetModel(String Mno) {
		 TxtModel.sendKeys(Mno);
	 }
	 public void SetEOLMonth(String month) {
		 TxtEOLMonth.sendKeys(month);
	 }
	 public void SetFieldset(String Fieldset) {
		 ClickselectFieldSet1.click();
		 ClickselectFieldSet2.sendKeys(Fieldset);
		 ClickselectFieldSet3.click();
	 }
	 public void SetNote(String note) {
		 Txtnote.sendKeys(note);
	 }
	 public void SetSaveBtn() {
		 JavascriptExecutor js=(JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 btnSave.click();
	 }

}
