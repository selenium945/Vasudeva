package com.selenium.java;

public class StringValidationTest {

	public static void main(String[] args) 
	{
	
		/*String data="Selenium";
		String data1="Selenium";
		
		if(data.equals(data1))//true
		{
			System.out.println("Both are equal");
		}else
		{
			System.out.println("Both are not equal");
		}*/
		String data="New Branch with id 148 created Sucessfully";
		String data1="created Sucessfully";
		
		if(data.contains(data1))//true
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Failed");
		}
		

	}

}
