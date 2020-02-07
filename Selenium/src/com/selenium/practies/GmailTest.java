package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Google.co.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("gb_g")).click();
		
		//validation
		
		if(driver.findElement(By.id("identifierId")).isDisplayed())
		{
			System.out.println("Link is working");
		}else
		{
			System.out.println("Link is Not Working");
		}

	}

}
