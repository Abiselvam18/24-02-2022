package com.super_keyword;

//super/base/parent class
public class Org
{
	int id;
	String name;
	
	public Org() 
	{	
		id = 2001;
		name = "Infosys";
	}
	
	public void getOrganizationInformation()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
}
