package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_AssetModelsBulkEditPage {
	WebDriver ldriver;
	
	 public Settings_AssetModelsBulkEditPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 @FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
		WebElement btnsetting;
	 @FindBy(xpath =  "(//a[normalize-space()='Asset Models'])[1]")
		WebElement btnAssetModels;
	 @FindBy(xpath =  "(//input[@name='btSelectItem'])[1]")
		WebElement ClickSelectItem1;
	 @FindBy(xpath =  "(//input[@name='btSelectItem'])[2]")
		WebElement ClickSelectItem2;
	 
	 @FindBy(xpath =  "(//span[@role='presentation'])[1]")
		WebElement ClickSelectBulkEdit1;
	 @FindBy(xpath =  "(//input[@role='searchbox'])[1]")
		WebElement ClickSelectBulkEdit2;
	 @FindBy(xpath =  "/html/body/span/span/span[2]/ul/li")
		WebElement ClickSelectBulkEdit3;
	 
	 @FindBy(xpath =  "(//button[normalize-space()='Go'])[1]")
		WebElement BtnGo;
	 
	 @FindBy(xpath =  "(//span[@role='presentation'])[1]")
		WebElement ClickSelectManufacturer1;
	 @FindBy(xpath =  "(//input[@role='searchbox'])[1]")
		WebElement ClickSelectManufacturer2;
	 @FindBy(xpath =  "(//div[contains(text(),'RakeshManufacture123')])[1]")
		WebElement ClickSelectManufacturer3;
	 
	 @FindBy(xpath =  "(//span[@role='presentation'])[2]")
		WebElement ClickSelectCategory1;
	 @FindBy(xpath =  "(//input[@role='searchbox'])[1]")
		WebElement ClickSelectCategory2;
	 @FindBy(xpath =  "(//div[contains(text(),'rakesh22222222')])[1]")
		WebElement ClickSelectCategory3;
	 
	 @FindBy(xpath =  "(//button[normalize-space()='Save'])[1]")
		WebElement BtnSave;
	 
	 
	 
	 
	 
	 public void SetSetting() {
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 btnsetting.click();                                                                                                	 
	 }
	 public void SetAssetModelsBtn() {
		 btnAssetModels.click();
	 }
	 
	 public void SetBulkEdit(String edit) {
		 ClickSelectItem1.click();
		 ClickSelectItem2.click();
		 ClickSelectBulkEdit1.click();
		 ClickSelectBulkEdit2.sendKeys(edit);
		 ClickSelectBulkEdit3.click();
	 }
	 public void SetGoBtn() {
		 BtnGo.click();
	 }
	 public void SetManufacturer(String SManu)
	 {
		 ClickSelectManufacturer1.click();
		 ClickSelectManufacturer2.sendKeys(SManu);
		 ClickSelectManufacturer3.click();
	 }
	 
	public void SetCategory(String cat) {
		ClickSelectCategory1.click();
		ClickSelectCategory2.sendKeys(cat);
		ClickSelectCategory3.click();
	}
	public void SetSave() {
	 
		BtnSave.click();
	}
	

}
