package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class KsrtcTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/ul[1]/li[2]/a")).click();

	}

}
