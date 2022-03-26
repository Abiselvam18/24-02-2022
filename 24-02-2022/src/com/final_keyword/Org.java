package com.final_keyword;

//super/base/parent class

//3. final keyword with class
//public final class Organization

public class Org
{
	
	//1. final keyword with variable
	//final int id = 8900;
	int id;
	String name;
	
	public Org() 
	{	
		id = 2000;//The final field Organization.id cannot be reassigned
		name = "Infosys";
	}
	
	//2. final keyword with method
	
	//Cannot override the final method into sub class
	//public final void getInformation()
	public void getInformation()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
}
