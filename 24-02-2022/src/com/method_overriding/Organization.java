package com.method_overriding;

//Super/Base/Parent class
public class Organization
{
	int id;
	String name;
	
	public Organization() 
	{	
		id = 2110;
		name = "TechM";
	}
	
	public void getInformation()//method
	{
		System.out.println(id);
		System.out.println(name);
	}
	
}
