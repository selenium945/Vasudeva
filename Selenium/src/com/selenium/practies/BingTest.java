package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BingTest
{
	public static void main(String[] args) throws Exception
	{
		/*FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Bing.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("News")).click();
		
		//driver.findElement(By.partialLinkText("New")).click();
*/		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Google.co.in");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Images")).click();

	}

}
