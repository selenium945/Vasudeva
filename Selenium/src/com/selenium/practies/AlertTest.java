package com.selenium.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest
{

	public static void main(String[] args) throws Exception 
	{
		/*FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		//html alert /pop up
		
		//driver.findElement(By.xpath(".//*[@id='popupBoxClose']")).click();
*/
		 
		//handling  java script alerts
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
			
		//appLogin
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		//driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(2000);
		
		Alert  al=driver.switchTo().alert();
		
		System.out.println(al.getText());
		
		al.accept();
		//al.accept();//ok
		//al.dismiss();//cancel
	//	al.getText();//capture text
	//	al.sendKeys("");//enter text
		
		
	}

}
