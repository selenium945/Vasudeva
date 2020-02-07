package com.selenium.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizationTest 
{

	@Test(dataProvider="getData")
	public void adminLogin(String username,String password,String name)
	{
		System.out.println("usernane is : "+username);
		System.out.println("password is : "+password);
		System.out.println("Name is : "+name);
	}

	@DataProvider
	
	public Object[][]  getData()
	{
		
		Object [] [] data=new Object [1][3];
		
		data[0][0]="Vasu";
		data[0][1]="Qedge";
		data[0][2]="Selenium";
		return data;
	}
}
