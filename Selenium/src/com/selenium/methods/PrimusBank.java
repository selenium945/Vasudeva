package com.selenium.methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimusBank
{
	FirefoxDriver driver;
	String res;
	//appLaunch
	
	public String  appLaunch(String url)
	{
		driver=new FirefoxDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		//validation
		
		if (driver.findElement(By.id("txtuId")).isDisplayed())
		{
			//System.out.println("Pass");
			res="Pass";
		}else
		{
			//System.out.println("Fail");
			res="Fail";
		}
		
		return res;
		
	}
	
	
	//appLogin
	
	public String appLogin(String username,String password)
	{
		driver.findElement(By.id("txtuId")).sendKeys(username);
		
		driver.findElement(By.name("txtPword")).sendKeys(password);
		
		driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
		//validation
		
		if (driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed())
		{
			res="Pass";
		}else
		{
			//System.out.println("Fail");
			res="Fail";
		}
		return res;
	}
	
	
	//branchCreation
	
	public  String   branchCreation(String branchName,String add) throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewBR")).click();
		
		driver.findElement(By.id("txtbName")).sendKeys(branchName);
		driver.findElement(By.id("txtAdd1")).sendKeys(add);
		driver.findElement(By.id("txtZip")).sendKeys("66666");
		
		
		Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
		country.selectByIndex(1);
		
		Thread.sleep(3000);
		Select state=new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByIndex(1);
		Thread.sleep(3000);
		Select city=new Select(driver.findElement(By.id("lst_cityI")));
		city.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.id("btn_insert")).click();
		Thread.sleep(3000);
		
		Alert al=driver.switchTo().alert();
		
		String msg=al.getText();
		
		al.accept();
		
		//validation
		
		if(msg.contains("created Sucessfully"))
		{
			//System.out.println("Pass");
			res="Pass";
		}else
			if(msg.contains("Please fill in"))
			{
				//System.out.println("Warning");
				res="Warning";
			}else
				if(msg.contains("already Exist"))
				{
					//System.out.println("Fail");
					res="Fail";
				}
		
		
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
		Thread.sleep(2000);
		return res;
	}
	
	//appLogout
	
	public String  appLogout()
	{
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		//validation
		if (driver.findElement(By.id("txtuId")).isDisplayed())
		{
			
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
	}
	
	//appClose
	
	public void appClose()
	{
		driver.close();
	}
	public static void main(String[] args) throws Exception
	{

		PrimusBank app=new PrimusBank();
		
		/*app.appLaunch("http://PrimusBank.qedgetech.com");
		
		app.appLogin("Admin", "Admin");
		
		app.appLogout();
		app.appClose();*/
		
		
		//appLaunch
		//app.appLaunch("http://PrimusBank.qedgetech.com");
		//app.appClose();
		
		//adminLogin
		
		//app.appLaunch("http://PrimusBank.qedgetech.com");
		
		//app.appLogin("Admin", "Admin");
		
		//app.appLogout();
		//app.appClose();
		
		//branchCreation
		app.appLaunch("http://PrimusBank.qedgetech.com");
		
		app.appLogin("Admin", "Admin");
		
		app.branchCreation("Qedge4321", "Ameerpet");
		
		app.appLogout();
		app.appClose();
		
	}

}
