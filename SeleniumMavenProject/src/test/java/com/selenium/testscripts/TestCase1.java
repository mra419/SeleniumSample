package com.selenium.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.selenium.excelUtil.xlsreader;
import com.selenium.maven.testbase.TestBase;
import com.selenium.util.Util;

public class TestCase1 extends TestBase {

	
	@Test(dataProvider = "testdata")
	public void testTestCase1(String search){
		
		
		
		Util.waitForElement("//input[@name='search_query']");
		
		getElement("//input[@name='search_query']").sendKeys(search);
				
		getElement("//button[@name='submit_search']").click();
		
		
	}
	
	
	@DataProvider(name = "testdata")
	public static Object[][] gettestdata(){
		
		xlsreader xlr = new xlsreader(System.getProperty("user.dir")+"\\xls\\TestData.xlsx");
		
		
		 Object[][] testd= xlr.getData("TestData");
		 
		 return testd;
		
         // return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};
		
		
	}
	
	
	


}
