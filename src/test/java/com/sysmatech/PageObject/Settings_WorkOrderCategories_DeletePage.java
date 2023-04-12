package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_WorkOrderCategories_DeletePage {
WebDriver ldriver;
	
    public Settings_WorkOrderCategories_DeletePage(WebDriver rdriver) 
    	{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);	
			      
		  }
     @FindBy(xpath = "(//a[@class='sidebar-toggle btn btn-white'])[1]")
     WebElement BtnMenu;
	  @FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
	  WebElement btnsetting;
	  @FindBy(xpath = "(//a[normalize-space()='Work Order Categories'])[1]")
	  WebElement BtnWOCategories;
	  @FindBy(xpath = "(//input[@type='search'])[1]")
	  WebElement BtnSearch;
	  @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm delete-asset ' or @data-title='Delete'])[1]")   //(//a[@class='btn btn-danger btn-sm delete-asset'])[1]
	  WebElement BtnDelete;
	  @FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	  WebElement BtnDeleteYes;
	  

	  public void SetMenuBtn() {
		  BtnMenu.click();
	  }
	  public void SetSetting() throws InterruptedException
	   {
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,750)", "");
		btnsetting.click();
	   }
	  
	  public void SetCategoriesBtn() {
		  BtnWOCategories.click();
		  
	  }
	  public void SetSearchBtn(String search) throws InterruptedException {
		  BtnSearch.clear();
		  Thread.sleep(1000);
		  BtnSearch.sendKeys(search);
	  }
	  public void SetDeleteBtn() throws InterruptedException {
		  Thread.sleep(2000);
		  BtnDelete.click();
	  }
	  public void SetDeleteYesBtn() {
		  BtnDeleteYes.click();
	  }
	 

}
