package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OhrmLoginTest 
{

	public static void main(String[] args) throws Exception
	{
		// appLaunch
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println("appLaunch Successfully");
		//validation
		//appLogin
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("AppLogin Pass");
		
		//validation
		
		//appLogout
		Thread.sleep(2000);
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("appLogout pass");
		//validation
		//appClose
		
		driver.close();
		
		System.out.println("appClose pass");

	}

}
