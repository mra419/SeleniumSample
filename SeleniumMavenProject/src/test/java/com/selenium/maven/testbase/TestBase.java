package com.selenium.maven.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	
	public static WebDriver driver = null;
	
	
	@BeforeSuite
	public static void getDriver(){
		
			
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\lib\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
	}
	
	
	public static WebElement getElement(String elementloc){
		
		return driver.findElement(By.xpath(elementloc));
		
		
		
		 
		
		
	}
	
	
	@AfterSuite
	public void teardown(){
		
		driver.quit();
	}
	
	
	


}


