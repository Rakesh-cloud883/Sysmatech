package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_Preventive_Maintenance_ConfigUpdatePage {
WebDriver ldriver;
	
    public Settings_Preventive_Maintenance_ConfigUpdatePage(WebDriver rdriver)
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
    @FindBy(xpath = "(//a[@title='Update'])[1]")
    WebElement UpdateBtn;
    @FindBy(xpath = "(//input[@id='assignment_name'])[1]")
    WebElement TxtAssignMentName;
    @FindBy(xpath="(//option[@value='279'])[1]")
    WebElement ClickSelectAssignmentCategory;
    @FindBy(xpath = "(//input[@name='models[]'])[1]")
    WebElement ClickAssignmentModel;
    @FindBy(xpath = "(//option[normalize-space()='Parola'])[1]")
    WebElement ClickSelectAssignmentLocation;
    @FindBy(xpath = "(//option[@value='38'])[1]")
    WebElement ClickSelectAssignGroup;
    @FindBy(xpath = "(//option[normalize-space()='Published'])[1]")
    WebElement ClickSelectStatus;
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
	  public void SetUpdateBtn() {
		  UpdateBtn.click();
	  }
	  public void SetAssignmentName(String name) {
		  JavascriptExecutor js=(JavascriptExecutor)ldriver;
		  js.executeScript("window.scrollBy(0,750)", "");
		  TxtAssignMentName.clear();
		  TxtAssignMentName.sendKeys(name);
	  }
	  public void SetAssignmentCategory() {
		      
		  ClickSelectAssignmentCategory.click();
		  ClickSelectAssignmentCategory.click();
	  }     
	  public void SetAssignmentModel() {
		  
		  ClickAssignmentModel.click();
		  ClickAssignmentModel.click();
		  
	  }
	  public void SetLocation() {
		 ClickSelectAssignmentLocation.click();
		 ClickSelectAssignmentLocation.click();
		  
	  }
	  public void SetUserGroup() {
		
		  ClickSelectAssignGroup.click(); 
	  }
	  public void SetStatus() {
		 
		  ClickSelectStatus.click(); 
	  }
	  public void SetSaveBtn() {
		 JavascriptExecutor js=(JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,750)", "");
		  BtnSave.click();
		                 
	  }
}
