package com.sysmatech.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_EscalationMatrixPage {

	WebDriver ldriver;
	
	 public Settings_EscalationMatrixPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}   
	 
	    @FindBy(xpath = "(//a[@class='sidebar-toggle btn btn-white'])[1]")
	    WebElement ClickMenu;
	    @FindBy(xpath =  "//a[@href='#'][contains(.,'Settings')]")
		WebElement btnsetting;
	    @FindBy(xpath =  "//a[normalize-space()='Escalation Matrix Config']")
	  	WebElement btnEscalationMatrix;
	    @FindBy(xpath = "(//input[@type='search'])[1]")
	    WebElement btnSearch;
	    
	    @FindBy(xpath="//body[1]/div[1]/div[1]/section[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/a[2]")
	    WebElement updateBtn;
	    @FindBy(xpath="(//ins[@class='iCheck-helper'])[1]")
	    WebElement ClickActive;
	    
	    @FindBy(xpath="(//input[@name='levels[1][days]'])[1]")
	    WebElement txtLevel1Day;
	    @FindBy(xpath="(//input[@name='levels[1][hours]'])[1]")
	    WebElement txtLevel1Hours;
	    @FindBy(xpath="(//input[@name='levels[1][minutes]'])[1]")
	    WebElement txtLevel1Minutes;
	    
	    @FindBy(xpath="(//input[@role='searchbox'])[1]")
	    WebElement TxtEscalateTo1;
	    @FindBy(xpath="/html/body/span/span/span/ul")
	    WebElement EscalationToSelectUserL1;
	    @FindBy(xpath ="//body[1]/div[1]/div[1]/section[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/label[1]/div[1]/ins[1]")
	    WebElement ClickEmail;
	    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/label[1]/div[1]/ins[1]")
	    WebElement ClickNotification;
	    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/label[1]/div[1]/ins[1]")
	    WebElement ClickStatus;
	    
	    /////////-----------------------------//////
	    
	    @FindBy(xpath="(//input[@name='levels[2][days]'])[1]")
	    WebElement txtLevel2Day;
	    @FindBy(xpath="(//input[@name='levels[2][hours]'])[1]")
	    WebElement txtLevel2Hours;
	    @FindBy(xpath="(//input[@name='levels[2][minutes]'])[1]")
	    WebElement txtLevel2Minutes;
	    
	    @FindBy(xpath="(//span[@role='combobox'])[2]")
	    WebElement TxtEscalateTo2;
	    @FindBy(xpath="/html/body/span/span/span/ul")
	    WebElement EscalationToSelectUserL2;
	    @FindBy(xpath ="//body[1]/div[1]/div[1]/section[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[4]/div[1]/label[1]/div[1]/ins[1]")
	    WebElement ClickEmailL2;
	    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[5]/div[1]/label[1]/div[1]/ins[1]")
	    WebElement ClickNotificationL2;
	    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[6]/div[1]/label[1]/div[1]/ins[1]")
	    WebElement ClickStatusL2;
	    
	    ///////-----------------------------------------//////////////////
	    
	    @FindBy(xpath="(//input[@name='levels[3][days]'])[1]")
	    WebElement txtLevel3Day;
	    @FindBy(xpath="(//input[@name='levels[3][hours]'])[1]")
	    WebElement txtLevel3Hours;
	    @FindBy(xpath="(//input[@name='levels[3][minutes]'])[1]")
	    WebElement txtLevel3Minutes;
	    
	    @FindBy(xpath="(//span[@role='combobox'])[3]")
	    WebElement TxtEscalateTo3;
	    @FindBy(xpath="/html/body/span/span/span/ul")
	    WebElement EscalationToSelectUserL3;
	    @FindBy(xpath ="//body[1]/div[1]/div[1]/section[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[3]/td[4]/div[1]/label[1]/div[1]/ins[1]")
	    WebElement ClickEmailL3;
	    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[3]/td[5]/div[1]/label[1]/div[1]/ins[1]")
	    WebElement ClickNotificationL3;
	    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[3]/td[6]/div[1]/label[1]/div[1]/ins[1]")
	    WebElement ClickStatusL3;
	    
	    //////-------------------------------------------------------//////---------------------------------------------------//---------
	    @FindBy(xpath="(//input[@name='levels[4][days]'])[1]")
	    WebElement txtLevel4Day;
	    @FindBy(xpath="(//input[@name='levels[4][hours]'])[1]")
	    WebElement txtLevel4Hours;
	    @FindBy(xpath="(//input[@name='levels[4][minutes]'])[1]")
	    WebElement txtLevel4Minutes;
	    
	    @FindBy(xpath="(//span[@role='combobox'])[4]")
	    WebElement TxtEscalateTo4;
	    @FindBy(xpath="/html/body/span/span/span/ul")
	    WebElement EscalationToSelectUserL4;
	    @FindBy(xpath ="//body[1]/div[1]/div[1]/section[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[4]/td[4]/div[1]/label[1]/div[1]/ins[1]")
	    WebElement ClickEmailL4;
	    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[4]/td[5]/div[1]/label[1]/div[1]/ins[1]")
	    WebElement ClickNotificationL4;
	    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[4]/td[6]/div[1]/label[1]/div[1]/ins[1]")
	    WebElement ClickStatusL4;
	    
	    ////////////--------------------------------------------------------------------------------///////////////-------------------------------
	    @FindBy(xpath="(//input[@name='levels[5][days]'])[1]")
	    WebElement txtLevel5Day;
	    @FindBy(xpath="(//input[@name='levels[5][hours]'])[1]")
	    WebElement txtLevel5Hours;
	    @FindBy(xpath="(//input[@name='levels[5][minutes]'])[1]")
	    WebElement txtLevel5Minutes;
	    
	    @FindBy(xpath="(//span[@role='combobox'])[5]")
	    WebElement TxtEscalateTo5;
	    @FindBy(xpath="/html/body/span/span/span/ul")
	    WebElement EscalationToSelectUserL5;
	    @FindBy(xpath ="(//ins[@class='iCheck-helper'])[2]")
	    WebElement ClickEmailL5;
	    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/label[1]/div[1]/ins[1]")
	    WebElement ClickNotificationL5;
	    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[5]/td[6]/div[1]/label[1]/div[1]/ins[1]")
	    WebElement ClickStatusL5;
	    
	    //-----------------------------------------------///----------------------------------////------------
	    @FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
	    WebElement SaveBtn;
	    
	 
	 public void SetMenuClick() {
		 ClickMenu.click();
	 }
	 public void SetSetting() {
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,750)", "");
		 btnsetting.click();	 
	 }
	 public void SetEscalationMatrixBtn() throws InterruptedException {
		 Thread.sleep(3000);;
//		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
//		 js.executeScript("window.scrollBy(0,150)", "");
		 btnEscalationMatrix.click();
	 }
	 public void SetSearchBtn(String search) {
		 btnSearch.sendKeys(search);
	 }
	 
	 public void SetUpdateBtn() throws InterruptedException {
		 Thread.sleep(3000);
		 updateBtn.click();
	 }
	 
	 public void SetActiveClick() {
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,750)", "");
		 ClickActive.click();
	 }
	 public void SetLevel1Day(String day) { 
		 txtLevel1Day.clear();
		 txtLevel1Day.sendKeys(day);
	 }
	 public void SetLevel1Hours(String hours) throws InterruptedException {
		 Thread.sleep(3000);
		 txtLevel1Hours.clear();
		 Thread.sleep(1000);
		 txtLevel1Hours.sendKeys(hours);
	 }
	 public void SetLevel1Minutes(String min) throws InterruptedException {
		 txtLevel1Minutes.clear();
		 Thread.sleep(1000);
		 txtLevel1Minutes.sendKeys(min);
	 }
	 public void SetEscalationTo(String esca) throws InterruptedException {
		 TxtEscalateTo1.clear();
		 TxtEscalateTo1.sendKeys(esca);
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,50)", "");
		 Thread.sleep(2000);
		 EscalationToSelectUserL1.click();
	 }
	 public void SetEmail() {
		 ClickEmail.clear();
		 ClickEmail.click();
	 }
	 public void SetNotification() {
		 ClickNotification.clear();
		 ClickNotification.click();
	 }
	 public void SetStatusClick() {
		 ClickStatus.clear();
		 ClickStatus.click();
	 }
	 //--------------------------------------//-------------------------------------------------------////
	 public void SetLevel2Day(String L2day) { 
		 txtLevel2Day.clear();
		 txtLevel2Day.sendKeys(L2day);
	 }
	 public void SetLevel2Hours(String L2hours) {
		 txtLevel2Hours.clear();
		 txtLevel2Hours.sendKeys(L2hours);
	 }
	 public void SetLevel2Minutes(String L2min) {
		 txtLevel2Minutes.clear();
		 txtLevel2Minutes.sendKeys(L2min);
	 }
	 public void SetEscalationToL2(String L2esca) throws InterruptedException {
		 TxtEscalateTo2.sendKeys(L2esca);
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,50)", "");
		 Thread.sleep(2000);
		 EscalationToSelectUserL2.click();
	 }
	 public void SetEmailL2() {
		
		 ClickEmailL2.click();
	 }
	 public void SetNotificationL2() {
		 ClickNotificationL2.click();
	 }
	 public void SetStatusL2Click() {
		 ClickStatus.click();
	 }
	 
	 
	/////////------------------------------------------/////////---------------------/////
	 public void SetLevel3Day(String L3day) {
		 txtLevel3Day.clear();
		 txtLevel3Day.sendKeys(L3day);
	 }
	 public void SetLevel3Hours(String L3hours) {
		 txtLevel3Hours.clear();
		 txtLevel3Hours.sendKeys(L3hours);
	 }
	 public void SetLevel3Minutes(String L3min) {
		 txtLevel3Minutes.clear();
		 txtLevel3Minutes.sendKeys(L3min);
	 }
	 public void SetEscalationToL3(String L3esca) throws InterruptedException {
		 TxtEscalateTo3.sendKeys(L3esca);
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,150)", "");
		 Thread.sleep(2000);
		 EscalationToSelectUserL3.click();
	 }
	 public void SetEmailL3() {
		 ClickEmailL3.click();
	 }
	 public void SetNotificationL3() {
		 ClickNotificationL3.click();
	 }
	 public void SetStatusL3Click() {
		 ClickStatusL3.click();
	 }
	 
	 ////-----------------------------------------/////--------------------------------////--------------------------------
	 public void SetLevel4Day(String L4day) { 
		 txtLevel4Day.clear();
		 txtLevel4Day.sendKeys(L4day);
	 }
	 public void SetLevel4Hours(String L4hours) {
		 txtLevel4Hours.clear();
		 txtLevel4Hours.sendKeys(L4hours);
	 }
	 public void SetLevel4Minutes(String L4min) {
		 txtLevel4Minutes.clear();
		 txtLevel4Minutes.sendKeys(L4min);
	 }
	 public void SetEscalationToL4(String L4esca) throws InterruptedException {
		 TxtEscalateTo4.sendKeys(L4esca);
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,50)", "");
		 Thread.sleep(2000);
		 EscalationToSelectUserL4.click();
	 }
	 public void SetEmailL4() {
		 ClickEmailL4.click();
	 }
	 public void SetNotificationL4() {
		 ClickNotificationL4.click();
	 }
	 public void SetStatusL4Click() {
		 ClickStatusL4.click();
	 }
	 
	 ////-----------------------------------------/////--------------------------------////--------------------------------
	 ////-----------------------------------------/////--------------------------------////--------------------------------
	 public void SetLevel5Day(String L5day) { 
		 txtLevel5Day.clear();
		 txtLevel5Day.sendKeys(L5day);
	 }
	 public void SetLevel5Hours(String L5hours) {
		 txtLevel5Hours.clear();
		 txtLevel5Hours.sendKeys(L5hours);
	 }
	 public void SetLevel5Minutes(String L5min) {
		 txtLevel5Minutes.clear();
		 txtLevel5Minutes.sendKeys(L5min);
	 }
	 public void SetEscalationToL5(String L5esca) throws InterruptedException {
		 TxtEscalateTo5.sendKeys(L5esca);
		 JavascriptExecutor js = (JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,50)", "");
		 Thread.sleep(2000);
		 EscalationToSelectUserL5.click();
	 }
	 public void SetEmailL5() {
		 ClickEmailL5.click();
	 }
	 public void SetNotificationL5() {
		 ClickNotificationL5.click();
	 }
	 public void SetStatusL5Click() {
		 ClickStatusL5.click();
	 }
	 
	 ////-----------------------------------------/////--------------------------------////--------------------------------
	 
	 
	 public void SetSave() {
		 JavascriptExecutor js=(JavascriptExecutor)ldriver;
		 js.executeScript("window.scrollBy(0,150)", "");
		 SaveBtn.click();
	 }
	 
	 
}
