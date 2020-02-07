package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLogin
{

	public static void main(String[] args) 
	{
		
		String expTitle="Primus BANK";
		String expUrl="http://primusbank.qedgetech.com/adminflow.aspx";
		String username="Admin";
		
		String password="Admin";
		//appLaunch
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		String actTitle=driver.getTitle();
		//validation
		if (expTitle.equals(actTitle)) 
		{
			System.out.println("AppLaunch Successfully");
		}else
		{
			System.out.println("AppLaunch Failed");
		}
		
		//appLogin
		driver.findElement(By.id("txtuId")).sendKeys(username);
		
		driver.findElement(By.name("txtPword")).sendKeys(password);
		
		driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
		String actUrl=driver.getCurrentUrl();
		
		//validation
		if (expUrl.equals(actUrl))
		{
			System.out.println("AppLogin pass");
		}else
		{
			System.out.println("appLogin Fail");
		}
		//applogout
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		
		
		//validation
		
		if(driver.findElement(By.id("txtuId")).isDisplayed())//true
		{
			System.out.println("AppLogout pass");
		}else
		{
			System.out.println("AppLogout Fail");
		}
		//appClose
		driver.close();
	}

}
