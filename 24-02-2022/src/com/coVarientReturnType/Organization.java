package com.coVarientReturnType;

//Super/Base/Parent class
public class Organization
{
	int id;
	String name;
	
	public Organization() 
	{	
		id = 101;
		name = "TCS";
	}
	
	public Organization getInformation()//method return type is void
	{
		System.out.println(id);
		System.out.println(name);
		
		return null;
	}
	
}
