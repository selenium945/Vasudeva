package com.selenium.practies;

import java.awt.Frame;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodsTest 
{

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://facebook.com/");
		driver.manage().window().maximize();
		
		WebElement month=driver.findElement(By.id("month"));
		
		Select sl=new Select(month);
		
		sl.selectByIndex(5);
		//sl.selectByIndex(6);
		//sl.selectByVisibleText("Sept");
		//sl.selectByValue("3");
		
		/*List<WebElement> monthList=sl.getOptions();
		System.out.println(monthList.size());
		
		for (WebElement item : monthList)
		{
			System.out.println(item.getText());
		}*/
		
		//verify is it possible to select multiple items or not??
		
		//System.out.println(sl.isMultiple());
		
		//capture the first selected item from the drop down
		
		//System.out.println(sl.getFirstSelectedOption().getText());
		
		//capture the multiple selected  item from the drop down
		
		/*List<WebElement>   selecteditems=sl.getAllSelectedOptions();
		System.out.println(selecteditems.size());
		
		for (int i = 0; i < selecteditems.size(); i++) 
		{
			System.out.println(selecteditems.get(i).getText());
		}*/
		
		
		
		
		
		

	}

}
