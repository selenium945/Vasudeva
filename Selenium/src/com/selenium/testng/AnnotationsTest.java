package com.selenium.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationsTest 
{

	
	@Test
	public void method1()
	{
		System.out.println("Method1 Executed");
	}
	@Test
	public void method2()
	{
		System.out.println("Method2 Executed");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod Executed");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod Executed");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass Executed");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass Executed");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("BeforeSuite Executed");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("afterSuite Executed");
	}
}
