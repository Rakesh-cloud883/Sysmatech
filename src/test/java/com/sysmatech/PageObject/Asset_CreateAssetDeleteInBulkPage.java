package com.sysmatech.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Asset_CreateAssetDeleteInBulkPage {
	
WebDriver ldriver;
	
	public Asset_CreateAssetDeleteInBulkPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath =  "/html[1]/body[1]/div[1]/aside[1]/section[1]/ul[1]/li[4]")
	WebElement btnAssert;
	@FindBy(xpath =  "(//a[normalize-space()='List All'])[1]")
	WebElement btnAssertList;
	
	@FindBy(xpath =  "(//span[@role='presentation'])[1]")
	WebElement ClickDeleteDropdown;
	@FindBy(xpath =  "//input[@role=\"searchbox\"]")
	WebElement txtDeleteDropdown;
	@FindBy(xpath =  "/html/body/span/span/span[2]/ul/li")
	WebElement ClickDeleteDropdown1;
	
	@FindBy(xpath =  "(//input[@placeholder='Search'])[1]")
	WebElement BtnSearch;
	@FindBy(xpath =  "(//input[@name='btSelectItem'])[1]")
	WebElement SelectDeleteItem;
	@FindBy(xpath =  "(//input[@name='btSelectItem'])[3]")
	WebElement SelectDeleteItem1;
	@FindBy(xpath =  "(//button[normalize-space()='Go'])[1]")
	WebElement ClickGo;
	@FindBy(xpath =  "(//button[normalize-space()='Delete'])[1]")
	WebElement ClickConfDeletebtn;
	@FindBy(xpath =  "(//a[normalize-space()='Cancel'])[1]")
	WebElement ClickCancelbtn;
	
	public void SetAssetbtn() throws InterruptedException {

		btnAssert.click();
		btnAssertList.click();
	
	}
	public void setDeleteBtn(String Dvalue) throws InterruptedException
	{
		ClickDeleteDropdown.click();
		txtDeleteDropdown.sendKeys(Dvalue);
		Thread.sleep(2000);
		ClickDeleteDropdown1.click();
		
	}
	public void SetSearchBtn(String sname) throws InterruptedException {
		BtnSearch.clear();
		Thread.sleep(2000);
		BtnSearch.sendKeys(sname);
	}

	public void SetclickDelete() throws InterruptedException {
		Thread.sleep(3000);
		SelectDeleteItem.click();
		ClickGo.click();
		
	}
	public void SetConfDelete() {
		ClickConfDeletebtn.click();
	}
	public void SetCancelBtn() {
		ClickCancelbtn.click();
	}
}
