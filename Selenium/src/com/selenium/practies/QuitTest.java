package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuitTest
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.className("mTxt")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/a/div")).click();
		
		//driver.close();
		//driver.quit();

	}

}
