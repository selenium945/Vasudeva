package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownTest1 {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("Http://amazon.in");
		driver.manage().window().maximize();
		
		//WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		List<WebElement> dropList=driver.findElements(By.xpath("//*[@id='searchDropdownBox']/option"));
		
		System.out.println(dropList.size());
		
		for (int i = 0; i < dropList.size(); i++) 
		{
			//capture all names
			
			//System.out.println(dropList.get(i).getText());
			
			//select one by one item from dropdown
			
			//dropList.get(i).click();
			
			//select particular item from dropdown
			
			if(dropList.get(i).getText().equals("Baby"))
			{
				dropList.get(i).click();
			}
		}

	}

}
