package com.selenium.java;

public class SwitchStatement
{
	public static void main(String[] args)
	
	{
		// TO print weekday names  for a given number
		
		int n=2;
				
		/*switch (n) //4
		{
		case 1://false
			System.out.println("Monday");
			break;
		case 2://false
			System.out.println("Tuesday");
			break;
		case 3://false
			System.out.println("Wednessday");
			break;
		case 4://true
			System.out.println("Thursday");//Thursday
			break;	//terminate/stop
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("out of range");
			break;
		}*/		

		if(n==1)//false
		{
			System.out.println("M");
		}
		if(n==2)//true
		{
			System.out.println("Tue");// true
		}//stop
		if(n==3)
		{
			System.out.println("Wednessday");
		}
	}

}
