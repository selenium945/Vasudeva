package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//capturing frames count
		
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		
		System.out.println(frames.size());
		
		//give the control to the particular frame
		//1. based on index
		
		//driver.switchTo().frame(0);
		//2. based on string
		//driver.switchTo().frame(driver.findElement(By.xpath(".//*[@id='content']/iframe")));
		//3. Based on WebElement
		
		WebElement fr=driver.findElement(By.xpath(".//*[@id='content']/iframe"));
		
		driver.switchTo().frame(fr);
		
		WebElement drg=driver.findElement(By.id("draggable"));
		
		WebElement drp=driver.findElement(By.id("droppable"));
		
		
		Actions dAd=new Actions(driver);
		
		dAd.dragAndDrop(drg, drp).perform();
		//give the control to the previous html document
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='content']/h1")).getText());

	}

}
