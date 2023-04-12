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
	 @FindBy(xpath = "(//a[@class='sidebar-toggle btn btn-white'])[1]")
	    WebElement BtnMenu;

	 @FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
		WebElement btnsetting;
	 @FindBy(xpath =  "(//a[normalize-space()='Asset Models'])[1]")
		WebElement btnAssetModels;
	 @FindBy(xpath = "(//input[@type='search'])[1]")
	 WebElement BtnSearch;
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
	 @FindBy(xpath =  "/html/body/span/span/span[2]/ul")
		WebElement ClickSelectManufacturer3;
	 
	 @FindBy(xpath =  "(//b[@role='presentation'])[2]")
		WebElement ClickSelectCategory1;
	 @FindBy(xpath =  "(//input[@role='searchbox'])[1]")
		WebElement ClickSelectCategory2;
	 @FindBy(xpath =  "/html/body/span/span/span[2]/ul")
		WebElement ClickSelectCategory3;
	 
	 @FindBy(xpath = "(//span[@role='presentation'])[3]")
	 WebElement ClickSelectFieldset1;
	 @FindBy(xpath = "(//input[@role='searchbox'])[1]")
	 WebElement TxtFieldSet;
	 @FindBy(xpath = "/html/body/span/span/span[2]/ul")
	 WebElement ClickSelectFieldset3;
	 
	 @FindBy(xpath = "(//span[@role='presentation'])[4]")
	 WebElement ClickSelectDepreciation1;
	 @FindBy(xpath = "(//input[@role='searchbox'])[1]")
	 WebElement TxtDepreciation;
	 @FindBy(xpath = "/html/body/span/span/span[2]/ul")
	 WebElement ClickSelectDepreciation2;
	 
	 
	 
	 
	 @FindBy(xpath =  "(//button[normalize-space()='Save'])[1]")
		WebElement BtnSave;
	 
	 
	 
	 
	 public void SetMenuBtn() {
		  BtnMenu.click();                                         
	  }
	 public void SetSetting() {
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 btnsetting.click();                                                                                                	 
	 }
	 public void SetAssetModelsBtn() {
		 btnAssetModels.click();
	 }
	 public void SetSearchBtn(String search) throws InterruptedException {
		 BtnSearch.clear();
		 Thread.sleep(3000);
		 BtnSearch.sendKeys(search);
	 }
	 public void SetBulkEdit(String edit) throws InterruptedException {
		 Thread.sleep(3000);
		 ClickSelectItem1.click();
//		 ClickSelectItem2.click();
		 ClickSelectBulkEdit1.click();
		 ClickSelectBulkEdit2.sendKeys(edit);
		 ClickSelectBulkEdit3.click();
	 }
	 public void SetGoBtn() {
		 BtnGo.click();
	 }
	 public void SetManufacturer(String SManu) throws InterruptedException
	 {
		
		 ClickSelectManufacturer1.click();
		 Thread.sleep(3000);
		 ClickSelectManufacturer2.sendKeys(SManu);
		 Thread.sleep(3000);
		 ClickSelectManufacturer3.click();
	 }
	 
	public void SetCategory(String cat) throws InterruptedException {
		
		ClickSelectCategory1.click();
		Thread.sleep(3000);
		ClickSelectCategory2.sendKeys(cat);
		Thread.sleep(3000);
		ClickSelectCategory3.click();
	}
	public void SetFieldSet(String fieldset) throws InterruptedException {
		ClickSelectFieldset1.click();
		Thread.sleep(3000);
		TxtFieldSet.sendKeys(fieldset);
		Thread.sleep(3000);
		ClickSelectFieldset3.click();
	}
	public void SetDepreciation(String depreciation) throws InterruptedException {
		ClickSelectDepreciation1.click();
		Thread.sleep(3000);
		TxtDepreciation.sendKeys(depreciation);
		Thread.sleep(3000);
		ClickSelectDepreciation2.click();
	}
	public void SetSave() {
	 
		BtnSave.click();
	}
	

}
