package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Yahoo.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
		driver.findElement(By.id("uh-search-button")).click();
		
		//capture the title of the page
		
		System.out.println(driver.getTitle());
		
		//Capture the Url of the Page
		
		System.out.println(driver.getCurrentUrl());
		
		
		driver.navigate().back();
		
		//capture the title of the page
		
				System.out.println(driver.getTitle());
				
				//Capture the Url of the Page
				
				System.out.println(driver.getCurrentUrl());
				
				
				driver.navigate().forward();
		

	}

}
