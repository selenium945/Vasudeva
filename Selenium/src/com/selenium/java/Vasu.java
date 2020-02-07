package com.selenium.java;

public class Vasu 
{
//variable
	
	int i=20;
	
	//method
	
	public void add()
	{
		int a=50;
		int b=30;
		
		int sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		// Object
		
		Vasu v=new Vasu();
		
		v.add();//method
		System.out.println(v.i);//variable

	}

}
