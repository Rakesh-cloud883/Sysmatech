package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_CustomFieldsCreatePage {
WebDriver ldriver;
	
	 public Settings_CustomFieldsCreatePage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 @FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
		WebElement btnsetting;
	 @FindBy(xpath="(//a[normalize-space()='Custom Fields'])[1]")
	 WebElement BtnCustomFields;
	 @FindBy(xpath="(//input[@id='name'])[1]")
	 WebElement TxtFieldSetName;
	 @FindBy(xpath="//a[normalize-space()=\"New Fieldset\"]")
	 WebElement ClickNewFieldset;
	 @FindBy(xpath="(//button[normalize-space()='Save'])[1]")
	 WebElement BtnSave;
	
	 @FindBy(xpath="(//span[@role='presentation'])[1]")
	 WebElement ClickSelectAddNewFields; 
	 @FindBy(xpath="//input[@role=\"searchbox\"]")
	WebElement BtnSearchAddNewFields;
	
	 @FindBy(xpath="/html/body/span/span/span[2]/ul/li")
	 WebElement ClickSelectAddNewFields1; 
	 
	 @FindBy(xpath="(//ins[@class='iCheck-helper'])[1]")  //
	 WebElement ClickRequest; 
	 
	 @FindBy(name="order")  //(//input[@name='order'])[1]
	 WebElement TxtOrder;
	 
	 @FindBy(xpath="//button[normalize-space()=\"Save\"]")
	 WebElement ClickSave; 
	 @FindBy(xpath="//button[normalize-space()=\"Remove\"]")
	 WebElement RemoveBtn;
  public void SetSetting() throws InterruptedException
		{
			
			JavascriptExecutor js = (JavascriptExecutor)ldriver;
			 js.executeScript("window.scrollBy(0,350)", "");
			btnsetting.click();	
		}
	   
  public void SetCustomFieldsBtn()
	    {
		 BtnCustomFields.click();
	    }
	 
  public void SetCreateNewFieldset()
		{
			 ClickNewFieldset.click();
		 }
  public void SetFieldSetName(String Name)
       {
	  TxtFieldSetName.clear();
		TxtFieldSetName.sendKeys(Name);
	   }
  public void SetClickSave()
	   {
		BtnSave.click();
	   }
  public void SetSelectAddNewFields(String Sname) throws InterruptedException {   //String Sname
	  Thread.sleep(2000);
	  ClickSelectAddNewFields.click();
	 BtnSearchAddNewFields.sendKeys(Sname);
	  ClickSelectAddNewFields1.click(); 
    }
  public void SetRequest() {
		ClickRequest.click();
		
	}
  public void SetOrder(String order) throws InterruptedException {
	  TxtOrder.clear();
	  Thread.sleep(1000);
		TxtOrder.sendKeys(order);
		ClickSave.click();
  }
public void SetRemove() 
	{
	RemoveBtn.click();
	}
	
}

 