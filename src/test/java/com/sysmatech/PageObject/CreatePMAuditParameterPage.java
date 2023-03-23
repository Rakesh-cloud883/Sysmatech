package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePMAuditParameterPage {
	
WebDriver ldriver;
	
	public CreatePMAuditParameterPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);	
		
	}
	@FindBy(xpath =  "(//a[@href='#'])[7]")
	WebElement ClickPrevM;
	@FindBy(xpath =  "(//a[normalize-space()='Parameters Master'])[1]")
	WebElement ClickPrevMBtn2;
	@FindBy(xpath =  "(//a[@class='btn btn-primary'])[1]")
	WebElement BtnCreate;
	@FindBy(xpath =  "(//input[@id='audit_params_name'])[1]")
	WebElement TxtAuditParaName;
	@FindBy(xpath =  "(//option[@value='321'])[1]")
	WebElement ClickSelectModel;
//	@FindBy(xpath =  "(//option[@value='590'])[1]")  //Kamlesh bhai model 
//	WebElement ClickSelectModel;
	@FindBy(xpath =  "(//option[normalize-space()='Active'])[1]")
	WebElement ClickSelectStatus;
	@FindBy(xpath =  "//select[@name=\"camera_photos\"]//option[@value=\"0\"][normalize-space()=\"Not Required\"]")
	WebElement ClickselectphotonotRequired;
	@FindBy(xpath =  "(//option[@value='0'][normalize-space()='Not Required'])[2]")
	WebElement ClickselectCommentnotRequired;
	
	@FindBy(xpath =  "(//option[@value='3'][normalize-space()='None'])[1]")
	WebElement ClickselectphotonotRequiredNone;
	@FindBy(xpath =  "(//option[@value='3'][normalize-space()='None'])[2]")
	WebElement ClickselectCommentnotRequiredNone;
	
	@FindBy(xpath =  "(//button[contains(text(),'Save')])[1]")
	WebElement BtnSave;
	
	public void SetPrevM() throws InterruptedException
	{
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		ClickPrevM.click();
		ClickPrevMBtn2.click();		
		
	}
	public void SetCreateBtn() {
		BtnCreate.click();
		
	}
	public void SetCollectionName(String name) {
		TxtAuditParaName.sendKeys(name);
	}
	public void SetSelectModel() {
		ClickSelectModel.click();
	}
	public void SetStatus() {
		ClickSelectStatus.click();	
	}
	public void SetPhotoNotRequired() {
		ClickselectphotonotRequired.click();	
	}
	public void SetCommentNotRequired() {
		ClickselectCommentnotRequired.click();	
	}
	public void SetPhotoNone() {
		ClickselectphotonotRequiredNone.click();
	}
	public void SetcommentNone() {
		ClickselectCommentnotRequiredNone.click();
		
	}
	public void SetSave() {
	
		BtnSave.click();
		
	}
	
	
}
