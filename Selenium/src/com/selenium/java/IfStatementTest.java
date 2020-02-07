package com.selenium.java;

import java.util.Scanner;

public class IfStatementTest {

	public static void main(String[] args) 
	{
		// To Check the given no is Even/Odd
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int n=46;
		
		if(n%2==0)//true/false
		{
			System.out.println("Even");//if-blok
		}else
		{
			System.out.println("Odd");//else-block
		}

	}

}
