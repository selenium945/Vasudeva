package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxTest
{

	public static void main(String[] args) 
	{
		

		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		//click on checkbox
		
		//driver.findElement(By.id("remember")).click();
		
		System.out.println(driver.findElement(By.id("remember")).getAttribute("checked"));
		//validation
		
		if(driver.findElement(By.id("remember")).isSelected())
		{
			driver.findElement(By.id("remember")).click();	
			System.out.println(driver.findElement(By.id("remember")).getAttribute("checked"));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
