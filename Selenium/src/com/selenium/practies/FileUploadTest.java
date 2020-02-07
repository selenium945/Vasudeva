package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadTest {

	public static void main(String[] args) throws Exception 
	{
		
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		//empCreation
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("Vasudeva");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("Qedge");
		//uploading file by using sendKeys
		
		//driver.findElement(By.id("photofile")).sendKeys("D:\\Desert.jpg");
		
		//uploading a file by using Auto it
		driver.findElement(By.id("photofile")).click();
		
		Thread.sleep(2000);
		
		//auto it 
		
		Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\fupload.exe");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnSave")).click();
		//validation
		
		if(driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).isDisplayed())
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
		

	}

}
