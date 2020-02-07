package com.selenium.methods;

public class Method2
{
//method with return-type without parameters
	
	public  int  add()
	{
		int a=30;
		int b=40;
		
		int sum=a+b;
		
		return sum;
	}
	
	
	public static void main(String[] args)
	{
		Method2 ns=new Method2();
		//ns.add();//calling a method with method name, it won't return a value
		int res=ns.add();//calling a method with Variable,it will return a value
		
		System.out.println(res);

	}

}
