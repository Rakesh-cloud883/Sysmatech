package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_Depreciation_DeletePage {
WebDriver ldriver;
	
    public Settings_Depreciation_DeletePage(WebDriver rdriver)
        {
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);	
			      
		  }
      @FindBy(xpath = "(//a[@class='sidebar-toggle btn btn-white'])[1]")
      WebElement BtnMenu;
	  @FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
	  WebElement btnsetting;
	  @FindBy(xpath ="(//a[@href='https://qa.sysmatech.com/public/depreciations'])[1]")
	  WebElement BtnDepreciation;
	  @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm delete-asset'])[1]")
	  WebElement BtnDelete;                                            
	  @FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	  WebElement BtnYesDelete;
	  
	  public void SetMenuBtn() {
		  BtnMenu.click();
	  }
	  public void SetSetting() throws InterruptedException
	   {
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		btnsetting.click();
	   }
	  public void SetDepreciationBtn() {
		  JavascriptExecutor js=(JavascriptExecutor)ldriver;
		  js.executeScript("window.scrollBy(0,250)", "");
		  BtnDepreciation.click();
	  }
	  public void SetDeleteBtn() {
		  BtnDelete.click();
	  }
	  public void SetDeleteYesBtn() {
		  BtnYesDelete.click();
	  }
}
