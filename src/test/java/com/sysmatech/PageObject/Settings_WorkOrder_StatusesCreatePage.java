package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_WorkOrder_StatusesCreatePage {
	
	WebDriver ldriver;
	
	  public Settings_WorkOrder_StatusesCreatePage(WebDriver rdriver){
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
	   @FindBy(xpath = "(//a[@class='sidebar-toggle btn btn-white'])[1]")
	    WebElement BtnMenu;
		@FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
		WebElement btnsetting;
		@FindBy(xpath = "(//a[normalize-space()='Work Order Statuses'])[1]")
		WebElement  BtnWorkOrderStatus;
		@FindBy(xpath = "//a[contains(@href,'https://qa.sysmatech.com/public/maintenance/statuses/create')]")  //(//a[@class='btn btn-primary pull-right'])[1]
		WebElement BtnCreate;
		@FindBy(id =  "name") //(//input[@id='name'])[1]
		WebElement TxtName;
		@FindBy(xpath = "(//span[@role='presentation'])[1]")
		WebElement ClickSelectBaseStatus;
		@FindBy(xpath = "(//input[@role='searchbox'])[1]")
		WebElement TxtBaseStatus;
		@FindBy(xpath = "/html/body/span/span/span[2]/ul")
		WebElement  ClickSelectBaseStatus1;
		@FindBy(id = "notes") //(//textarea[@id='notes'])[1]
		WebElement TxtNote;
		@FindBy(xpath ="(//ins[@class='iCheck-helper'])[1]")
		WebElement ClickIsPublished;
		@FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
		WebElement BtnSave;
	   
		 public void SetMenuBtn() {
			  BtnMenu.click();
		  }
		  public void SetSetting() throws InterruptedException
		  {
			
			JavascriptExecutor js = (JavascriptExecutor)ldriver;
			 js.executeScript("window.scrollBy(0,750)", "");
			 Thread.sleep(2000);
			btnsetting.click();
		   }
		  public void SetWorkOrderStatus() throws InterruptedException {
			  Thread.sleep(1000);
//			  JavascriptExecutor js= (JavascriptExecutor)ldriver;
//			  js.executeScript("window.scrollBy(0,350)", "");
			  BtnWorkOrderStatus.click();
		  }
		  public void SetCreateBtn() {
			  BtnCreate.click();        
		  }
		  public void SetName(String name) {
			  TxtName.clear();
			  TxtName.sendKeys(name);
		  }
	    public void SetBaseStatus(String status) {
	    	ClickSelectBaseStatus.click();
	    	TxtBaseStatus.sendKeys(status);
	    	ClickSelectBaseStatus1.click();
	    }
	    public void SetNote(String note) {
	    	TxtNote.clear();
	    	TxtNote.sendKeys(note);
	    }
	    public void SetIsPublished() {
	    	ClickIsPublished.click();
	    }
	    public void SetSave() {
	    	BtnSave.click();
	    }
}
