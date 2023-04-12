package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Asset_CreateAssetBulkCheckOutPage {
	
	
WebDriver ldriver;
	
	public Asset_CreateAssetBulkCheckOutPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath =  "/html[1]/body[1]/div[1]/aside[1]/section[1]/ul[1]/li[4]")
	WebElement btnAssert;
	@FindBy(xpath =  "(//a[normalize-space()='List All'])[1]")
	WebElement btnAssertList;
	
	@FindBy(xpath =  "(//span[@role='presentation'])[1]")
	WebElement ClickBulkCheckOutDropdown;
	@FindBy(xpath =  "//input[@role=\"searchbox\"]")
	WebElement txtBulkCheckOutDropdown;
	@FindBy(xpath =  "/html/body/span/span/span[2]/ul/li")
	WebElement ClickBulkCheckOutDropdown1;
	
	@FindBy(xpath =  "(//input[@placeholder='Search'])[1]")
	WebElement SearchBtn;
	@FindBy(xpath =  "(//input[@name='btSelectItem'])[1]")
	WebElement SelectBulkCheckOutItem;
	@FindBy(xpath =  "(//input[@name='btSelectItem'])[3]")
	WebElement SelectBulkCheckOutItem1;
	@FindBy(xpath =  "//*[@id=\"assetsListingTable\"]/tbody/tr[2]/td[1]/label/input")
	WebElement SelectGenLablesItem2;
	@FindBy(xpath =  "(//button[normalize-space()='Go'])[1]")
	WebElement ClickGo;
	
	@FindBy(xpath =  "(//label[@class='btn btn-default'][normalize-space()='Asset'])[1]")
	WebElement ClickAsset;
	@FindBy(xpath =  "(//span[@role='presentation'])[2]")
	WebElement SelectAssetbtn;
	@FindBy(xpath =  "(//input[@role='searchbox'])[1]")
	WebElement txtAssetSelect;
	
	@FindBy(xpath =  "(//div[@class='clearfix'])[1]")
	WebElement ClickAssetBtn;
	
	
	@FindBy(xpath =  "(//span[@role='presentation'])[1]")
	WebElement ClickSearchUser;
	@FindBy(xpath =  "(//input[@role='searchbox'])[1]")
	WebElement txtSearchUser;
	@FindBy(xpath =  "(//div)[278]")
	WebElement ClickSearchUser2;
	
	@FindBy(xpath =  "(//input[@id='checkout_at'])[1]")
	WebElement ClickCheckOutDate;
	
	@FindBy(xpath =  "(//input[@id='expected_checkin'])[1]")
	WebElement ClickECheckOutDate;
	
	@FindBy(xpath =  "(//button[normalize-space()='Checkout'])[1]")
	WebElement ClickCheckOutBtn;
	
	@FindBy(xpath =  "(//a[normalize-space()='Cancel'])[1]")
	WebElement BtnCancel;
	
	
	
	
	public void SetAssetbtn() throws InterruptedException {

		btnAssert.click();
		btnAssertList.click();
	
	}
	public void setBulkCheckOutBtn(String Dvalue) throws InterruptedException
	{
		ClickBulkCheckOutDropdown.click();
		txtBulkCheckOutDropdown.sendKeys(Dvalue);
		Thread.sleep(2000);
		ClickBulkCheckOutDropdown1.click();
		
	}
   public void SetSearchBtn(String sname) throws InterruptedException {
	   Thread.sleep(3000);
	   SearchBtn.clear();
	   SearchBtn.sendKeys(sname);
   }

	public void SetClickBulkCheckOut() throws InterruptedException {
		Thread.sleep(3000);
		SelectBulkCheckOutItem.click();
//		SelectBulkCheckOutItem1.click();
//		SelectGenLablesItem2.click();
		
		
	}
	
	public void SetGoBtn() {
		ClickGo.click();
	}
	public void SetAssetSelect(String AssetValue)
	{
		ClickAsset.click();
		SelectAssetbtn.click();
	    txtAssetSelect.sendKeys(AssetValue);
	    ClickAssetBtn.click();
		
	}
	
	public void SetUserClick(String Uname) throws InterruptedException {
		ClickSearchUser.click();
		Thread.sleep(3000);
		txtSearchUser.sendKeys(Uname);
		Thread.sleep(3000);
		txtSearchUser.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		txtSearchUser.sendKeys(Keys.ENTER);
	
	}
	
	public void SetCheckOutDate(String Cdate) throws InterruptedException
	{ 
		Thread.sleep(3000);
		ClickCheckOutDate.sendKeys(Cdate);
	}
	public void SetCheckOutEDate(String Edate) throws InterruptedException
	{
		Thread.sleep(3000);
		ClickECheckOutDate.sendKeys(Edate);
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,450)", "");
		
	}
	public void SetCheckoutSubmitBtn() {
		ClickCheckOutBtn.click();
	}
	public void SetcancelBtn() {
		BtnCancel.click();
	}
	

}
