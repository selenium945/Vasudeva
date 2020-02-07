package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("Http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("u_0_6")).click();

	}

}
