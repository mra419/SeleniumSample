package com.selenium.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium.maven.testbase.TestBase;

public class TestCase4 extends TestBase {

	
	@Test
	public void colorTest(){
		
		String element_color = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a")).getCssValue("color");
		
		System.out.println(element_color);
		
		String[] rgb = element_color.replace("rgba(", "").replace(")","").split(",");
		
		for(int i = 0; i<rgb.length;i++){
			
			System.out.println(rgb[i]);
			
		}
		
		int r = Integer.parseInt(rgb[0].trim());
		int g = Integer.parseInt(rgb[1].trim());
		int b = Integer.parseInt(rgb[2].trim());
		
		
		String hex = "#"+Integer.toHexString(r)+Integer.toHexString(g)+Integer.toHexString(b);
		
		System.out.println("Hex equivalent color = "+hex);
		
		
		WebElement element = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));
		
		Point point = element.getLocation();
		
		System.out.println("X="+ point.x +" "+"Y="+ point.y);

		
		Dimension dim = element.getSize();
		
		System.out.println(dim.height +","+ dim.width);
		
	}
	


}
