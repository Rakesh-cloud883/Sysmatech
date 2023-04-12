package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_AddCategoryPage {
	
WebDriver ldriver;
	
	public Settings_AddCategoryPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "(//a[@class='sidebar-toggle btn btn-white'])[1]")  ////a[contains(@class,'sidebar-toggle btn btn-white')]
    WebElement BtnMenu;
	@FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
	WebElement btnsetting;
	
	@FindBy(xpath =  "//a[contains(text(),'Categories')]")  //  (//a[normalize-space()='Categories'])[1]
	WebElement btnCategory;
	@FindBy(xpath =  "//a[contains(@class,'btn btn-primary pull-right')]")
	WebElement btnCreateCategory;
	
	@FindBy(id =  "name") //   //input[contains(@id,'name')]
	WebElement txtCategoryName;
	
	@FindBy(xpath =  "//span[@class='select2-selection__rendered needsclick'][contains(@id,'select-container')][contains(.,'Select Company')]")
	WebElement ClickSelectCompany1;
	@FindBy(xpath =  "//input[@role=\"searchbox\"]")
	WebElement txtSelectCompany2;
	@FindBy(xpath =  "(//div[contains(@class,'clearfix')])[1]")
	WebElement btnSelectCompany3;
	
	
	@FindBy(xpath =  "//*[@id=\"create-form\"]/div/div[2]/div[3]/div/span/span[1]/span")
	WebElement ClickSelectType1;
	@FindBy(xpath =  "//input[contains(@class,'select2-search__field')]")
	WebElement txtSelectType2;
	@FindBy(xpath =  "(//li[contains(@role,'option')])[1]")
	WebElement btnSelectType3;
	
	@FindBy(xpath = "(//ins[@class='iCheck-helper'])[2]")
	WebElement ClickConfAssetCategory;
	
	@FindBy(xpath = "(//ins[@class='iCheck-helper'])[3]")
	WebElement ClickEmailSendCICO;
	
	
	@FindBy(xpath =  "//button[contains(text(),\"Save\")]")
	WebElement btnSavaCategory;
	
	@FindBy(xpath =  "(//a[@class='btn btn-link text-left'][normalize-space()='Cancel'])[2]")
	WebElement btnCancelCategory;
	
	
	public void SetMenuBtn() {
		  BtnMenu.click();
	  }
	
	public void SetSetting() throws InterruptedException
	{
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,750)", "");
		btnsetting.click();
		btnCategory.click();
		btnCreateCategory.click();
	}
	public void SetCategoryName(String Cname) throws InterruptedException
	{
		
		txtCategoryName.sendKeys(Cname);
	}
	public void SetSelectCompany(String Cname) throws InterruptedException
	{
		
		
		ClickSelectCompany1.click();
		Thread.sleep(2000);
		txtSelectCompany2.sendKeys(Cname);
		Thread.sleep(2000);
		btnSelectCompany3.click();
	}
	public void SetSelectType(String Cname) throws InterruptedException
	{
		ClickSelectType1.click();
		Thread.sleep(3000);
		txtSelectType2.sendKeys(Cname);
		btnSelectType3.click();
	}
	public void SetConfiAssetCategoryClick() {
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		ClickConfAssetCategory.click();
	}
	public void SetEamilCiCO() {
		ClickEmailSendCICO.click();
	}
	public void SetSaveCategory() throws InterruptedException
	{

		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,550)", "");
	
		btnSavaCategory.click();
	}
	public void SetCancelCategory() {
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,550)", "");
		 btnCancelCategory.click();
		 
	}
  
}
