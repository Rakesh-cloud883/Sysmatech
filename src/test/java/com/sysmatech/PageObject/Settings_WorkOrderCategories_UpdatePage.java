package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_WorkOrderCategories_UpdatePage {

	
	WebDriver ldriver;
	
    public Settings_WorkOrderCategories_UpdatePage(WebDriver rdriver) 
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
	  @FindBy(xpath = "(//a[@class='btn btn-sm btn-warning ' or @title='Update'])[1]")  //(//a[@title='Update'])[1]
	  WebElement BtnUpdate;
	  @FindBy(id = "name")  //(//input[@id='name'])[1]
	  WebElement TxtName;
	  @FindBy(id = "notes")  //
	  WebElement TxtNotes;
	  @FindBy(xpath =  "(//button[contains(text(),'Save')])[1]")
	  WebElement BtnSave;
	  
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
	 
	  public void SetUpdateBtn() throws InterruptedException {
		  Thread.sleep(2000);
		  BtnUpdate.click();  
	  }
	  public void SetCategoryName(String name) {
		  TxtName.clear();
		  TxtName.sendKeys(name);
	  }
	  public void SetNotes(String notes) {
		  TxtNotes.clear();
		  TxtNotes.sendKeys(notes);
	  }
	  public void SetSaveBtn() {
		  JavascriptExecutor js = (JavascriptExecutor)ldriver;
			 js.executeScript("window.scrollBy(0,950)", "");
		  BtnSave.click();
	  }
	  
}
