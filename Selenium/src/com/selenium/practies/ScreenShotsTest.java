package com.selenium.practies;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotsTest
{

	public static void main(String[] args) throws Exception 
	
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		TakesScreenshot  ts=(TakesScreenshot)driver;
		
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile, new File("C:\\Users\\vasu\\Desktop\\ScreenShots\\vasu.png"));
		
		

	}

}
