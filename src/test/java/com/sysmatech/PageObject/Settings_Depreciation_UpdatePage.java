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
	  @FindBy(xpath = "//a[contains(text(),'Depreciation')]")  //(//a[@href='https://qa.sysmatech.com/public/depreciations'])[1]
	  WebElement BtnDepreciation;
	  @FindBy(xpath = "(//a[@title='Update'])[1]") //
	  WebElement BtnUpdate;
	  @FindBy(id = "name") //(//input[@id='name'])[1]
	  WebElement TxtDepreciationName;
	  @FindBy(id = "months")  //(//input[@id='months'])[1]
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
		 js.executeScript("window.scrollBy(0,700)", "");  //750
		btnsetting.click();
	   }
	  public void SetDepreciationBtn() throws InterruptedException {
		  Thread.sleep(2000);
//		  JavascriptExecutor js=(JavascriptExecutor)ldriver;
//		  js.executeScript("window.scrollBy(0,250)", "");
		  BtnDepreciation.click();
	  }
	  public void SetUpdateBtn() throws InterruptedException {
		  Thread.sleep(3000);
		  BtnUpdate.click();
		  
	  }
	  public void SetDepreciationName(String name) {
		  TxtDepreciationName.clear();
		  TxtDepreciationName.sendKeys(name);
	  }
	  public void SetNumberOfMonth(String month) {
		  TxtNumberOfMonth.clear();
		  TxtNumberOfMonth.sendKeys(month);
	  }
	  public void SetMinimumValueafterDepreciation(String value) {
		  TxtMinimumValueafterDepreciation.clear();
		  TxtMinimumValueafterDepreciation.sendKeys(value);
	  }
	  public void SetSaveBtn() {
		  BtnSave.click();
	  }
	  
}
