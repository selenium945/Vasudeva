package com.selenium.practies;

import org.openqa.selenium.firefox.FirefoxDriver;

public class PageSourceTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Google.co.in");
		driver.manage().window().maximize();
		//capture the page source 
		
		System.out.println(driver.getPageSource());

	}

}
