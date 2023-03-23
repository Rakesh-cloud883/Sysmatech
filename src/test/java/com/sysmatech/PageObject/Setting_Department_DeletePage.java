package com.sysmatech.PageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Setting_Department_DeletePage {
	WebDriver ldriver;
	
	 public Setting_Department_DeletePage(WebDriver rdriver){
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);	
			
		}
	 @FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
	 WebElement btnsetting;
	 @FindBy(xpath="(//a[normalize-space()='Departments'])[1]")
	 WebElement BtnDepertment;
	 @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm delete-asset'])[1]")
	 WebElement BtnDelete;
	 @FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	 WebElement BtnYesDelete;


    public void SetSetting() throws InterruptedException
   {
	
	JavascriptExecutor js = (JavascriptExecutor)ldriver;
	 js.executeScript("window.scrollBy(0,350)", "");
	btnsetting.click();
   }
  public void SetDepertmentBtn() 
  {
     BtnDepertment.click();
   }
  public void SetDelete() {
	  BtnDelete.click();
	  BtnYesDelete.click();
	  
  }
}
