package com.selenium.testscripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.selenium.maven.testbase.TestBase;



public class TestCase2 extends TestBase {


	@Test(retryAnalyzer = com.selenium.listeners.RetryListener.class)
	public void testTestCase1(){
		
		//System.out.println("Testcase2");
		Assert.assertEquals("abc","xyz");
		
		
	}

}
