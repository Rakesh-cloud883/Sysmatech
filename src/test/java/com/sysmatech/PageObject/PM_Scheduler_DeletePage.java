package com.sysmatech.PageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PM_Scheduler_DeletePage {
WebDriver ldriver;
	
	public PM_Scheduler_DeletePage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);	
		
	}
	@FindBy(xpath =  "(//a[@href='#'])[7]")
	WebElement ClickPrevM;
	@FindBy(xpath="//a[normalize-space()=\"Scheduler\"]")
	WebElement ClickScheduler;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/a[4]")
	WebElement DeleteBtn;
	
	

   public void SetPrevM() throws InterruptedException
   {
	JavascriptExecutor js = (JavascriptExecutor)ldriver;
	 js.executeScript("window.scrollBy(0,350)", "");
	ClickPrevM.click();
	
   }
   public void SetSchedulerBtn()
  {
	ClickScheduler.click();
  }    
  public void SetDeleteBtn() {
	  DeleteBtn.click();
	  Alert alert=ldriver.switchTo().alert();
	  alert.accept();
  }

}