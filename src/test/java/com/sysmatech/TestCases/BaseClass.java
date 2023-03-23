package com.sysmatech.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.sysmatech.utilities.Readconfig;
 
public class BaseClass {
	Readconfig readconfig=new Readconfig();
	

	public String baseUrl=readconfig.getApplicationUrl();
	public String username=readconfig.getusername();
	public String password=readconfig.getpassword();
    public static WebDriver driver;
	
     @Parameters("browser")
     @BeforeClass
	public void setUp(String br) {
    	 
     	
    	 
    	 if(br.equals("chrome"))
    	    {
    		    System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
    		    ChromeOptions co=new ChromeOptions();
    		    co.addArguments("--remote-allow-origins=*");
    			driver= new ChromeDriver(co);
    			driver.manage().window().maximize();
    			driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
    			driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
    	     }
    	 else if(br.equals("firefox")) {
    		 System.setProperty("webdriver.gecko1.driver",readconfig.getfirefoxpath());
    		driver= new FirefoxDriver();
    		driver.manage().window().maximize();
    		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
    	 }
    	 else if(br.equals("ie")) {
    		 System.setProperty("webdriver.ie.driver",readconfig.getiepath());
    			driver= new EdgeDriver();
    			driver.manage().window().maximize();
    			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
    			driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);

    	 }
    	 
    	 driver.get(baseUrl);
    	

    	 
     }
     
     @AfterClass
 	public void tearDown()
 	{
 		driver.quit();
 	}
    
     public void captureScreen(WebDriver driver , String tname) throws IOException {
    	 
    	 TakesScreenshot tc=(TakesScreenshot)driver;
    	 File source=tc.getScreenshotAs(OutputType.FILE);
    	 File target=new File(System.getProperty("user.dir") +"/ScreenShots/"+tname+"l.png");
    	 FileUtils.copyFile(source, target);
    	 System.out.println("ScreenShot Taken");
     }
     public String randomstring() {
    	 String generatestring=RandomStringUtils.randomAlphabetic(8); 
		return(generatestring);	 
     }
     public static String randomNum() {
    	 String generatrstring2=RandomStringUtils.randomNumeric(4);
		return(generatrstring2);
		
    	 
     }
    	 
		
	}





  