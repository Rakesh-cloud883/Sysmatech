package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_Preventive_Maintenance_ConfigPage {
WebDriver ldriver;
	
    public Settings_Preventive_Maintenance_ConfigPage(WebDriver rdriver)
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
    @FindBy(xpath ="(//a[@class='btn btn-primary'])[1]" )
    WebElement BtnCreate;
    @FindBy(xpath = "(//input[@id='assignment_name'])[1]")
    WebElement TxtAssignmentName;
    @FindBy(xpath = "(//option[@value='262'])[1]")
    WebElement ClickSelectAssignmentCategory;
    @FindBy(xpath = "(//input[@name='models[]'])[1]")
    WebElement ClickAssignmentModels;
    @FindBy(xpath = "(//option[normalize-space()='Parola'])[1]")
    WebElement ClickSelecteLocation;
    @FindBy(xpath="(//option[@value='38'])[1]")
    WebElement ClickSelectGroup;
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
	  public void SetCreateBtn() {
		  BtnCreate.click();
	  }
	  public void SetAssignmentName(String name) {
		  
		  TxtAssignmentName.sendKeys(name);
	  }
	  public void SetSelectassignmentCategory() {
		  ClickSelectAssignmentCategory.click();
		  
	  }
	  public void SetAssignmentModel() {
		  JavascriptExecutor js=(JavascriptExecutor)ldriver;
		  js.executeScript("window.scrollBy(0,350)", "");
		  ClickAssignmentModels.click();
	  }
	  public void SetAssignmentLocation() {
		  ClickSelecteLocation.click();
	  }
	  public void SetSelectUserGroup() {
		  ClickSelectGroup.click();
	  }
	  public void SetStatus() {
		  ClickSelectStatus.click();
	  }
	  public void SetSaveBtn() {
		  BtnSave.click();
	  }
}
