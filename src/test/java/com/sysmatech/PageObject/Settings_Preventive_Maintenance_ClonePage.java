package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_Preventive_Maintenance_ClonePage {

WebDriver ldriver;
	
    public Settings_Preventive_Maintenance_ClonePage(WebDriver rdriver)
        {
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);	
			
		  }
    @FindBy(xpath = "(//a[@class='sidebar-toggle btn btn-white'])[1]")
    WebElement BtnMenu;
	@FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
	WebElement btnsetting;
    @FindBy(xpath = "(//a[normalize-space()='Preventive Maintenance Config'])[1]")
    WebElement BtnPMConfig;
    @FindBy(xpath = "(//a[@title='Clone Item'])[1]")
    WebElement BtnClone;
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
	  public void SetPreventiveMaintenanceConfig() {
		  JavascriptExecutor js= (JavascriptExecutor)ldriver;
		  js.executeScript("window.scrollBy(0,350)", "");
		  BtnPMConfig.click();
	  }
	  public void SetCloneBtn() {      
		  BtnClone.click();
		  
	  }
    public void SetSave() {
    	JavascriptExecutor js=(JavascriptExecutor)ldriver;
    	js.executeScript("window.scrollBy(0,750)", "");
    	BtnSave.click();
    }
}
