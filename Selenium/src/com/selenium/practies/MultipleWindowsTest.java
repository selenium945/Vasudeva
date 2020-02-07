package com.selenium.practies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		
	/*String homePage=driver.getWindowHandle();
	System.out.println(homePage);*/
		
		//capturing all the window id's
		Set<String> windows=driver.getWindowHandles();
		
		System.out.println(windows.size());
		
		
		/*for (String child : windows)
		{
			System.out.println(child);
		}*/
		
		/*Iterator<String> it=windows.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next().toString());
		}*/
		
		//close one by one window
		
		/*for (String child : windows) 
		{
			//giving focus to particular window
			
			driver.switchTo().window(child);
			
			//System.out.println(driver.getTitle());
			
			//driver.close();
			
			if(!driver.getTitle().equals("Prokarma"))
			{
				driver.close();
			}
		}*/
		
		List<String> tabs=new ArrayList(windows);
		
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(tabs.get(1));
		
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.switchTo().window(tabs.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(tabs.get(3));
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
