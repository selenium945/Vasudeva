package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AdminLoginTest 
{
@Test
public void adminLogin()
{
	String expTitle="Primus BANK";
	String expUrl="http://primusbank.qedgetech.com/adminflow.aspx";
	String username="Admin";
	
	String password="Admin";
	//appLaunch
	FirefoxDriver driver=new FirefoxDriver();
	driver.navigate().to("http://primusbank.qedgetech.com/");
	driver.manage().window().maximize();
	//appLogin
			driver.findElement(By.id("txtuId")).sendKeys(username);
			
			driver.findElement(By.name("txtPword")).sendKeys(password);
			
			driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
}
}
