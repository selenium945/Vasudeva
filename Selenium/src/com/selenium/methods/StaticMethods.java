package com.selenium.methods;

public class StaticMethods 
{

	//static method with return type with parameters
	
	public static int  add(int a,int b)
	{
		
		int sum=a+b;
		
		return sum;
	}
	
	public static void main(String[] args) 
	{
		//No need to create object ref for calling static methods
		//here calling static methods -->classname.methodname
		
		//StaticMethods.add(20, 60);//calling with methodname
		int res=StaticMethods.add(20, 60);
		System.out.println(res);

	}

}
