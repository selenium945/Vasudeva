package com.selenium.practies;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonTest 
{

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		
		driver.findElement(By.className("nav-input")).click();
		//capture the title of the page
		System.out.println(driver.getTitle());
		//capture the url of the page
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		
		//capture the title of the page
				System.out.println(driver.getTitle());
				//capture the url of the page
				System.out.println(driver.getCurrentUrl());

	}

}
