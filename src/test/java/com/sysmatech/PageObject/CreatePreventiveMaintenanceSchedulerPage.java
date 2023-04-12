package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatePreventiveMaintenanceSchedulerPage {

WebDriver ldriver;
	
	public CreatePreventiveMaintenanceSchedulerPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);	
		
	}
	@FindBy(xpath =  "(//a[@href='#'])[7]")
	WebElement ClickPrevM;
	@FindBy(xpath="//a[normalize-space()=\"Scheduler\"]")
	WebElement ClickScheduler;
	@FindBy(xpath="//a[@class=\"btn btn-primary\"]")
	WebElement ClickAssetCreateBtn;
	@FindBy(xpath="//input[@id=\"name\"]")
	WebElement txtAuditName;
//	@FindBy(xpath="(//option[@value='589'])[1]")
//	WebElement ClickSelectAssetModel;
	@FindBy(xpath="(//option[@value='529'])[1]")
	WebElement ClickSelectAssetModel;
	@FindBy(xpath="//select[@name=\"assign_parameter[]\"]")
	WebElement ClickSelectAssignParameter;
	
	@FindBy(xpath="//div[5]//div[1]//select[1]")
	WebElement ClickSelectCompany;
	
	@FindBy(xpath="//option[normalize-space()=\"Rakesh11\"]")
	WebElement ClickSelectCompany1;
	

//	@FindBy(xpath="//option[normalize-space()=\"R1\"]")
//	WebElement ClickSelectLocation;
	@FindBy(xpath="(//option[@value='80'])[1]")
	WebElement ClickSelectLocation;
	
	
	
	@FindBy(xpath="//option[@value=\"Weekly\"]")
	WebElement ClickSelectauditFrequencyWeekly;
	
	@FindBy(xpath="(//input[@value='Mon'])[1]")
	WebElement ClickSelectauditFrequencyMonday;
	
	@FindBy(xpath= "//option[@value=\"Hourly\"]")
	WebElement ClickSelectAuditFrequencyHours;
	@FindBy(xpath = "(//option[@value='1'][normalize-space()='1'])[1]")
	WebElement ClickSelectEachHours;
	
	@FindBy(xpath = "(//input[@value='recur_specific'])[1]")
	WebElement ClickSelectRecurs_Specific_HoursOption;
	@FindBy(xpath = "(//input[@value='1'])[1]")
	WebElement ClickSelectRecurs_Sp_Hours;
	
	@FindBy(xpath= "//option[@value=\"Daily\"]")
	WebElement ClickSelectAuditFrequencyDaily;
	
	@FindBy(xpath= "(//option[@value='Monthly'])[1]")
	WebElement ClickSelectAuditFrequencyMonthly;
	@FindBy(xpath= "(//option[@value='15'][normalize-space()='15'])[2]")
	WebElement ClickSelectAuditFrequencyMonthlyDay;
	
