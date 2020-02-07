package com.selenium.java;

import com.selenium.methods.Method2;
import com.selenium.methods.StaticMethods;

public class AdditionTest 
{

	public static void main(String[] args)
	{
		Method2 ns=new Method2();
		int res=ns.add();
		System.out.println(res);
		//reusing static methods
		
		StaticMethods.add(20, 60);
	}

}
