package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_Depreciation_UpdatePage {

	WebDriver ldriver;
	
    public Settings_Depreciation_UpdatePage(WebDriver rdriver)
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
	  @FindBy(xpath = "(//a[@title='Update'])[1]")
	  WebElement BtnUpdate;
	  @FindBy(xpath = "(//input[@id='name'])[1]")
	  WebElement TxtDepreciationName;
	  @FindBy(xpath = "(//input[@id='months'])[1]")
	  WebElement TxtNumberOfMonth;
	  @FindBy(xpath = "(//input[@id='depreciation_min'])[1]")
	  WebElement TxtMinimumValueafterDepreciation;
	  @FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
	  WebElement BtnSave;
	  
	  
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
	  public void SetUpdateBtn() {
		  BtnUpdate.click();
		  
	  }
	  public void SetDepreciationName(String name) {
		  TxtDepreciationName.clear();
		  TxtDepreciationName.sendKeys(name);
	  }
	  public void SetNumberOfMonth(String month) {
		  TxtNumberOfMonth.sendKeys(month);
	  }
	  public void SetMinimumValueafterDepreciation(String value) {
		  TxtMinimumValueafterDepreciation.sendKeys(value);
	  }
	  public void SetSaveBtn() {
		  BtnSave.click();
	  }
	  
}
