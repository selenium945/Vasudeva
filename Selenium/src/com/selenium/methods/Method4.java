package com.selenium.methods;

public class Method4
{
//method with-out return-type with-out parameters
	
	public  void  add()
	{
		int a=30;
		int b=40;
		
		int sum=a+b;
		
		System.out.println(sum);
	}
	
	
	public static void main(String[] args)
	{
		Method4 ns=new Method4();
		ns.add();//calling a method with method name, it won't return a value
		/*int res=ns.add();//calling a method with Variable,it will return a value
		
		System.out.println(res);*/

	}

}
