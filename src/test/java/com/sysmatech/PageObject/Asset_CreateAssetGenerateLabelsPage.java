package com.sysmatech.PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Asset_CreateAssetGenerateLabelsPage {
	
WebDriver ldriver;
	
	 public Asset_CreateAssetGenerateLabelsPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath =  "/html[1]/body[1]/div[1]/aside[1]/section[1]/ul[1]/li[4]")
	WebElement btnAssert;
	@FindBy(xpath =  "(//a[normalize-space()='List All'])[1]")
	WebElement btnAssertList;
	
	@FindBy(xpath =  "(//span[@role='presentation'])[1]")
	WebElement ClickGenLablsDropdown;
	@FindBy(xpath =  "//input[@role=\"searchbox\"]")
	WebElement txtGenLabelsDropdown;
	@FindBy(xpath =  "/html/body/span/span/span[2]/ul/li")
	WebElement ClickGenLablsDropdown1;
	
	@FindBy(xpath =  "(//input[@placeholder='Search'])[1]")
	WebElement SearchBtn;
	@FindBy(xpath =  "(//input[@name='btSelectItem'])[1]")
	WebElement SelectGenLablsItem;
	@FindBy(xpath =  "(//input[@name='btSelectItem'])[3]")
	WebElement SelectGenLablsItem1;
	@FindBy(xpath =  "//*[@id=\"assetsListingTable\"]/tbody/tr[2]/td[1]/label/input")
	WebElement SelectGenLablesItem2;
	@FindBy(xpath =  "(//button[normalize-space()='Go'])[1]")
	WebElement ClickGo;
	
	
	
	public void SetAssetbtn() throws InterruptedException {

		btnAssert.click();
		btnAssertList.click();
	
	}
	public void setGenLablesBtn(String Dvalue) throws InterruptedException  //String Dvalue
	{
		ClickGenLablsDropdown.click();
		txtGenLabelsDropdown.sendKeys(Dvalue);
		Thread.sleep(2000);
		ClickGenLablsDropdown1.click();
		
	}
	public void SetClickGenerateLables() throws InterruptedException {
		Thread.sleep(3000);
		SelectGenLablsItem.click();
		SelectGenLablsItem1.click();
		SelectGenLablesItem2.click();
		
		ClickGo.click();
	//	ClickCancelbtn.click();
		
	}
	
	



}