//	@FindBy(xpath = "")
//	WebElement 
	
	Select s1;
	
	@FindBy(xpath= "(//option[@value='Bi-annually'])[1]")
	WebElement ClickSelectAuditFrequencyBiAnnualy;
	
	@FindBy(xpath= "(//option[@value='Quarterly'])[1]")
	WebElement ClickSelectAuditFrequencyQuaterly;
	
	@FindBy(xpath="(//option[@value='Yearly'])[1]")
	WebElement ClickSelectAuditFrequancyYearly;
	
	
	@FindBy(xpath="//input[@id=\"audit_frequency\"]")
	WebElement txtauditEvery;
	@FindBy(xpath="//input[@id=\"ideal_start_date\"]")
	WebElement ClickSelectAStartDate;
	
	@FindBy(xpath="//input[@id=\"ideal_end_date\"]")
	WebElement ClickSelectAEndDate;
	
	@FindBy(xpath="//input[@id=\"complete_work_order_within_days\"]")
	WebElement ClickSelectWithinDay;
	@FindBy(xpath="//input[@name=\"complete_work_order_within_hours\"]")
	WebElement ClickSelectWithinHours;
	@FindBy(xpath="//input[@name=\"complete_work_order_within_minutes\"]")
	WebElement ClickSelectWithinMinute;
	
	@FindBy(xpath="//input[@id=\"expire_workorder_after_day\"]")
	WebElement ClickSelectExpireDay;
	@FindBy(xpath="//input[@id=\"expire_workorder_after_hours\"]")
	WebElement ClickSelectExpireHours;
	@FindBy(xpath="//input[@id=\"expire_workorder_after\"]")
	WebElement ClickSelectExpireMinute;
	
	@FindBy(xpath="//button[contains(text(),\"Save\")]")
	WebElement ClickSaveBtn;
	@FindBy(xpath="(//a[@class='btn btn-link text-left'][normalize-space()='Cancel'])[2]")
	WebElement BtnCancel;
	
	
	public void SetPrevM() throws InterruptedException
	{
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		ClickPrevM.click();
		ClickScheduler.click();
		ClickAssetCreateBtn.click();
		
	}
	public void SetauditName(String Aname)
	{
		txtAuditName.sendKeys(Aname);
		
		
	}
	public void SetAssetModel(){
		ClickSelectAssetModel.click();
	}
	public void SetAssignparameter() {
		 s1= new Select(ClickSelectAssignParameter);
		s1.selectByVisibleText("Automation");  //"Automation"

	}
	public void SetSelectCompany() {
	
		ClickSelectCompany1.click();
		ClickSelectLocation.click();
		
	}
	public void SetLocation() {
	 ClickSelectLocation.click();
	}
	public void SetAuditFequencyWeekly() {
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,150)", "");
		ClickSelectauditFrequencyWeekly.click();
		ClickSelectauditFrequencyMonday.click();
		
	}
	public void SetAuditFequencyDaily() {
		ClickSelectAuditFrequencyDaily.click();
		
	}
	public void SetAuditFequencyMonthly() {
		ClickSelectAuditFrequencyMonthly.click();
		ClickSelectAuditFrequencyMonthlyDay.click();
		
	}
	public void SetAuditFequencyQuaterly() {
		ClickSelectAuditFrequencyQuaterly.click();
		
	}
	public void SetAuditFequencyBiAnnually() {
		ClickSelectAuditFrequencyBiAnnualy.click();
		
	}
	public void SetAuditFequencyHoursly() {
		ClickSelectAuditFrequencyHours.click();
		
		
	}
	public void SetAuditFequencyEachHours() {
		ClickSelectEachHours.click();
	}
	public void SetAuditFequencyRecursSpecificHoursHours() {
		ClickSelectRecurs_Specific_HoursOption.click();
		ClickSelectRecurs_Sp_Hours.click();
	}
	public void SetAuditFequencyYearly() {
		ClickSelectAuditFrequancyYearly.click();
	}
	public void SetauditEvery(String Avalue) {
		ClickSelectLocation.click();
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,350)", "");
		
		txtauditEvery.sendKeys(Avalue);
		
	}
	public void SetAuditStartDate(String Sdate, String Timestamp1) throws InterruptedException {
		Thread.sleep(4000);
		ClickSelectAStartDate.sendKeys(Sdate);
		ClickSelectAStartDate.sendKeys(Keys.TAB);
		ClickSelectAStartDate.sendKeys(Timestamp1);
	}
	
	public void SetAuditEndDate(String Edate,String Timestamp2) throws InterruptedException {
		Thread.sleep(4000);
		ClickSelectAEndDate.sendKeys(Edate);
		ClickSelectAEndDate.sendKeys(Keys.TAB);
		ClickSelectAEndDate.sendKeys(Timestamp2);
	}
	
	public void SetWithinOrder(String Wday,String WHours, String WMinute) {
		ClickSelectWithinDay.sendKeys(Wday);
	    ClickSelectWithinHours.sendKeys(WHours);
	    ClickSelectWithinMinute.sendKeys(WMinute);
		
	}
	public void SetExpireOrder(String Wday,String WHours, String WMinute) {
		ClickSelectExpireDay.sendKeys(Wday);
	    ClickSelectExpireHours.sendKeys(WHours);
	    ClickSelectExpireMinute.sendKeys(WMinute);
		
	}
	public void SetClickSaveBtn() {
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,150)", "");
		
		ClickSaveBtn.click();
	}
	public void SetClickCancelBtn() {
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,150)", "");
		 BtnCancel.click();
		
	}
	
	

	
	
	
}
