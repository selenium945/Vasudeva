package com.selenium.methods;

public class NStaticMethods 
{
	//method with return-type with parameter
	
	
	public int add(int a,int b)
	{
		int sum=a+b;
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		// Object
		NStaticMethods ns=new NStaticMethods();
		
		//ns.add(20, 20);//calling a method with method name,it won't return a value
		
		int res=ns.add(20, 30);//calling a method with variable,it will return a value
		System.out.println(res);
	}

}
