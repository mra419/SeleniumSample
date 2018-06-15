package com.selenium.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer {

	int counter = 0;
	int retry = 3;
	
	
	public boolean retry(ITestResult result) {
		
		if(counter<retry){
			counter++;
			return true;
		}else
		  return false;
	}

}
