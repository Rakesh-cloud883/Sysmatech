package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_WorkOrder_Categories_CreatePage {

	
WebDriver ldriver;
	
     public Settings_WorkOrder_Categories_CreatePage(WebDriver rdriver) 
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
	  @FindBy(xpath = "(//a[@href=\"https://qa.sysmatech.com/public/maintenance/categories/create\"])[1]")  //(//a[@class='btn btn-primary pull-right'])[1]
	  WebElement BtnCreate;
	  @FindBy(id = "name")  //(//input[@id='name'])[1]
	  WebElement TxtName;
	  @FindBy(id =  "notes")  //(//textarea[@id='notes'])[1]
	  WebElement TxtNotes;
	  @FindBy(xpath = "(//ins[@class='iCheck-helper'])[1]")
	  WebElement ClickIsPublish;
	  @FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
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
	  public void SetCreateBtn() {
		  BtnCreate.click();
		  
	  }
	  public void SetName(String Cname) {
		  TxtName.sendKeys(Cname);
	  }
	  public void SetNote(String note) {
		  TxtNotes.sendKeys(note);
	  }
	  public void SetIsPublishBtn() {
		  ClickIsPublish.click();
		  
	  }
     public void SetSaveBtn() {
    	 BtnSave.click();
     }
	  
}
