package com.selenium.testng;

import org.testng.annotations.Test;

public class MultipletestCases
{
	@Test(priority=1)
	public void applaunch()
	{
		System.out.println("appLaunch Executed");
	}
	
	@Test
	public void appLogin()
	{
		System.out.println("appLogin Executed");
	}
	@Test
	public void appClose()
	{
		System.out.println("appClose Executed");
	}
}
