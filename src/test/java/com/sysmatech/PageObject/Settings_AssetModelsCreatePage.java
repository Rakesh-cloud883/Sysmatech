package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_AssetModelsCreatePage {
	WebDriver ldriver;
	
  public Settings_AssetModelsCreatePage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
     @FindBy(xpath = "(//a[@class='sidebar-toggle btn btn-white'])[1]")
      WebElement BtnMenu;
	 @FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
		WebElement btnsetting;
	 @FindBy(xpath =  "(//a[normalize-space()='Asset Models'])[1]")
		WebElement btnAssetModels;
	 @FindBy(xpath =  "//a[contains(@href,'https://qa.sysmatech.com/public/models/create')]")  //(//a[@class='btn btn-primary pull-right'])[1]
		WebElement btnCreateNew;
	 @FindBy(id =  "name")  //(//input[@id='name'])[1]
		WebElement TxtName;
	 
	 @FindBy(xpath =  "(//span[@class='select2-selection__arrow needsclick' or @role='presentation'])[1]")  //(//span[@role='presentation'])[2]
		WebElement ClickSelectManufacturer1;
	 @FindBy(xpath =  "//input[@class='select2-search__field' and (@aria-controls='select2-manufacturer_select_id-results' or @aria-autocomplete='list')]")  //(//input[@role='searchbox'])[1]
		WebElement ClickSelectManufacturer2;
	 @FindBy(xpath =  "(//div[contains(@class,'clearfix')])[1]")   //(//div[@class='clearfix'])[1]
		WebElement ClickSelectManufacturer3;
	 
	 @FindBy(xpath =  "(//span[@class='select2-selection__arrow needsclick' or @role='presentation'])[2]")  //(//span[@role='presentation'])[2]
		WebElement ClickSelectCategory1;
	 @FindBy(xpath =  "(//input[@role='searchbox'])[1]")
		WebElement ClickSelectCategoryr2;
	 @FindBy(xpath =  "(//div[@class='clearfix'])[1]")
		WebElement ClickSelectselectCategory3;
	 
	 @FindBy(id =  "model_number")   //(//input[@id='model_number'])[1]
		WebElement TxtModel;
	 
	 @FindBy(xpath =  "(//span[@class='select2-selection__arrow needsclick' or @role='presentation'])[3]")   //(//span[@role='presentation'])[3]
		WebElement ClickselectDepreciation1;
	 @FindBy(xpath =  "(//input[@role='searchbox'])[1]")
		WebElement ClickselectDepreciation2;
	 @FindBy(xpath =  "//ul[@class='select2-results__options' and (@id='select2-depreciation_id-dw-results'  or  @role='listbox')]")   ///html/body/span/span/span[2]/ul
		WebElement ClickselectDepreciation3;
	 
	 @FindBy(id =  "eol") //(//input[@id='eol'])[1]
		WebElement TxtEOLMonth;

	 @FindBy(xpath =  "(//span[@class='select2-selection__arrow needsclick' or @role='presentation'])[4]") //(//span[@role='presentation'])[5]
		WebElement ClickselectFieldSet1;
	 @FindBy(xpath =  "(//input[@role='searchbox'])[1]")
		WebElement ClickselectFieldSet2;
	 @FindBy(xpath =  "//ul[@class='select2-results__options' and (@id='select2-custom_fieldset-j1-result' or @role='listbox')]")  //  /html/body/span/span/span[2]/ul
		WebElement ClickselectFieldSet3;
	 
	 @FindBy(id =  "notes")  //(//textarea[@id='notes'])[1]
		WebElement Txtnote;
	 @FindBy(xpath =  "(//button[contains(text(),'Save')])[1]")
		WebElement btnSave;
	 
	 
	 public void SetMenuBtn() {
		
		  BtnMenu.click();                                         
	  }
	 public void SetSetting() throws InterruptedException {
		 Thread.sleep(1000);
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,550)", "");
		 btnsetting.click();	 
	 }
	 public void SetAssetModelsBtn() throws InterruptedException {
		 Thread.sleep(1000);
		 btnAssetModels.click();
	 }
	 public void SetCreateNewBtn() {
		 btnCreateNew.click();
	 }
	 
	 public void SetName(String name) {
		 TxtName.clear();
		 TxtName.sendKeys(name);
		 
	 }
	 public void SetManufacturer(String SManu) throws InterruptedException
	 { 
		Thread.sleep(3000);
		 ClickSelectManufacturer1.click();
	//	 Thread.sleep(3000);
		 ClickSelectManufacturer2.sendKeys(SManu);
		 ClickSelectManufacturer3.click();
	 }
	 public void SetCategory(String SCat) throws InterruptedException {
		Thread.sleep(3000);
		 ClickSelectCategory1.click();
	// . 	 Thread.sleep(3000);
		 ClickSelectCategoryr2.sendKeys(SCat);     
		 ClickSelectselectCategory3.click();
	 }
	 public void SetModel(String Mno) {
		 TxtModel.clear();
		 TxtModel.sendKeys(Mno);         
	 }
	 public void SetDepreciation(String depreciation) {
		 ClickselectDepreciation1.click();
		 ClickselectDepreciation2.sendKeys(depreciation);
		 ClickselectDepreciation3.click();
	 }
	 public void SetEOLMonth(String month) {
		 TxtEOLMonth.clear();
		 TxtEOLMonth.sendKeys(month);
	 }
	 public void SetFieldset(String Fieldset) {
		 JavascriptExecutor js=(JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 ClickselectFieldSet1.click();
		 ClickselectFieldSet2.sendKeys(Fieldset);
		 ClickselectFieldSet3.click();
	 }
	 public void SetNote(String note) {
		 Txtnote.clear();
		 Txtnote.sendKeys(note);
	 }
	 public void SetSaveBtn() {
		 JavascriptExecutor js=(JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 btnSave.click(); 
	 }

}
