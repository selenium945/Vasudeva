package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTest1 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("Http://Google.co.in");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			//System.out.println(links.get(i).getText());
			
			//capturing links which have text only
			if(!links.get(i).getText().isEmpty())
			{
				System.out.println(links.get(i).getText());
			}
		}

	}

}
