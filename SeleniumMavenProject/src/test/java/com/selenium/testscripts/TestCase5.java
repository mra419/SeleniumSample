package com.selenium.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.selenium.maven.testbase.TestBase;

public class TestCase5 extends TestBase {
	
	
	
	@Test
	public void test() throws InterruptedException{
	WebElement element = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));
	
	Actions action = new Actions(driver);
	
    Action a = action.contextClick(element).pause(3000).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build();
    
    a.perform();
    
    Thread.sleep(5000);
    
    
	}
  
}
