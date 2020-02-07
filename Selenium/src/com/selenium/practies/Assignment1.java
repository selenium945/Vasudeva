package com.selenium.practies;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws Exception 
	
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*//day
		WebElement day=driver.findElement(By.id("day"));
		List<WebElement> dayList=day.findElements(By.tagName("option"));
		//System.out.println(dayList.size());
		
		for (int i = 0; i < dayList.size(); i++)
		{
			//
			if(dayList.get(i).getText().equals("18"))
			{
				dayList.get(i).click();
			}
		}
		//month
		
		WebElement month=driver.findElement(By.id("month"));
		List<WebElement> monthList=month.findElements(By.tagName("option"));
		//System.out.println(monthList.size());
		
		for (int i = 0; i < monthList.size(); i++)
		{
			//
			if(monthList.get(i).getText().equals("Mar"))
			{
				monthList.get(i).click();
			}
		}
		//year
		WebElement year=driver.findElement(By.id("year"));
		List<WebElement> yearList=year.findElements(By.tagName("option"));
		//System.out.println(yearList.size());
		
		for (int i = 0; i < yearList.size(); i++)
		{
			//
			if(yearList.get(i).getText().equals("2017"))
			{
				yearList.get(i).click();
			}
		}*/
		
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("18");
		
		//Thread.sleep(3000);
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Apr");
		//Thread.sleep(3000);
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("2018");
		

	}

}
