package com.sysmatech.PageObject;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImportPage {
	
WebDriver ldriver;
	
	public ImportPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath =  "//i[@class=\"fa fa-cloud-download\"]")
	WebElement btnImport;
	@FindBy(xpath =  "//span[@class=\"btn btn-primary fileinput-button\"]")
	WebElement btnSelectImport;
	@FindBy(xpath =  "//input[@id=\"fileupload\"]")
	WebElement btnSelectImport1;

	
	
	
	public void SetImportBtn() throws InterruptedException
	{
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,550)", "");
		btnImport.click();
		
	}
	
	public void SetSelectFileupload(String file) throws InterruptedException {
		btnSelectImport.click();
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		btnSelectImport1.sendKeys(file);
		
	
	}

}
