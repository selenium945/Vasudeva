package com.selenium.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) 
	{
		
		/*List<String> l=new ArrayList<>();
		
		//insert data into arrayList
		l.add("Selenium");
		l.add("Training");
		l.add("Qedge");
		l.add("Technologies");
		l.add("Selenium");
		System.out.println(l.size());
		
		for (int i = 0; i < l.size(); i++) 
		{
			System.out.println(l.get(i));
		}
		//for each loop
		for(String item:l)
		{
			System.out.println(item);
		}*/
		
		/*List<Integer> k=new ArrayList<>();
		k.add(12);
		k.add(34);
		
		System.out.println(k.size());
		//foreach loop
		
		for(int s:k)
		{
			System.out.println(s);
		}*/
		
		List<Object> l=new ArrayList<>();
		l.add("Selenium");
		l.add(12.45);
		l.add(23);
		l.add('C');
		
		
		System.out.println(l.size());
		
		for(Object item: l)
		{
			System.out.println(item);
		}
		
	}

}
