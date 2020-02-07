package com.selenium.methods;

public class Method3
{
//method with-out return-type with parameters
	
	public  void  add(int a,int b)
	{
		
		
		int sum=a+b;
		
		System.out.println(sum);
	}
	
	
	public static void main(String[] args)
	{
		Method3 ns=new Method3();
		ns.add(40,50);//calling a method with method name, it won't return a value
		/*int res=ns.add(20,20);//calling a method with Variable,it will return a value
		
		System.out.println(res);*/

	}

}
