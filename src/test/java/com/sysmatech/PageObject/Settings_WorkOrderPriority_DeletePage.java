package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_WorkOrderPriority_DeletePage {

WebDriver ldriver;
	
    public Settings_WorkOrderPriority_DeletePage(WebDriver rdriver)
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
	  @FindBy(xpath = "(//input[@type='search'])[1]")
	  WebElement BtnSearch;
	  @FindBy(xpath = "(//a[@class=\"btn btn-danger btn-sm delete-asset\" or @data-title=\"Delete\"])[1]")  //(//a[@class='btn btn-danger btn-sm delete-asset'])[1]
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
	  public void SetWorkOrderPriorityBtn() {
//		JavascriptExecutor js = (JavascriptExecutor)ldriver;
//	    js.executeScript("window.scrollBy(0,450)", "");
		 BtnWorkOrderPriority.click();
	  }
	  public void SetSearch(String search) throws InterruptedException {
		  BtnSearch.clear();
		  Thread.sleep(2000);
		  BtnSearch.sendKeys(search);
	  }
	  public void SetDelete() throws InterruptedException {
		  Thread.sleep(3000);
		  BtnDelete.click();
		  
	  }
	  public void setDeleteYesBtn() {
		  BtnDeleteYes.click();
	  }
}
