package com.sysmatech.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Asset_CreateAssetPage {

WebDriver ldriver;
	
	public Asset_CreateAssetPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath =  "//a[contains(.,'Create New')]")
	WebElement btnassets;
	@FindBy(xpath = "(//a[@href='https://qa.sysmatech.com/public/hardware/create'])[1]")
	WebElement btnasset;
	
	@FindBy(xpath   = "//span[@class='select2-selection__rendered needsclick'][contains(@id,'select-container')][contains(.,'Select Company')]")
	WebElement btnselectcompany;
	@FindBy(xpath = "//input[contains(@class,'select2-search__field')]")
	WebElement txtselectcompany;
	@FindBy(xpath = "//*[@id=\"select2-company_select-results\"]/li[1]/div")
	WebElement txtselectcompany1;
	
	@FindBy(id = "asset_tag")   //   //input[contains(@id,'asset_tag')]
	WebElement assetTag;
	@FindBy(id = "serials[1]")   //  //input[contains(@name,'serials[1]')]
	WebElement assetSeries;
	
	@FindBy(xpath = "//span[@class='select2-selection__rendered needsclick'][contains(@id,'id-container')][contains(.,'Select a Model')]")
	WebElement selectModel;
	@FindBy(xpath = "//input[contains(@class,'select2-search__field')]")
	WebElement txtselectModel;
	@FindBy(xpath = "//*[@id=\"select2-model_select_id-results\"]/li[1]/div")
	WebElement txtselectModel1;
	@FindBy(xpath = "//*[@id=\"select2-model_select_id-results\"]/li[2]/div/div[2]")
	WebElement txtselectModel12;
	
	@FindBy(xpath ="//span[@class='select2-selection__rendered needsclick'][contains(@id,'id-container')][contains(.,'Select Status')]")
	WebElement selectStatus;
	@FindBy(xpath = "//input[contains(@class,'select2-search__field')]")
	WebElement txtselectStatus;
	@FindBy(xpath = "//*[@id=\"select2-status_select_id-results\"]/li[1]")
	WebElement ClickStatus;
	
	@FindBy(xpath = "//span[contains(@id,'select2-assigned_user_select-container')]")
	WebElement ClickcheckoutUser;
	@FindBy(xpath = "//input[contains(@class,'select2-search__field')]")
	WebElement txtcheckoutUserName;
	@FindBy(xpath = "(//div[contains(@class,'clearfix')])[1]")
	WebElement ClickcheckoutUserName;
	
	@FindBy(xpath = "(//label[contains(.,'Asset')])[3]")
	WebElement ClickcheckoutAssetBtn;
	@FindBy(xpath = "//span[contains(@id,'select2-assigned_asset_select-container')]")
	WebElement clickcheckoutasset;
	@FindBy(xpath = "//input[contains(@class,'select2-search__field')]")
	WebElement txtcheckoutAssetName;
	@FindBy(xpath = "(//div[contains(@class,'clearfix')])[1]")
	WebElement ClickcheckoutAssetName;
	
	@FindBy(xpath = "//label[@class='btn btn-default'][contains(.,'Location')]")
	WebElement ClickcheckoutLocationBtn;

	
	@FindBy(id = "name")   ////input[contains(@id,'name')]
	WebElement txtAssetname;
	@FindBy(xpath = "//input[@type='text'][contains(@id,'date')]")
	WebElement selectcelenderData;
	
	@FindBy(xpath = "//*[@id=\"select2-supplier_select-container\"]")
	WebElement btnselectSupplier;
	@FindBy(xpath = "/html[1]/body[1]/span[1]/span[1]/span[1]/input[1]")
	WebElement txtselectSupplier;
	@FindBy(xpath = "(//div[contains(@class,'clearfix')])[1]")
	WebElement txtselectSupplier1;
	
	@FindBy(id = "order_number")  ////input[@class='form-control'][contains(@id,'number')]
	WebElement txtOrderNo;
	@FindBy(id = "purchase_cost")    ////input[@class='form-control'][contains(@id,'cost')]
	WebElement txtPurchaseCost;
	
	@FindBy(id  = "warranty_months")
	WebElement selectworranty;
	
	@FindBy(id = "notes")   // //textarea[contains(@id,'notes')]
	WebElement txtNote;
	
	@FindBy(xpath = "(//span[@role='presentation'])[7]")
	WebElement btnselectLocation;
	@FindBy(xpath = "//input[contains(@class,'select2-search__field')]")
	WebElement txtselectLocation;
	@FindBy(xpath = "(//div[contains(@class,'clearfix')])[1]")
	WebElement txtselectLocation1;
	

	@FindBy(xpath = "(//button[@class='btn btn-primary' or  @fdprocessedid='nvij6v'])[1]")   //(//i[@class='fa fa-check icon-white'])[2]
	WebElement btnSubmiSave;
	@FindBy(xpath = "(//a[@class='btn btn-link text-left'][normalize-space()='Cancel'])[2]")
	WebElement BtnCancel;
	
	
	public void SetAssets() throws InterruptedException
	{
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		btnassets.click();
		btnasset.click();	
	}
	public void Setselectcompany(String value) throws InterruptedException
   {
		btnselectcompany.click();
		txtselectcompany.sendKeys(value);
		Thread.sleep(2000);
		txtselectcompany1.click();

		
    }
	public void setAssetTag(String tag) throws InterruptedException
	{   Thread.sleep(3000);
		assetTag.clear();
		assetTag.sendKeys(tag);
	}
	public void setSeries(String series) throws InterruptedException
	{   
		
		Thread.sleep(1000);
		assetSeries.sendKeys(series);
	}
	public void setSelectModel(String Mname) throws InterruptedException
	{
		selectModel.click();
		txtselectModel.sendKeys(Mname);
		Thread.sleep(2000);
		txtselectModel1.click();

		
	}
	public void setselectStatus(String status) throws InterruptedException //String status
	{
		
		

		selectStatus.click();
		txtselectStatus.sendKeys(status);
		ClickStatus.click();

		
	}
	
	public void setCheckoutUser(String Uname) throws InterruptedException
	{  
		ClickcheckoutUser.click();
		txtcheckoutUserName.sendKeys(Uname);
		ClickcheckoutUserName.click();
		
	}
	public void setCheckoutAsset(String Aname) throws InterruptedException
	{  
		ClickcheckoutAssetBtn.click();
		clickcheckoutasset.click();
		txtcheckoutAssetName.sendKeys(Aname);
		ClickcheckoutAssetName.click();
		
	}

	public void setAssetName(String Aname) throws InterruptedException
	{
		Thread.sleep(1000);
		txtAssetname.sendKeys(Aname);
	}
	public void setCelenderDate(String CData) throws InterruptedException
	{
		Thread.sleep(3000);
		selectcelenderData.sendKeys(CData);
	}
	public void setSelectSupplier(String Sname) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		btnselectSupplier.click();
		txtselectSupplier.sendKeys(Sname);
		Thread.sleep(2000);
		txtselectSupplier1.click();

	}
	public void setOrderNo(String Ono)
	{
		txtOrderNo.sendKeys(Ono);
	}
	public void setPurchaseCost(String PCost) throws InterruptedException
	{
		Thread.sleep(1000);
		txtPurchaseCost.sendKeys(PCost);
	}
	public void setWarranty(String warranty) throws InterruptedException
	{
		Thread.sleep(1000);
		selectworranty.sendKeys(warranty);
	}
	public void setNote(String note) throws InterruptedException
	{
		Thread.sleep(1000);
		txtNote.sendKeys(note);
	}
	public void setSelectLocation(String loc) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,850)", "");
		btnselectLocation.click();
		txtselectLocation.sendKeys(loc);
		Thread.sleep(2000);
		txtselectLocation1.click();

	}
//	public void setClickRequestBtn()
//	{
//		ClickBtnRequest.click();
//	}
	public void setClickSubmit()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		btnSubmiSave.click();
	}
	public void SetCancelBtn()
	{
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		BtnCancel.click();
	}
	
	
	
	
}
