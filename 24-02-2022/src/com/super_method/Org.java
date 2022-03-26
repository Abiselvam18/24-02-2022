package com.super_method;

//super/base/parent class
public class Org
{
	int id;
	String name;
		
	public Org() 
	{	
		id = 2000;
		name = "Edubridge";
		System.out.println("Organization class constructor");
	}
	
	public void getOrgInfo()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
}

