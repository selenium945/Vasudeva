package com.selenium.testng;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class PrimusBank 
{
	ChromeDriver driver;
	@BeforeSuite
	public void appLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.navigate().to("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		//validation
		
		Assert.assertTrue(driver.findElement(By.id("txtuId")).isDisplayed());
	}
	
	@BeforeTest
	public void appLogin()
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		
		driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
	}
	
	@AfterTest
	public void appLogout()
	{
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
	}
	
	@AfterSuite
	public void appClose()
	{
		driver.close();
	}
	
}
