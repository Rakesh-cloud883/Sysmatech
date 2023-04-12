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
	  @FindBy(xpath ="//a[contains(text(),'Depreciation')]")
	  WebElement BtnDepreciation;
	  
	  @FindBy(xpath = "(//input[@type='search'])[1]")
	  WebElement BtnSearch;
	  @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm delete-asset' and @onclick='return false' or @data-title='Delete'])[1]")  //(//a[@class='btn btn-danger btn-sm delete-asset'])[1]
	  WebElement BtnDelete;                                            
	  @FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	  WebElement BtnYesDelete;
	  
	  public void SetMenuBtn() {
		  BtnMenu.click();
	  }
	  public void SetSetting() throws InterruptedException
	   {
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,700)", "");   //750
		btnsetting.click();
	   }
	 
	  public void SetDepreciationBtn() throws InterruptedException {
//		  JavascriptExecutor js=(JavascriptExecutor)ldriver;
//		  js.executeScript("window.scrollBy(0,150)", "");
		  Thread.sleep(2000);
		  BtnDepreciation.click();
	  }
	  public void SetSearchBtn(String search) throws InterruptedException {
		//  btnsetting.clear();
		  Thread.sleep(2000);
		  BtnSearch.sendKeys(search);
	  }
	  public void SetDeleteBtn() throws InterruptedException {
		  Thread.sleep(3000);
		  BtnDelete.click();
	  }
	  public void SetDeleteYesBtn() {
		  BtnYesDelete.click();
	  }
}
