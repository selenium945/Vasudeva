package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement sign=driver.findElement(By.id("nav-link-accountList"));
		
		WebElement ywl=driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[3]/span"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(sign).moveToElement(ywl).click().perform();
		
		
	}
}
