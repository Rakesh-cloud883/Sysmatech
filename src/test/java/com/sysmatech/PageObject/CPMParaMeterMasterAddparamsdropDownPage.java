package com.sysmatech.PageObject;

import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CPMParaMeterMasterAddparamsdropDownPage {
WebDriver ldriver;
	
	public CPMParaMeterMasterAddparamsdropDownPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);	
		
	}
	@FindBy(xpath =  "(//a[@href='#'])[7]")
	WebElement ClickPrevM;
	@FindBy(xpath =  "(//a[normalize-space()='Parameters Master'])[1]")
	WebElement ClickPrevMBtn2;
	@FindBy(xpath=" (//a[contains(text(),'AddParams')])[1]")
	WebElement ClickAddParam;
	@FindBy(xpath=" (//input[@id='param_disp_name'])[1]")
	WebElement TxtName;
	
	@FindBy(xpath=" (//option[@value='Number'])[1]")
	WebElement ClickNumber;
	@FindBy(xpath=" (//option[@value='Drop-down'])[1]")
	WebElement ClickDropDown;
	@FindBy(xpath=" (//option[@value='Text'])[1]")
	WebElement ClickText;
	@FindBy(xpath=" (//option[@value='Date'])[1]")
	WebElement ClickDate;
	
	@FindBy(xpath=" (//input[@id='ddkey'])[1]")
	WebElement TxtKey;
	@FindBy(xpath=" (//input[@id='ddvalue'])[1]")
	WebElement TxtValue;
	
	@FindBy(xpath="(//a[@onclick='addOption()'])[1]")
	WebElement BtnAddOption;                                            //alert present
	@FindBy(xpath="(//a[@onclick='addRemoveOption()'])[1]")
	WebElement BtnRemoveOption; 
	
	@FindBy(xpath="(//input[@id='Optional'])[1]")
	WebElement ClickPhotoOptional;
	@FindBy(xpath="(//input[@id='Required'])[1]")
	WebElement ClickPhotoRequired;
	@FindBy(xpath="(//input[@id='NotRequired'])[1]")
	WebElement ClickPhotoNotRequired;
	
	@FindBy(xpath="(//input[@id='Optional1'])[1]")
	WebElement ClickCommentOptional;
	@FindBy(xpath="(//input[@id='Required1'])[1]")
	WebElement ClickCommentRequired;
	@FindBy(xpath="(//input[@id='NotRequired1'])[1]")
	WebElement ClickCommentNotRequired;
	
	@FindBy(xpath="(//select[@id='selectReject'])[1]")
	WebElement ClickSelectRejectValue;
	
	@FindBy(xpath="/html/body/div[1]/div/section[2]/div[2]/div/section[2]/div[2]/div/div/form/div/div[2]/div[5]/div[2]/div[2]/div/select/option[2]")
	WebElement ClickRejectValueYes;
	@FindBy(xpath="/html/body/div[1]/div/section[2]/div[2]/div/section[2]/div[2]/div/div/form/div/div[2]/div[5]/div[1]/div[1]/select/option[3]")
	WebElement ClickRejectValueNo;
	@FindBy(xpath="(//a[@href='#'][normalize-space()='AddOption'])[2]")
	WebElement BtnAddOption1; 
	@FindBy(xpath="(//a[@href='#'][normalize-space()='RemoveOption'])[2]")
	WebElement BtnRemoveOption1; 
	
	@FindBy(xpath="(//option[@value='Yes'][normalize-space()='Yes'])[3]")
	WebElement ClickAcceptValueYes;
	@FindBy(xpath="(//option[@value='No'][normalize-space()='No'])[3]")
	WebElement ClickAcceptValueNo;
	@FindBy(xpath="(//a[@href='#'][normalize-space()='AddOption'])[2]")
	WebElement BtnAddOption2; 
	@FindBy(xpath="(//a[@href='#'][normalize-space()='RemoveOption'])[2]")
	WebElement BtnRemoveOption2; 
	
	@FindBy(xpath="(//button[contains(text(),'Save')])[1]")
	WebElement BtnSave; 
	
	
	


	public void SetPrevM() throws InterruptedException
	{
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		ClickPrevM.click();
		ClickPrevMBtn2.click();		
		
	}
	
	public void SetAddparam() {
		ClickAddParam.click();
	}
	
	public void SetName(String name) {
		TxtName.sendKeys(name);
	}
	public void SetNumber() {
		ClickNumber.click();
	}
	public void SetDropDown() {
		ClickDropDown.click();
	}
	public void SetText() {
		ClickText.click();
	}
	public void SetDate() {
		ClickDate.click();
	}
	public void SetKey1(String a) {
		TxtKey.sendKeys("a");
	}
	public void SetValue(String b) {
		TxtValue.sendKeys(b);
	}
	public void SetAddOption(){
		BtnAddOption.click();
		Alert alert=ldriver.switchTo().alert();
		alert.accept();
	}
	public void SetRemoveOption(){
		
		BtnRemoveOption.click();
		Alert alert=ldriver.switchTo().alert();
		alert.accept();
	}
	
	public void SetPhotoRequired() {
		ClickPhotoRequired.click();
	}
	public void SetPhotoNotRequired() {
		ClickPhotoNotRequired.click();
	}
	public void SetPhotoOptional() {
		ClickPhotoOptional.click();
	}
	public void SetCommentRequired() {
		ClickCommentRequired.click();
	}
	public void SetCommentNotRequired() {
		ClickCommentNotRequired.click();
	}
	public void SetCommentOptional() {
		ClickCommentOptional.click();
	}
	public void SetRejectYes() {
		ClickSelectRejectValue.click();
		ClickRejectValueYes.click();
	}
	public void SetRejectNo() {
		ClickSelectRejectValue.click();
		ClickRejectValueNo.click();
	}
	
	public void SetAddOption1() {
		
		BtnAddOption1.click();
		Alert alert=ldriver.switchTo().alert();
		alert.accept();
	}
	public void SetRemoveOption1(){
		BtnRemoveOption1.click();
		Alert alert=ldriver.switchTo().alert();
		alert.accept();
	}
	public void SetAcceptYes() {
		ClickAcceptValueYes.click();
	}
	public void SetAcceptNo() {
		ClickAcceptValueNo.click();
	}
	public void SetAddOption2() {
		BtnAddOption2.click();
		Alert alert=ldriver.switchTo().alert();     
		alert.accept();
	}
	public void SetRemoveOption2(){
		BtnRemoveOption2.click();
		Alert alert=ldriver.switchTo().alert();
		alert.accept();
	}
	public void SetSave() {
		BtnSave.click();
	}
}
