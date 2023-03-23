package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CPMParaMeterMasterNumberPage {
WebDriver ldriver;
	
	public CPMParaMeterMasterNumberPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);	
		
	}
	@FindBy(xpath =  "(//a[@href='#'])[7]")
	WebElement ClickPrevM;
	@FindBy(xpath =  "(//a[normalize-space()='Parameters Master'])[1]")
	WebElement ClickPrevMBtn2;
	@FindBy(xpath="(//input[@type='search'])[1]")
	WebElement BtnSearch;
	@FindBy(xpath=" (//a[contains(text(),'AddParams')])[1]")
	WebElement ClickAddParam;
	@FindBy(xpath=" (//input[@id='param_disp_name'])[1]")
	WebElement TxtName;
	
	@FindBy(xpath=" (//option[@value='Number'])[1]")
	WebElement ClickNumber;
	@FindBy(xpath=" (//input[@id='benchmark_range_low'])[1]")
	WebElement TxtBenchMarkRangLow;
	@FindBy(xpath="(//input[@id='benchmark_range_high'])[1]")
	WebElement TxtBenchMarkRangHigh;
	
	@FindBy(xpath="/html/body/div[1]/div/section[2]/div[2]/div/section[2]/div[2]/div/div/form/div/div[2]/div[4]/div[3]/div/div/div[1]/table/tbody/tr[2]/td[4]/input")
	WebElement ClickPhotoNotRequiredPassNum;
	@FindBy(xpath="/html/body/div[1]/div/section[2]/div[2]/div/section[2]/div[2]/div/div/form/div/div[2]/div[4]/div[3]/div/div/div[1]/table/tbody/tr[3]/td[4]/input")
	WebElement ClickCommentNotRequiredPassNum;
	
	@FindBy(xpath="/html/body/div[1]/div/section[2]/div[2]/div/section[2]/div[2]/div/div/form/div/div[2]/div[4]/div[3]/div/div/div[2]/table/tbody/tr[2]/td[3]/input")
	WebElement ClickPhotoRequiredFailNum;
	@FindBy(xpath="/html/body/div[1]/div/section[2]/div[2]/div/section[2]/div[2]/div/div/form/div/div[2]/div[4]/div[3]/div/div/div[2]/table/tbody/tr[3]/td[3]/input")
	WebElement ClickCommentRequiredFailNum;
	
	@FindBy(xpath="(//button[contains(text(),'Save')])[1]")
	WebElement BtnSave; 
	
	@FindBy(xpath=" (//option[@value='Text'])[1]")
	WebElement ClickText;
	@FindBy(xpath=" (//option[@value='Date'])[1]")
	WebElement ClickDate;
	
	public void SetPrevM() throws InterruptedException
	{
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		ClickPrevM.click();
		ClickPrevMBtn2.click();		
		
	}
	public void SetSearchBtn(String search) throws InterruptedException {  //search Btn Extra added for safety purpose
		Thread.sleep(1000);
		BtnSearch.clear();
		Thread.sleep(1000);
		BtnSearch.sendKeys(search);
	}
	
	public void SetAddparam() throws InterruptedException {
		Thread.sleep(3000);
		ClickAddParam.click();
	}
	
	
	public void SetName(String name) {
		TxtName.sendKeys(name);
	}
	public void SetNumber() {
		ClickNumber.click();
	}
	public void SetText() {
		ClickText.click();
	}
	public void SetDate() {
		ClickDate.click();
	}
	public void SetBenchMarklow(String L) {
		TxtBenchMarkRangLow.sendKeys(L);
	}
	public void SetBenchMarkHigh(String H) {
		TxtBenchMarkRangHigh.sendKeys(H);
	}
	public void SetPhotoNotRequiredPassNum() {
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scollBy(0,350)", "");
		ClickPhotoNotRequiredPassNum.click();
	}
	public void SetCommentNotRequirePassdNum() {
		ClickCommentNotRequiredPassNum.click();
	}
	public void SetPhotoRequiredFailNum() {
		ClickPhotoRequiredFailNum.click();
	}
	public void SetCommentRequireFailNum() {
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		ClickCommentRequiredFailNum.click();
	}
	public void SetSave() {
		BtnSave.click();
	}

}
