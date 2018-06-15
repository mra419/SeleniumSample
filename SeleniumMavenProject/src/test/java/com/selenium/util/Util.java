package com.selenium.util;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.maven.testbase.TestBase;



public class Util extends TestBase {


	public static void waitForElement(String elementlocator){
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementlocator)));
		
	}
	

}
