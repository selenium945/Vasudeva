package com.selenium.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetTest 
{

	public static void main(String[] args) 
	{
		
		//ArrayList<String> l=new ArrayList<>();
		//List<String> l=new ArrayList<>();
		
		//HashSet<String> h=new HashSet<>();
		
		Set<String> h=new HashSet<>();
		
		h.add("VasuDeva");
		h.add("Qedge");
		h.add("Technologies");
		h.add("Qedge");
		System.out.println(h.size());
		
		/*Iterator<String> it=h.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		*/
		
		for (String item : h) 
		{
			System.out.println(item);
		}
	}

}
