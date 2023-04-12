package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_WorkOrder_prioritiesCreatePage {

WebDriver ldriver;
	
    public Settings_WorkOrder_prioritiesCreatePage(WebDriver rdriver)
        {
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);	
			      
		  }
      @FindBy(xpath = "(//a[@class='sidebar-toggle btn btn-white'])[1]")
      WebElement BtnMenu;
	  @FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
	  WebElement btnsetting;
	  @FindBy(xpath = "(//a[normalize-space()='Work Order Priorities'])[1]")
	  WebElement BtnWorkOrderPriority;
	  @FindBy(xpath = "//a[contains(@href,'https://qa.sysmatech.com/public/maintenance/priorities/create')]")  //(//a[@class='btn btn-primary pull-right'])[1]
	  WebElement BtnCreate;
	  @FindBy(id = "name")  //(//input[@id='name'])[1]
	  WebElement TxtPriorityName;
	  @FindBy(id = "notes")  //(//textarea[@id='notes'])[1]
	  WebElement TxtNote;
	  @FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
	  WebElement Btnsave;
	  public void SetMenuBtn() {
		  BtnMenu.click();
	  }
	  public void SetSetting() throws InterruptedException
	   {
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,750)", "");
		btnsetting.click();
	   }
	  public void SetWorkOrderPriorityBtn() {
//		JavascriptExecutor js = (JavascriptExecutor)ldriver;
//	    js.executeScript("window.scrollBy(0,450)", "");
		 BtnWorkOrderPriority.click();
	  }
	  public void SetCreateBtn() {
		  BtnCreate.click();
	  }
	  public void SetPriorityName(String name) throws InterruptedException {
		 TxtPriorityName.clear();
		  Thread.sleep(1000);
		  TxtPriorityName.sendKeys(name);
	  }
	  public void SetNote(String note) {
		  TxtNote.clear();
		  TxtNote.sendKeys(note);
	  }
	  public void SetsaveBtn() {
		  JavascriptExecutor js = (JavascriptExecutor)ldriver;
		    js.executeScript("window.scrollBy(0,450)", "");
		  Btnsave.click();
	  }
	  
}
